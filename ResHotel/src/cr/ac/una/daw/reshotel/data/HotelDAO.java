package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.HotelDTO;

/**
 * Interacctua con el repositorio de datos de Hoteles
 * @author alfonso
 *
 */
public class HotelDAO extends HibernateDaoSupport {
	
	/**
	 * Inserta un nuevo hotel
	 * @param hotelDTO
	 * @return
	 */
	public boolean insert(HotelDTO hotelDTO) {
		getHibernateTemplate().saveOrUpdate(hotelDTO);
		return true;
	}

	/**
	 * Elimina el hotel
	 * @param hotelDTO
	 * @return
	 */
	public boolean delete(HotelDTO hotelDTO) {
		getHibernateTemplate().delete(hotelDTO);
		return true;
	}

	/**
	 * Busca un registro de hotel
	 * @param id
	 * @return
	 */
	public HotelDTO findById(int id) {
		HotelDTO hotel;
		hotel = (HotelDTO) getHibernateTemplate().get(HotelDTO.class,
				new Integer(id));
		return hotel;
	}

	/**
	 * Actualiza el registro de hotel
	 * @param hotelDTO
	 * @return
	 */
	public boolean update(HotelDTO hotelDTO) {
		getHibernateTemplate().saveOrUpdate(hotelDTO);
		return true;
	}

	/**
	 * Obtiene todos los registros de hoteles.
	 * @return
	 */
	public Collection findAll() {
		return getHibernateTemplate().find("from HotelDTO");
	}
}
