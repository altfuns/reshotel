package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Reservacion;

public interface ReservacionManager extends Serializable {
	public List<Reservacion> getReservaciones();

	public Reservacion find(int id);

	public void save(Reservacion reservacion);
	
	public void delete(Reservacion reservacion);
}