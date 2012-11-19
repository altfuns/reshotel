package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.ClienteDTO;

/**
 * Encargado de interactuar la fuente de datos de clientes 
 * @author alfonso
 *
 */
public class ClienteDAO extends HibernateDaoSupport{
	/**
	 * Inserta un nuevo objeto cliente
	 * @param clienteDTO
	 * @return
	 */
	public boolean insert(ClienteDTO clienteDTO) {
		getHibernateTemplate().saveOrUpdate(clienteDTO);
		return true;
	}

	/**
	 * Elimina un registro de cliente
	 * @param clienteDTO
	 * @return
	 */
	public boolean delete(ClienteDTO clienteDTO) {
		getHibernateTemplate().delete(clienteDTO);
		return true;
	}
	
	/**
	 * Obtiene un objeto ClienteDTO
	 * @param id
	 * @return
	 */
	public ClienteDTO findById(int id) {
		ClienteDTO cliente;
		cliente = (ClienteDTO) getHibernateTemplate().get(ClienteDTO.class,
				new Integer(id));
		return cliente;
	}

	/**
	 * Actualiza el registro del cliente
	 * @param clienteDTO
	 * @return
	 */
	public boolean update(ClienteDTO clienteDTO) {
		getHibernateTemplate().saveOrUpdate(clienteDTO);
		return true;
	}

	/**
	 * Obtiene todos los registros de clientes
	 * @return
	 */
	public Collection findAll() {
		return getHibernateTemplate().find("from ClienteDTO");
	}
}
