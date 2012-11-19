package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.Collection;
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

import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.domain.Hotel;
import cr.ac.una.daw.reshotel.domain.Ubicacion;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.HotelDTO;
import cr.ac.una.daw.reshotel.service.HabitacionManager;
import cr.ac.una.daw.reshotel.service.HotelManager;
import cr.ac.una.daw.reshotel.service.UbicacionManager;

/**
 * 
 * Controlador de pagina para establecer los datos por omision de un Hotel
 *
 */
public class HotelAgregarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private HotelManager hotelManager;
	private HabitacionManager habitacionManager;
	private UbicacionManager ubicacionManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning hotel view with " + now);
		Hotel dto = new Hotel();

		Collection<Habitacion> habitaciones = habitacionManager.getHabitaciones();
		Collection<Ubicacion> ubicaciones = ubicacionManager.getUbicaciones();
		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("hotel", dto);
		myModel.put("habitaciones", habitaciones);
		myModel.put("ubicaciones", ubicaciones);

		return new ModelAndView("hotelDetalleView", "model", myModel);
	}

	public void setHotelManager(HotelManager HotelManager) {
		this.hotelManager = HotelManager;
	}
	
	public void setHabitacionManager(HabitacionManager habitacionManager) {
		this.habitacionManager = habitacionManager;
	}
	public void setUbicacionManager(UbicacionManager ubicacionManager) {
		this.ubicacionManager = ubicacionManager;
	}
}