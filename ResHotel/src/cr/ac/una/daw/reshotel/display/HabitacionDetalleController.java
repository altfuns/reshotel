package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cr.ac.una.daw.reshotel.domain.Hotel;
import cr.ac.una.daw.reshotel.service.HabitacionManager;
import cr.ac.una.daw.reshotel.service.HotelManager;

public class HabitacionDetalleController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private HabitacionManager habitacionManager;
	private HotelManager hotelManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning habitacion view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));
		Collection<Hotel> hoteles = hotelManager.getHoteles();
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("habitacion", this.habitacionManager.find(id));
		myModel.put("hoteles", hoteles);

		return new ModelAndView("habitacionDetalleView", "model", myModel);
	}

	public void setHabitacionManager(HabitacionManager HabitacionManager) {
		this.habitacionManager = HabitacionManager;
	}

	public void setHotelManager(HotelManager hotelManager) {
		this.hotelManager = hotelManager;
	}
	
	
}