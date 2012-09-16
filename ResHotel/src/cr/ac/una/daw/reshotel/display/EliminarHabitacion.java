package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.domain.HabitacionModule;


public class EliminarHabitacion extends PageController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HabitacionModule module = (HabitacionModule) context
				.getBean("habitacionModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			HabitacionRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Habitacion no se ha podido cargar");
			}

			module.eliminar(id);

			response.sendRedirect("listaHabitaciones");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}