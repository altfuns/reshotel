package cr.ac.una.daw.reshotel.service;

import java.util.List;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class SimpleClienteManager implements ClienteManager {
	private List<ClienteDTO> clientes;

	public List<ClienteDTO> getClientes() {
		return clientes;
	}

	public void setClientes(List<ClienteDTO> clientes) {
		this.clientes = clientes;
	}

	@Override
	public ClienteDTO find(int id) {
		for (ClienteDTO cliente : clientes) {
			if (id == cliente.id) {
				return cliente;
			}
		}
		return null;
	}

	@Override
	public void save(ClienteDTO cliente) {
		
		
	}

	@Override
	public void delete(ClienteDTO cliente) {
		// TODO Auto-generated method stub
		
	}
}