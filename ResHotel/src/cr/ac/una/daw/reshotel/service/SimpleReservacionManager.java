package cr.ac.una.daw.reshotel.service;

import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Reservacion;
import cr.ac.una.daw.reshotel.domain.ReservacionRepository;
import cr.ac.una.daw.reshotel.util.DateUtil;

/**
 * Implementa los metodos necesarios para dar mantenimiento a una reservacion.
 * Interactua con el repositio de datos de la capa de acceso a datos.
 * 
 */
public class SimpleReservacionManager implements ReservacionManager {
	private List<Reservacion> reservaciones;

	private ReservacionRepository repository;

	public void setRepository(ReservacionRepository repository) {
		this.repository = repository;
	}

	public Collection<Reservacion> getReservaciones() {
		return repository.findAllReservacion();
	}

	public void setReservaciones(List<Reservacion> reservaciones) {
		this.reservaciones = reservaciones;
	}

	@Override
	public Reservacion find(int id) {
		return repository.findReservacion(id);
	}

	@Override
	public void save(cr.ac.una.daw.reshotel.domain.Reservacion reservacion) {
		if (reservacion.getId() != -1) {
			repository.updateReservacion(reservacion);
		} else {
			repository.insertReservacion(reservacion);
		}
	}

	@Override
	public void delete(Reservacion reservacion) {
		if (reservacion != null) {
			repository.deleteReservacion(reservacion);
		}

	}

	@Override
	public boolean isReserved(Reservacion reservacion, Date inDate, Date outDate)
			throws ParseException {
		Collection<Reservacion> reservaciones = repository.findAllReservacion();
		for (Reservacion res : reservaciones) {
			Date rid = DateUtil.parseISO8601(res.getFechaEntrada());
			Date rod = DateUtil.parseISO8601(res.getFechaSalida());
			if (reservacion.getId() != res.getId()
					&& res.getHabitacionId() == reservacion.getHabitacionId()
					&& ((inDate.after(rid) && inDate.before(rod)) || (outDate
							.after(rid) && outDate.before(rod)))) {
				return true;
			}
		}
		return false;
	}
}