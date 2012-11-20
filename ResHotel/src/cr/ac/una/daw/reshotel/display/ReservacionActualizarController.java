package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cr.ac.una.daw.reshotel.domain.Reservacion;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;
import cr.ac.una.daw.reshotel.service.ReservacionManager;
import cr.ac.una.daw.reshotel.util.DateUtil;

/**
 * 
 * Controlador de pagina para actualizar el registro de Reservacion
 * 
 */
public class ReservacionActualizarController implements Controller {
	protected final Log logger = LogFactory.getLog(getClass());
	private ReservacionManager reservacionManager;

	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new java.util.Date()).toString();
		logger.info("returning reservacion view with " + now);

		int id = Integer.parseInt(request.getParameter("id"));

		Reservacion entity = id == -1 ? new Reservacion() : reservacionManager
				.find(id);

		entity.setHabitacionId(Integer.parseInt(request
				.getParameter("habitacion")));
		entity.setFechaEntrada(request.getParameter("fechaEntrada"));
		entity.setFechaSalida(request.getParameter("fechaSalida"));
		entity.setOcupacion(Integer.parseInt(request.getParameter("ocupacion")));
		entity.setMonto(Double.parseDouble(request.getParameter("monto")));
		entity.setIdentificacionCliente(request.getParameter("cliente"));

		try {
			if (!reservacionManager.isReserved(entity,
					DateUtil.parseISO8601(entity.getFechaEntrada()),
					DateUtil.parseISO8601(entity.getFechaSalida()))) {
				reservacionManager.save(entity);

			} else {
				return new ModelAndView("errorView", "mensaje",
						"La habitación ya se encuentra reservada para dichas fechas.");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ModelAndView("errorView", "mensaje",
					"Error en el formato de fechas. Utilize el formato yyyy-MM-dd HH:mm:ss.sss");
		}

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		myModel.put("reservaciones", this.reservacionManager.getReservaciones());

		return new ModelAndView("reservacionView", "model", myModel);
	}

	public void setReservacionManager(ReservacionManager ReservacionManager) {
		this.reservacionManager = ReservacionManager;
	}
}