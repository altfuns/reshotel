package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.ClienteAssembler;
import cr.ac.una.daw.reshotel.assembler.UbicacionAssembler;
import cr.ac.una.daw.reshotel.data.ClienteRowGateway;
import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;
import cr.ac.una.daw.reshotel.domain.ClienteModule;
import cr.ac.una.daw.reshotel.domain.UbicacionModule;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class AgregarCliente extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteModule module = (ClienteModule) context.getBean("clienteModule");
		UbicacionModule ubicacionModule = (UbicacionModule) context.getBean("ubicacionModule");
		try {
			ClienteDTO dto = new ClienteDTO();

			dto.id = -1;
			dto.identificacion = "";
			dto.nombre = "";
			dto.telefono = "";
			dto.numeroTarjetaCredito = 0;
			
			request.setAttribute("cliente", dto);
				
			// -- Lista ubicaciones -----------------------------------------------------
			List<UbicacionRowGateway> dataUbicaciones = ubicacionModule.listado();
			List<UbicacionDTO> dtoDataUbicaciones = new ArrayList<UbicacionDTO>();
			
			for(UbicacionRowGateway obj : dataUbicaciones){
				dtoDataUbicaciones.add(UbicacionAssembler.create(obj));
			}
			
			request.setAttribute("ubicaciones", dtoDataUbicaciones);
			// --------------------------------------------------------------------------

			forward("/detalleCliente.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}