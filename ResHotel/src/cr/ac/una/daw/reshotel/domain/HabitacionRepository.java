package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

public interface HabitacionRepository {
	public boolean insertHabitacion(Habitacion habitacion);

	public boolean deleteHabitacion(Habitacion habitacion);

	public Habitacion findHabitacion(int id);

	public boolean updateHabitacion(Habitacion habitacion);

	public Collection<Habitacion> findAllHabitacion();
}
