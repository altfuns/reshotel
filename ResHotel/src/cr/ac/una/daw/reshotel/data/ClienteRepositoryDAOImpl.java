package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.ClienteAssembler;
import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.domain.ClienteRepository;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

/**
 * Repositorio de datos de clientes
 * @author alfonso
 *
 */
public class ClienteRepositoryDAOImpl implements ClienteRepository {
	private ClienteDAO clienteDAO;

	ClienteRepositoryDAOImpl(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	/**
	 * Inserta el registre del cliente en la BD
	 */
	public boolean insertCliente(Cliente cliente) {
		ClienteDTO clienteDTO = ClienteAssembler.create(cliente);
		return (clienteDAO.insert(clienteDTO));
	}

	/**
	 * Elimina la fila con los datos del cliente
	 */
	public boolean deleteCliente(Cliente cliente) {
		ClienteDTO clienteDTO = ClienteAssembler.create(cliente);
		return (clienteDAO.delete(clienteDTO));
	}

	/**
	 * Busca el cliente que contenga el id dado.
	 */
	public Cliente findCliente(int id) {
		ClienteDTO clienteDTO = clienteDAO.findById(id);
		if (clienteDTO != null) {

			System.out.println(clienteDTO.getNombre());
			Cliente cliente = ClienteAssembler.create(clienteDTO);
			return cliente;
		}
		return null;
	}

	/**
	 * Actualiza el registro de cliente
	 */
	public boolean updateCliente(Cliente cliente) {
		ClienteDTO clienteDTO = ClienteAssembler.create(cliente);
		return (clienteDAO.update(clienteDTO));
	}

	/**
	 * Obtiene todos los registros de la tabla clientes 
	 */
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
