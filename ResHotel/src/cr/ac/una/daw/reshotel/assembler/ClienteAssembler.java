package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.domain.Cliente;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class ClienteAssembler {
	/**
	 * Encargado de convertir un ClienteRowGateway en un ClienteDTO
	 * 
	 * @param obj
	 *            Representa un RowGateway del tipo CLiente
	 * @return ClienteDTO con los datos correspondientes
	 */
	public static ClienteDTO create(Cliente obj) {
		ClienteDTO dto = new ClienteDTO();
		dto.id = obj.getId();
		dto.identificacion = obj.getIdentificacion();
		dto.nombre = obj.getNombre();
		dto.telefono = obj.getTelefono();
		dto.numeroTarjetaCredito = obj.getNumeroTarjetaCredito();
		dto.residencia.id = obj.getResidenciaId();

		return dto;
	}

	public static Cliente create(ClienteDTO dto) {
		Cliente obj = new Cliente();
		obj.setId(dto.getId());
		obj.setIdentificacion(dto.getIdentificacion());
		obj.setNombre(dto.getNombre());
		obj.setTelefono(dto.getTelefono());
		obj.setNumeroTarjetaCredito(dto.getNumeroTarjetaCredito());
		obj.setResidenciaId(dto.getResidenciaId());

		return obj;
	}

	/**
	 * Actualizado los datos del dto basado en los del objeto
	 * 
	 * @param obj
	 * @param dto
	 */
	public static void update(Cliente obj, ClienteDTO dto) {
		dto.id = obj.getId();
		dto.identificacion = obj.getIdentificacion();
		dto.nombre = obj.getNombre();
		dto.telefono = obj.getTelefono();
		dto.numeroTarjetaCredito = obj.getNumeroTarjetaCredito();
		dto.residencia.id = obj.getResidenciaId();

	}
}