package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;
import cr.ac.una.daw.reshotel.domain.ReservacionModule;


/**
 * 
 * Controlador de pagina para eliminar una reservacion.
 *
 */
public class EliminarReservacion extends PageController {
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

			module.eliminar(id);

			response.sendRedirect("listaReservaciones");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}