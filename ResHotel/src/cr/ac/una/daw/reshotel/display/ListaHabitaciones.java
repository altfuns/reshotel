package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.HabitacionAssembler;
import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.domain.HabitacionModule;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

/**
 * 
 * Controlador de pagina para establecer los datos de la lista de habitaciones
 *
 */
public class ListaHabitaciones extends PageController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HabitacionModule module = (HabitacionModule) context
				.getBean("habitacionModule");
		try {
			List<HabitacionRowGateway> data = module.listado();
			List<HabitacionDTO> dtoData = new ArrayList<HabitacionDTO>();

			for (HabitacionRowGateway obj : data) {
				dtoData.add(HabitacionAssembler.create(obj));
			}

			request.setAttribute("habitaciones", dtoData);
			forward("/listaHabitaciones.jsp", request, response);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}