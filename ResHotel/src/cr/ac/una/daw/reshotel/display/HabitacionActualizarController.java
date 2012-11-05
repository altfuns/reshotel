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

		HabitacionDTO dto = id == -1 ? new HabitacionDTO() : habitacionManager
				.find(id);
		dto.ocupacionMaxima = Integer.parseInt(request
				.getParameter("ocupacionMaxima"));
		dto.numero = Integer.parseInt(request.getParameter("numero"));
		dto.mobiliario = request.getParameter("mobiliario");
		dto.costo = Double.parseDouble(request.getParameter("costo"));

		habitacionManager.save(dto);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("habitaciones", this.habitacionManager.getHabitaciones());

		return new ModelAndView("habitacionView", "model", myModel);
	}

	public void setHabitacionManager(HabitacionManager HabitacionManager) {
		this.habitacionManager = HabitacionManager;
	}
}