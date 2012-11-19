package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

/**
 * 
 * HabitacionRepository brinda los metodos necesarios para el matenimiento de Habitaciones 
 *
 */
public interface HabitacionRepository {
	public boolean insertHabitacion(Habitacion habitacion);

	public boolean deleteHabitacion(Habitacion habitacion);

	public Habitacion findHabitacion(int id);

	public boolean updateHabitacion(Habitacion habitacion);

	public Collection<Habitacion> findAllHabitacion();
}
