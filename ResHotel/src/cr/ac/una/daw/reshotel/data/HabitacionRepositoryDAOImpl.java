package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.HabitacionAssembler;
import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.domain.HabitacionRepository;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public class HabitacionRepositoryDAOImpl implements HabitacionRepository {
	private HabitacionDAO habitacionDAO;

	HabitacionRepositoryDAOImpl(HabitacionDAO habitacionDAO) {
		this.habitacionDAO = habitacionDAO;
	}

	public boolean insertHabitacion(Habitacion habitacion) {
		HabitacionDTO habitacionDTO = HabitacionAssembler.create(habitacion);
		return (habitacionDAO.insert(habitacionDTO));
	}

	public boolean deleteHabitacion(Habitacion habitacion) {
		HabitacionDTO habitacionDTO = HabitacionAssembler.create(habitacion);
		return (habitacionDAO.delete(habitacionDTO));
	}

	public Habitacion findHabitacion(int id) {
		HabitacionDTO habitacionDTO = habitacionDAO.findById(id);
		if (habitacionDTO != null) {
			Habitacion habitacion = new Habitacion();
			System.out.println(habitacionDTO.numero);
			HabitacionAssembler.update(habitacion, habitacionDTO);
			return habitacion;
		}
		return null;
	}

	public boolean updateHabitacion(Habitacion habitacion) {
		HabitacionDTO habitacionDTO = HabitacionAssembler.create(habitacion);
		return (habitacionDAO.update(habitacionDTO));
	}

	public Collection<Habitacion> findAllHabitacion() {
		Collection<HabitacionDTO> habitacionsDTO = habitacionDAO.findAll();
		List<Habitacion> habitacionList = new ArrayList<Habitacion>();
		Iterator<HabitacionDTO> itr = habitacionsDTO.iterator();
		while (itr.hasNext()) {
			Habitacion habitacion = new Habitacion();
			HabitacionDTO habitacionDTO = (HabitacionDTO) itr.next();
			HabitacionAssembler.update(habitacion, habitacionDTO);
			habitacionList.add(habitacion);
		}
		return habitacionList;
	}
}
