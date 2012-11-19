package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

/**
 * 
 * ClienteManager provee los metodos necesarios para el matenimiento de un cliente.
 * Interactua con la capa de acceso a datos.
 *
 */
public interface ClienteManager extends Serializable {
	public Collection<Cliente> getClientes();

	public Cliente find(int id);

	public void save(Cliente cliente);
	
	public boolean delete(Cliente cliente);
}