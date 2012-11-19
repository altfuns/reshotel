package cr.ac.una.daw.reshotel.service;

import java.util.Collection;
import java.util.List;

import javax.servlet.ServletContext;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.domain.ClienteRepository;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;
import cr.ac.una.daw.reshotel.data.*;

/**
 * Implementa los metodos necesarios para dar mantenimiento a un cliente.
 * Interactua con el repositio de datos de la capa de acceso a datos.
 *
 */
public class SimpleClienteManager implements ClienteManager {

	private ClienteRepository repository;

	public void setRepository(ClienteRepository repository) {
		this.repository = repository;
	}

	public Collection<Cliente> getClientes() {
		return repository.findAllCliente();
	}

	@Override
	public Cliente find(int id) {
		return repository.findCliente(id);
	}

	@Override
	public void save(Cliente cliente) {
		if (cliente.getId() != -1) {
			repository.updateCliente(cliente);
		} else {
			repository.insertCliente(cliente);
		}

	}

	@Override
	public boolean delete(Cliente cliente) {
		return repository.deleteCliente(cliente);

	}
}