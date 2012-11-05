package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public interface ClienteManager extends Serializable {
	public List<ClienteDTO> getClientes();

	public ClienteDTO find(int id);

	public void save(ClienteDTO cliente);
	
	public void delete(ClienteDTO cliente);
}