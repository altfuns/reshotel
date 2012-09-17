package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.ClienteRowGateway;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class ClienteAssembler {
	public static ClienteDTO create(ClienteRowGateway obj) {
		ClienteDTO dto = new ClienteDTO();
		dto.id = obj.getId();
		dto.identificacion = obj.getIdentificacion();
		dto.nombre = obj.getNombre();
		dto.telefono = obj.getTelefono();
		dto.numeroTarjetaCredito = obj.getNumeroTarjetaCredito();
		dto.residencia.id = obj.getResidenciaId();

		return dto;
	}
}