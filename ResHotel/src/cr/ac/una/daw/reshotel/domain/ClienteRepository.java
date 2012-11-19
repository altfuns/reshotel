package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

/**
 * 
 * ClienteRepository brinda los metodos necesarios para el matenimiento de clientes 
 *
 */
public interface ClienteRepository {
	public boolean insertCliente(Cliente cliente);

	public boolean deleteCliente(Cliente cliente);

	public Cliente findCliente(int id);

	public boolean updateCliente(Cliente cliente);

	public Collection<Cliente> findAllCliente();
}
