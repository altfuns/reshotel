package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cr.ac.una.daw.reshotel.dto.UbicacionDTO;
import cr.ac.una.daw.reshotel.service.ClienteManager;
import cr.ac.una.daw.reshotel.service.UbicacionManager;

public class ClienteDetalleController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private ClienteManager clienteManager;
	private UbicacionManager ubicacionManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning cliente view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));
		List<UbicacionDTO> ubicaciones = ubicacionManager.getUbicaciones();
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("cliente", this.clienteManager.find(id));
		myModel.put("ubicaciones", ubicaciones);

		return new ModelAndView("clienteDetalleView", "model", myModel);
	}

	public void setClienteManager(ClienteManager ClienteManager) {
		this.clienteManager = ClienteManager;
	}
}