package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.domain.ReservacionModule;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * 
 * Controlador de pagina para establecer los valores inciales al agregar una reservacion.
 *
 */
public class AgregarReservacion extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ReservacionModule module = (ReservacionModule) context
				.getBean("reservacionModule");
		try {

			ReservacionDTO dto = new ReservacionDTO();

			dto.id = -1;
			dto.habitacionId = 0;
			dto.fechaEntrada = "";
			dto.fechaSalida = "";
			dto.ocupacion = 0;
			dto.monto = 0;
			dto.identificacionCliente = "";

			request.setAttribute("reservacion", dto);
			forward("/detalleReservacion.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}