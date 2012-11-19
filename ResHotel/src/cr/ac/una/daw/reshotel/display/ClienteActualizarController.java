package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.domain.ClienteRepository;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;
import cr.ac.una.daw.reshotel.service.ClienteManager;

/**
 * 
 * Controlador de pagina para actualizar el registro de Cliente
 *
 */
public class ClienteActualizarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private ClienteManager clienteManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning cliente view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));

		Cliente entity = id == -1 ? new Cliente() : clienteManager.find(id);

		entity.setTelefono(request.getParameter("telefono"));
		entity.setNombre(request.getParameter("nombre"));
		entity.setIdentificacion(request.getParameter("identificacion"));
		entity.setNumeroTarjetaCredito(Integer.parseInt(request
				.getParameter("numeroTarjetaCredito")));
		entity.setResidenciaId(Integer.parseInt(request
				.getParameter("residencia")));

		clienteManager.save(entity);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("clientes", this.clienteManager.getClientes());

		return new ModelAndView("clienteView", "model", myModel);
	}

	public void setClienteManager(ClienteManager ClienteManager) {
		this.clienteManager = ClienteManager;
	}
}