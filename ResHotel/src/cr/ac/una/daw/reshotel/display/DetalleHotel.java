package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.HotelAssembler;
import cr.ac.una.daw.reshotel.assembler.UbicacionAssembler;
import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.domain.UbicacionModule;
import cr.ac.una.daw.reshotel.dto.HotelDTO;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class DetalleHotel extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context
				.getBean("hotelModule");
		UbicacionModule ubicacionModule = (UbicacionModule) context.getBean("ubicacionModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			HotelRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Hotel no se ha podido cargar");
			}

			HotelDTO dto = HotelAssembler.create(obj);

			request.setAttribute("hotel", dto);
			
			// -- Lista ubicaciones -----------------------------------------------------
			List<UbicacionRowGateway> dataUbicaciones = ubicacionModule.listado();
			List<UbicacionDTO> dtoDataUbicaciones = new ArrayList<UbicacionDTO>();
			
			for(UbicacionRowGateway ubicacion : dataUbicaciones){
				dtoDataUbicaciones.add(UbicacionAssembler.create(ubicacion));
			}
			
			request.setAttribute("ubicaciones", dtoDataUbicaciones);
			// --------------------------------------------------------------------------
			
			forward("/detalleHotel.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}