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

import cr.ac.una.daw.reshotel.dto.ReservacionDTO;
import cr.ac.una.daw.reshotel.service.ReservacionManager;

public class ReservacionActualizarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private ReservacionManager reservacionManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning reservacion view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));

		ReservacionDTO dto = id == -1 ? new ReservacionDTO()
				: reservacionManager.find(id);
		
		dto.habitacionId = Integer.parseInt(request.getParameter("habitacion"));
		dto.fechaEntrada = request.getParameter("fechaEntrada");
		dto.fechaSalida = request.getParameter("fechaSalida");
		dto.ocupacion = Integer.parseInt(request.getParameter("ocupacion"));
		dto.monto = Double.parseDouble(request.getParameter("monto"));
		dto.identificacionCliente = request.getParameter("cliente");

		reservacionManager.save(dto);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("reservaciones", this.reservacionManager.getReservaciones());

		return new ModelAndView("reservacionView", "model", myModel);
	}

	public void setReservacionManager(ReservacionManager ReservacionManager) {
		this.reservacionManager = ReservacionManager;
	}
}