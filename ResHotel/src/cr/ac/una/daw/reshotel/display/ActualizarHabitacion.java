package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.HabitacionAssembler;
import cr.ac.una.daw.reshotel.domain.HabitacionModule;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

/**
 * Controlador de pagina para actualizar o insertar la informacion de la habitacion.
 *
 */
public class ActualizarHabitacion extends PageController {

	private static final long serialVersionUID = 7900939974504489200L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HabitacionModule module = (HabitacionModule) context
				.getBean("habitacionModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			HabitacionDTO dto = id == -1 ? new HabitacionDTO()
					: HabitacionAssembler.create(module.buscar(id));
			dto.ocupacionMaxima = Integer.parseInt(request
					.getParameter("ocupacionMaxima"));
			dto.numero = Integer.parseInt(request.getParameter("numero"));
			dto.mobiliario = request.getParameter("mobiliario");
			dto.costo = Double.parseDouble(request.getParameter("costo"));

			if (id == -1) {
				module.insertar(dto);
			} else {
				module.actualizar(dto);
			}

			response.sendRedirect("listaHabitaciones");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}