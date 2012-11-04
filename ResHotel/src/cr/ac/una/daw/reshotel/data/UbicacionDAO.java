package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class UbicacionDAO extends HibernateDaoSupport{
	public boolean insert(UbicacionDTO ubicacionDTO) {
		getHibernateTemplate().saveOrUpdate(ubicacionDTO);
		return true;
	}

	public boolean delete(UbicacionDTO ubicacionDTO) {
		getHibernateTemplate().delete(ubicacionDTO);
		return true;
	}

	public UbicacionDTO findById(int id) {
		UbicacionDTO ubicacion;
		ubicacion = (UbicacionDTO) getHibernateTemplate().get(UbicacionDTO.class,
				new Integer(id));
		return ubicacion;
	}

	public boolean update(UbicacionDTO ubicacionDTO) {
		getHibernateTemplate().saveOrUpdate(ubicacionDTO);
		return true;
	}

	public Collection findAll() {
		return getHibernateTemplate().find("from UbicacionDTO");
	}
}
