package cr.ac.una.daw.reshotel.display;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import cr.ac.una.daw.reshotel.assembler.HotelAssembler;
import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class ListaHoteles extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context.getBean("hotelModule");
		try {
			List<HotelRowGateway> data = module.listado();
			List<HotelDTO> dtoData = new ArrayList<HotelDTO>();
			
			for(HotelRowGateway obj : data){
				dtoData.add(HotelAssembler.Create(obj));
			}
			
			request.setAttribute("hoteles", dtoData);
			forward("/listaHoteles.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}