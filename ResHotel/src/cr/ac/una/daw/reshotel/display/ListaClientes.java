package cr.ac.una.daw.reshotel.display;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import cr.ac.una.daw.reshotel.assembler.ClienteAssembler;
import cr.ac.una.daw.reshotel.data.ClienteRowGateway;
import cr.ac.una.daw.reshotel.domain.ClienteModule;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

/**
 * 
 * Controlador de pagina para establecer los datos de la lista de clientes
 *
 */
public class ListaClientes extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteModule module = (ClienteModule) context.getBean("clienteModule");
		try {
			List<ClienteRowGateway> data = module.listado();
			List<ClienteDTO> dtoData = new ArrayList<ClienteDTO>();
			
			for(ClienteRowGateway obj : data){
				dtoData.add(ClienteAssembler.create(obj));
			}
			
			request.setAttribute("clientes", dtoData);
			forward("/listaClientes.jsp", request, response);
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}