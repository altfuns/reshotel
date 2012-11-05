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

import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.service.HabitacionManager;

public class HabitacionActualizarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private HabitacionManager habitacionManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning habitacion view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));

		Habitacion entity = id == -1 ? new Habitacion() : habitacionManager
				.find(id);
		entity.setOcupacionMaxima(Integer.parseInt(request
				.getParameter("ocupacionMaxima")));
		entity.setNumero(Integer.parseInt(request.getParameter("numero")));
		entity.setMobiliario(request.getParameter("mobiliario"));
		entity.setCosto(Double.parseDouble(request.getParameter("costo")));

		habitacionManager.save(entity);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("habitaciones", this.habitacionManager.getHabitaciones());

		return new ModelAndView("habitacionView", "model", myModel);
	}

	public void setHabitacionManager(HabitacionManager HabitacionManager) {
		this.habitacionManager = HabitacionManager;
	}
}