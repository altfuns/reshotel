package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class AgregarHotel extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context.getBean("hotelModule");
		try {

			HotelDTO dto = new HotelDTO();
			
			dto.id = -1;
			dto.telefono = "";
			dto.email = "";
			dto.clase = 0;
			dto.nombrePersonaEncargada = "";
			
			request.setAttribute("hotel", dto);
			forward("/detalleHotel.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}