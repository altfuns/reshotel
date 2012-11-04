package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class ClienteDAO extends HibernateDaoSupport{
	public boolean insert(ClienteDTO grupoDTO) {
		getHibernateTemplate().saveOrUpdate(grupoDTO);
		return true;
	}

	public boolean delete(ClienteDTO grupoDTO) {
		getHibernateTemplate().delete(grupoDTO);
		return true;
	}

	public ClienteDTO findById(int id) {
		ClienteDTO grupo;
		grupo = (ClienteDTO) getHibernateTemplate().get(ClienteDTO.class,
				new Integer(id));
		return grupo;
	}

	public boolean update(ClienteDTO grupoDTO) {
		getHibernateTemplate().saveOrUpdate(grupoDTO);
		return true;
	}

	public Collection findAll() {
		return getHibernateTemplate().find("from ClienteDTO");
	}
}
