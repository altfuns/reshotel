package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public class HabitacionDAO extends HibernateDaoSupport{
	public boolean insert(HabitacionDTO habitacionDTO) {
		getHibernateTemplate().saveOrUpdate(habitacionDTO);
		return true;
	}

	public boolean delete(HabitacionDTO habitacionDTO) {
		getHibernateTemplate().delete(habitacionDTO);
		return true;
	}

	public HabitacionDTO findById(int id) {
		HabitacionDTO habitacion;
		habitacion = (HabitacionDTO) getHibernateTemplate().get(HabitacionDTO.class,
				new Integer(id));
		return habitacion;
	}

	public boolean update(HabitacionDTO habitacionDTO) {
		getHibernateTemplate().saveOrUpdate(habitacionDTO);
		return true;
	}

	public Collection findAll() {
		return getHibernateTemplate().find("from HabitacionDTO");
	}
}
