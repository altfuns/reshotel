package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Reservacion;

/**
 * 
 * ReservacionManager provee los metodos necesarios para el matenimiento de una reservacion.
 * Interactua con la capa de acceso a datos.
 *
 */
public interface ReservacionManager extends Serializable {
	public Collection<Reservacion> getReservaciones();

	public Reservacion find(int id);

	public void save(Reservacion reservacion);
	
	public void delete(Reservacion reservacion);
	
	public boolean isReserved(Reservacion reservacion, Date inDate, Date outDate) throws ParseException;
}