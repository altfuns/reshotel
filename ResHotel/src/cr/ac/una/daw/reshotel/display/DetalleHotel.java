package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.HotelAssembler;
import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class DetalleHotel extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context
				.getBean("hotelModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			HotelRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Hotel no se ha podido cargar");
			}

			HotelDTO dto = HotelAssembler.create(obj);

			request.setAttribute("hotel", dto);
			forward("/detalleHotel.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}