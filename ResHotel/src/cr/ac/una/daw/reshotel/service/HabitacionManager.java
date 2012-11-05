package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Habitacion;

public interface HabitacionManager extends Serializable {
	public List<Habitacion> getHabitaciones();

	public Habitacion find(int id);

	public void save(Habitacion habitacion);

	public void delete(Habitacion habitacion);
}