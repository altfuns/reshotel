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

import cr.ac.una.daw.reshotel.dto.ClienteDTO;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.service.ClienteManager;
import cr.ac.una.daw.reshotel.service.HabitacionManager;
import cr.ac.una.daw.reshotel.service.ReservacionManager;

public class ReservacionDetalleController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private ReservacionManager reservacionManager;
	private ClienteManager clienteManager;
	private HabitacionManager habitacionManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning reservacion view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));
		List<ClienteDTO> clientes = clienteManager.getClientes();
		List<HabitacionDTO> habitaciones = habitacionManager.getHabitaciones();
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("reservacion", this.reservacionManager.find(id));
		myModel.put("clientes", clientes);
		myModel.put("habitaciones", habitaciones);

		return new ModelAndView("reservacionDetalleView", "model", myModel);
	}

	public void setReservacionManager(ReservacionManager ReservacionManager) {
		this.reservacionManager = ReservacionManager;
	}
}