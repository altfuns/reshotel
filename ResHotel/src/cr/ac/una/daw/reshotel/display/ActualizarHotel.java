package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.HotelAssembler;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class ActualizarHotel extends PageController {

	private static final long serialVersionUID = 7900939974504489200L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context
				.getBean("hotelModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			HotelDTO dto = id == -1 ? new HotelDTO()
					: HotelAssembler.create(module.buscar(id));
			
			dto.telefono = request.getParameter("telefono");
			dto.clase = Integer.parseInt(request.getParameter("clase"));
			dto.email = request.getParameter("email");
			dto.nombrePersonaEncargada = request.getParameter("nombrePersonaEncargada");

			if (id == -1) {
				module.insertar(dto);
			} else {
				module.actualizar(dto);
			}

			response.sendRedirect("listaHoteles");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}