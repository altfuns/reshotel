package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class ClienteDAO extends HibernateDaoSupport{
	public boolean insert(ClienteDTO clienteDTO) {
		getHibernateTemplate().saveOrUpdate(clienteDTO);
		return true;
	}

	public boolean delete(ClienteDTO clienteDTO) {
		getHibernateTemplate().delete(clienteDTO);
		return true;
	}

	public ClienteDTO findById(int id) {
		ClienteDTO cliente;
		cliente = (ClienteDTO) getHibernateTemplate().get(ClienteDTO.class,
				new Integer(id));
		return cliente;
	}

	public boolean update(ClienteDTO clienteDTO) {
		getHibernateTemplate().saveOrUpdate(clienteDTO);
		return true;
	}

	public Collection findAll() {
		return getHibernateTemplate().find("from ClienteDTO");
	}
}
