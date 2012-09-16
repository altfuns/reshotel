package cr.ac.una.daw.reshotel.display;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import cr.ac.una.daw.reshotel.data.ClienteRowGateway;
import cr.ac.una.daw.reshotel.domain.ClienteModule;

public class EliminarCliente extends PageController {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteModule module = (ClienteModule) context.getBean("clienteModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));
			ClienteRowGateway obj = module.buscar(id);

			if (obj == null) {
				throw new Exception("Cliente no se ha podido cargar");
			}

			module.eliminar(id);

			response.sendRedirect("listaClientes");
		} catch (Exception e) {
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}