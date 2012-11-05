package cr.ac.una.daw.reshotel.service;

import java.util.List;

import cr.ac.una.daw.reshotel.domain.Reservacion;
import cr.ac.una.daw.reshotel.domain.ReservacionRepository;

public class SimpleReservacionManager implements ReservacionManager {
	private List<Reservacion> reservaciones;

	private ReservacionRepository repository;

	public void setRepository(ReservacionRepository repository) {
		this.repository = repository;
	}

	public List<Reservacion> getReservaciones() {
		return reservaciones;
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
}