package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.HabitacionAssembler;
import cr.ac.una.daw.reshotel.assembler.ReservacionAssembler;
import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;
import cr.ac.una.daw.reshotel.domain.HabitacionModule;
import cr.ac.una.daw.reshotel.domain.ReservacionModule;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * 
 * Controlador de pagina para establecer los valores de una reservacion.
 *
 */
public class DetalleReservacion extends PageController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ReservacionModule module = (ReservacionModule) context
				.getBean("reservacionModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			ReservacionRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Reservacion no se ha podido cargar");
			}

			ReservacionDTO dto = ReservacionAssembler.create(obj);

			request.setAttribute("reservacion", dto);
			request.setAttribute("habitaciones", getHabitaciones());
			forward("/detalleReservacion.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}

	public List<HabitacionDTO> getHabitaciones() throws Exception {
		HabitacionModule module = (HabitacionModule) context
				.getBean("habitacionModule");
		List<HabitacionRowGateway> data = module.listado();
		List<HabitacionDTO> result = new ArrayList<HabitacionDTO>();

		for (HabitacionRowGateway obj : data) {
			result.add(HabitacionAssembler.create(obj));
		}

		return result;
	}
}