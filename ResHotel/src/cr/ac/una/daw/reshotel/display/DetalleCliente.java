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

public class DetalleCliente extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteModule module = (ClienteModule) context.getBean("clienteModule");
		UbicacionModule ubicacionModule = (UbicacionModule) context.getBean("ubicacionModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			ClienteRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Cliente no se ha podido cargar");
			}

			ClienteDTO dto = ClienteAssembler.create(obj);

			request.setAttribute("cliente", dto);
		
			// -- Lista ubicaciones -----------------------------------------------------
			List<UbicacionRowGateway> dataUbicaciones = ubicacionModule.listado();
			List<UbicacionDTO> dtoDataUbicaciones = new ArrayList<UbicacionDTO>();
			
			for(UbicacionRowGateway ubicacion : dataUbicaciones){
				dtoDataUbicaciones.add(UbicacionAssembler.create(ubicacion));
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