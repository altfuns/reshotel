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

import cr.ac.una.daw.reshotel.dto.HotelDTO;
import cr.ac.una.daw.reshotel.service.HotelManager;

public class HotelActualizarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private HotelManager hotelManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning hotel view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));

		HotelDTO dto = id == -1 ? new HotelDTO() : hotelManager.find(id);

		dto.telefono = request.getParameter("telefono");
		dto.clase = Integer.parseInt(request.getParameter("clase"));
		dto.email = request.getParameter("email");
		dto.nombrePersonaEncargada = request
				.getParameter("nombrePersonaEncargada");
		dto.ubicacion.id = Integer.parseInt(request.getParameter("ubicacion"));

		hotelManager.save(dto);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("hoteles", this.hotelManager.getHoteles());

		return new ModelAndView("hotelView", "model", myModel);
	}

	public void setHotelManager(HotelManager HotelManager) {
		this.hotelManager = HotelManager;
	}
}