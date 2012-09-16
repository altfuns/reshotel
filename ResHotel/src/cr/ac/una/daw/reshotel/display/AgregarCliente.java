package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.domain.ClienteModule;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class AgregarCliente extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteModule module = (ClienteModule) context
				.getBean("clienteModule");
		try {

			ClienteDTO dto = new ClienteDTO();
			
			dto.id = -1;
			dto.identificacion = "";
			dto.nombre = "";
			dto.telefono = "";
			dto.numeroTarjetaCredito = 0;
			
			request.setAttribute("cliente", dto);
			forward("/detalleCliente.jsp", request, response);

		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}