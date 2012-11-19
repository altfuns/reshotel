package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.HabitacionAssembler;
import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.domain.HabitacionRepository;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

/**
 * Repositorio de datos de la clase Habitacion
 * @author alfonso
 *
 */
public class HabitacionRepositoryDAOImpl implements HabitacionRepository {
	private HabitacionDAO habitacionDAO;

	
	HabitacionRepositoryDAOImpl(HabitacionDAO habitacionDAO) {
		this.habitacionDAO = habitacionDAO;
	}

	/**
	 * Crea un nuevo registro de habitacion
	 */
	public boolean insertHabitacion(Habitacion habitacion) {
		HabitacionDTO habitacionDTO = HabitacionAssembler.create(habitacion);
		return (habitacionDAO.insert(habitacionDTO));
	}

	/**
	 * Elimina el registro de la habitacion
	 */
	public boolean deleteHabitacion(Habitacion habitacion) {
		HabitacionDTO habitacionDTO = HabitacionAssembler.create(habitacion);
		return (habitacionDAO.delete(habitacionDTO));
	}

	/**
	 * Busca el registro de habitacion
	 */
	public Habitacion findHabitacion(int id) {
		HabitacionDTO habitacionDTO = habitacionDAO.findById(id);
		if (habitacionDTO != null) {
			System.out.println(habitacionDTO.numero);
			Habitacion habitacion = HabitacionAssembler.create(habitacionDTO);
			return habitacion;
		}
		return null;
	}

	/**
	 * Actualiza el registro de habitacion
	 */
	public boolean updateHabitacion(Habitacion habitacion) {
		HabitacionDTO habitacionDTO = HabitacionAssembler.create(habitacion);
		return (habitacionDAO.update(habitacionDTO));
	}

	/**
	 * Obtiene todos los registros de habitaciones
	 */
	public Collection<Habitacion> findAllHabitacion() {
		Collection<HabitacionDTO> habitacionsDTO = habitacionDAO.findAll();
		List<Habitacion> habitacionList = new ArrayList<Habitacion>();
		Iterator<HabitacionDTO> itr = habitacionsDTO.iterator();
		while (itr.hasNext()) {
			HabitacionDTO habitacionDTO = (HabitacionDTO) itr.next();
			System.out.println(habitacionDTO.id);
			Habitacion habitacion = HabitacionAssembler.create(habitacionDTO);
			habitacionList.add(habitacion);
			System.out.println(habitacion.getId());
		}
		return habitacionList;
	}
}
