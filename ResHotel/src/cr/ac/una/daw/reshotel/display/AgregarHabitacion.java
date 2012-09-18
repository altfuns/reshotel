package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.domain.HabitacionModule;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

/**
 * 
 * Controlador de pagina para establecer los valores inciales al agregar una habitacion.
 *
 */
public class AgregarHabitacion extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HabitacionModule module = (HabitacionModule) context
				.getBean("habitacionModule");
		try {

			HabitacionDTO dto = new HabitacionDTO();
			
			dto.id = -1;
			dto.ocupacionMaxima = 0;
			dto.numero = 0;
			dto.mobiliario = "";
			dto.costo = 0;
			

			request.setAttribute("habitacion", dto);
			forward("/detalleHabitacion.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}