package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelDAO extends HibernateDaoSupport {
	public boolean insert(HotelDTO hotelDTO) {
		getHibernateTemplate().saveOrUpdate(hotelDTO);
		return true;
	}

	public boolean delete(HotelDTO hotelDTO) {
		getHibernateTemplate().delete(hotelDTO);
		return true;
	}

	public HotelDTO findById(int id) {
		HotelDTO hotel;
		hotel = (HotelDTO) getHibernateTemplate().get(HotelDTO.class,
				new Integer(id));
		return hotel;
	}

	public boolean update(HotelDTO hotelDTO) {
		getHibernateTemplate().saveOrUpdate(hotelDTO);
		return true;
	}

	public Collection findAll() {
		return getHibernateTemplate().find("from HotelDTO");
	}
}
