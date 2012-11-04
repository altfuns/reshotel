package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

public class ReservacionDAO extends HibernateDaoSupport{
	public boolean insert(ReservacionDTO reservacionDTO) {
		getHibernateTemplate().saveOrUpdate(reservacionDTO);
		return true;
	}

	public boolean delete(ReservacionDTO reservacionDTO) {
		getHibernateTemplate().delete(reservacionDTO);
		return true;
	}

	public ReservacionDTO findById(int id) {
		ReservacionDTO reservacion;
		reservacion = (ReservacionDTO) getHibernateTemplate().get(ReservacionDTO.class,
				new Integer(id));
		return reservacion;
	}

	public boolean update(ReservacionDTO reservacionDTO) {
		getHibernateTemplate().saveOrUpdate(reservacionDTO);
		return true;
	}

	public Collection findAll() {
		return getHibernateTemplate().find("from ReservacionDTO");
	}
}
