package cr.ac.una.daw.reshotel.display;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.domain.HotelModule;
/**
 * 
 * Controlador de pagina para eliminar un hotel.
 *
 */
public class EliminarHotel extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context.getBean("hotelModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			HotelRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Hotel no se ha podido cargar");
			}

			module.eliminar(id);

			response.sendRedirect("listaHoteles");
			/*
			 * List<HotelRowGateway> data = module.listado(); List<HotelDTO>
			 * dtoData = new ArrayList<HotelDTO>();
			 * 
			 * for (HotelRowGateway obj : data) {
			 * dtoData.add(HotelAssembler.Create(obj)); }
			 * 
			 * request.setAttribute("hoteles", dtoData);
			 * forward("/listaHoteles.jsp", request, response);
			 */
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}