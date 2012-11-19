package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

/**
 * 
 * ReservacionRepository brinda los metodos necesarios para el matenimiento de Reservaciones 
 *
 */
public interface ReservacionRepository {
	public boolean insertReservacion(Reservacion reservacion);

	public boolean deleteReservacion(Reservacion reservacion);

	public Reservacion findReservacion(int id);

	public boolean updateReservacion(Reservacion reservacion);

	public Collection<Reservacion> findAllReservacion();
}
