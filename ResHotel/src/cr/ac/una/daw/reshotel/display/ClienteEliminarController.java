package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.service.ClienteManager;

/**
 * 
 * Controlador de pagina para eliminar un Cliente
 *
 */
public class ClienteEliminarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private ClienteManager clienteManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning cliente view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));

		Cliente entity = clienteManager.find(id);

		if (entity != null) {
			clienteManager.delete(entity);
		}

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("clientes", this.clienteManager.getClientes());

		return new ModelAndView("clienteView", "model", myModel);
	}

	public void setClienteManager(ClienteManager ClienteManager) {
		this.clienteManager = ClienteManager;
	}
}