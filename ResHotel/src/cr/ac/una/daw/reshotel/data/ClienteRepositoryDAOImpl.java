package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.ClienteAssembler;
import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.domain.ClienteRepository;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class ClienteRepositoryDAOImpl implements ClienteRepository {
	private ClienteDAO clienteDAO;

	ClienteRepositoryDAOImpl(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	public boolean insertCliente(Cliente cliente) {
		ClienteDTO clienteDTO = ClienteAssembler.create(cliente);
		return (clienteDAO.insert(clienteDTO));
	}

	public boolean deleteCliente(Cliente cliente) {
		ClienteDTO clienteDTO = ClienteAssembler.create(cliente);
		return (clienteDAO.delete(clienteDTO));
	}

	public Cliente findCliente(int id) {
		ClienteDTO clienteDTO = clienteDAO.findById(id);
		if (clienteDTO != null) {

			System.out.println(clienteDTO.getNombre());
			Cliente cliente = ClienteAssembler.create(clienteDTO);
			return cliente;
		}
		return null;
	}

	public boolean updateCliente(Cliente cliente) {
		ClienteDTO clienteDTO = ClienteAssembler.create(cliente);
		return (clienteDAO.update(clienteDTO));
	}

	public Collection<Cliente> findAllCliente() {
		Collection<ClienteDTO> clientesDTO = clienteDAO.findAll();
		List<Cliente> clienteList = new ArrayList<Cliente>();
		Iterator<ClienteDTO> itr = clientesDTO.iterator();
		while (itr.hasNext()) {
			ClienteDTO clienteDTO = (ClienteDTO) itr.next();
			System.out.println(clienteDTO.getNombre());
			Cliente cliente = ClienteAssembler.create(clienteDTO);
			clienteList.add(cliente);
			System.out.println(cliente.getNombre());
		}
		return clienteList;
	}
}
