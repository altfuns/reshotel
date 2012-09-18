package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.UbicacionAssembler;
import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.domain.UbicacionModule;
import cr.ac.una.daw.reshotel.dto.HotelDTO;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

/**
 * 
 * Controlador de pagina para establecer los valores inciales al agregar un hotel.
 *
 */
public class AgregarHotel extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HotelModule module = (HotelModule) context.getBean("hotelModule");
		UbicacionModule ubicacionModule = (UbicacionModule) context.getBean("ubicacionModule");
		try {

			HotelDTO dto = new HotelDTO();
			
			dto.id = -1;
			dto.telefono = "";
			dto.email = "";
			dto.clase = 0;
			dto.nombrePersonaEncargada = "";
			
			request.setAttribute("hotel", dto);
						
			// -- Lista ubicaciones -----------------------------------------------------
			List<UbicacionRowGateway> dataUbicaciones = ubicacionModule.listado();
			List<UbicacionDTO> dtoDataUbicaciones = new ArrayList<UbicacionDTO>();
			
			for(UbicacionRowGateway obj : dataUbicaciones){
				dtoDataUbicaciones.add(UbicacionAssembler.create(obj));
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