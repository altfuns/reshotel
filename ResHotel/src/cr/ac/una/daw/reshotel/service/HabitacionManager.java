package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public interface HabitacionManager extends Serializable {
	public List<HabitacionDTO> getHabitaciones();

	public HabitacionDTO find(int id);

	public void save(HabitacionDTO habitacion);
	
	public void delete(HabitacionDTO habitacion);
}