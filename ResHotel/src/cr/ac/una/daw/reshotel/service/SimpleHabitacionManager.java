package cr.ac.una.daw.reshotel.service;

import java.util.List;

import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public class SimpleHabitacionManager implements HabitacionManager {
	private List<HabitacionDTO> habitaciones;

	public List<HabitacionDTO> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitacions(List<HabitacionDTO> habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public HabitacionDTO find(int id) {
		for (HabitacionDTO habitacion : habitaciones) {
			if (id == habitacion.id) {
				return habitacion;
			}
		}
		return null;
	}

	@Override
	public void save(HabitacionDTO habitacion) {

	}

	@Override
	public void delete(HabitacionDTO habitacion) {
		// TODO Auto-generated method stub
		
	}
}