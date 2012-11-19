package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

/**
 * Encargado de interactuar la fuente de datos de habitaciones
 * 
 * @author alfonso
 * 
 */
public class HabitacionDAO extends HibernateDaoSupport {
	/**
	 * Inserta un nuevo registro de habitacion
	 * 
	 * @param habitacionDTO
	 * @return
	 */
	public boolean insert(HabitacionDTO habitacionDTO) {
		getHibernateTemplate().saveOrUpdate(habitacionDTO);
		return true;
	}

	/**
	 * Elimina el registro de la habitaciones
	 * 
	 * @param habitacionDTO
	 * @return
	 */
	public boolean delete(HabitacionDTO habitacionDTO) {
		getHibernateTemplate().delete(habitacionDTO);
		return true;
	}

	/**
	 * Obtiene un registro de habitacion con el id dado
	 * 
	 * @param id
	 * @return
	 */
	public HabitacionDTO findById(int id) {
		HabitacionDTO habitacion;
		habitacion = (HabitacionDTO) getHibernateTemplate().get(
				HabitacionDTO.class, new Integer(id));
		return habitacion;
	}

	/**
	 * Actualiza el objeto habitacion
	 * 
	 * @param habitacionDTO
	 * @return
	 */
	public boolean update(HabitacionDTO habitacionDTO) {
		getHibernateTemplate().saveOrUpdate(habitacionDTO);
		return true;
	}

	/**
	 * Obtiene todos los registros de habitaciones
	 * 
	 * @return
	 */
	public Collection findAll() {
		Collection<HabitacionDTO> dtos = getHibernateTemplate().find(
				"from HabitacionDTO");
		for (HabitacionDTO dto : dtos) {
			HotelDTO hotel = (HotelDTO) getHibernateTemplate().get(
					HotelDTO.class, new Integer(dto.getHotelId()));
			if (hotel != null) {
				System.out.println(hotel.getNombre());
				dto.setHotel(hotel);
			}
		}
		return dtos;
	}
}
