package cr.ac.una.daw.reshotel.display;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.ClienteAssembler;
import cr.ac.una.daw.reshotel.domain.ClienteModule;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class ActualizarCliente extends PageController {

	private static final long serialVersionUID = 7900939974504489200L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ClienteModule module = (ClienteModule) context
				.getBean("clienteModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			ClienteDTO dto = id == -1 ? new ClienteDTO()
					: ClienteAssembler.create(module.buscar(id));

			dto.telefono = request.getParameter("telefono");
			dto.nombre = request.getParameter("nombre");
			dto.identificacion = request.getParameter("identificacion");
			dto.numeroTarjetaCredito = Integer.parseInt(request.getParameter("numeroTarjetaCredito"));

			if (id == -1) {
				module.insertar(dto);
			} else {
				module.actualizar(dto);
			}

			response.sendRedirect("listaClientes");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}