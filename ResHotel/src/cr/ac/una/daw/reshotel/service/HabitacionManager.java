package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Habitacion;

/**
 * 
 * HabitacionManager provee los metodos necesarios para el matenimiento de una habitacion.
 * Interactua con la capa de acceso a datos.
 *
 */
public interface HabitacionManager extends Serializable {
	public Collection<Habitacion> getHabitaciones();

	public Habitacion find(int id);

	public void save(Habitacion habitacion);

	public void delete(Habitacion habitacion);
}