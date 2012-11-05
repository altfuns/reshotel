package cr.ac.una.daw.reshotel.service;

import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.ClienteRepository;
import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.domain.HabitacionRepository;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public class SimpleHabitacionManager implements HabitacionManager {
	private List<Habitacion> habitaciones;
	
	private HabitacionRepository repository;

	public void setRepository(HabitacionRepository repository) {
		this.repository = repository;
	}

	public Collection<Habitacion> getHabitaciones() {
		return repository.findAllHabitacion();
	}

	public void setHabitaciones(List<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public Habitacion find(int id) {
		return repository.findHabitacion(id);
	}

	@Override
	public void save(Habitacion habitacion) {
		if (habitacion.getId() != -1) {
			repository.updateHabitacion(habitacion);
		} else {
			repository.insertHabitacion(habitacion);
		}
	}

	@Override
	public void delete(Habitacion habitacion) {
		if(habitacion != null){
			repository.deleteHabitacion(habitacion);
		}
		
	}
}