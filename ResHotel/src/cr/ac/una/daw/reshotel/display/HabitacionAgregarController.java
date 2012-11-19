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
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.HotelDTO;
import cr.ac.una.daw.reshotel.service.HabitacionManager;
import cr.ac.una.daw.reshotel.service.HotelManager;

/**
 * 
 * Controlador de pagina para establecer los datos por omision de una Habitacion
 *
 */
public class HabitacionAgregarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private HabitacionManager habitacionManager;
	private HotelManager hotelManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning habitacion view with " + now);

		Habitacion entity = new Habitacion();

		entity.setId(-1);
		entity.setOcupacionMaxima(0);
		entity.setNumero(0);
		entity.setMobiliario("");
		entity.setCosto(0);

		Collection<Hotel> hoteles = hotelManager.getHoteles();

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("habitacion", entity);
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