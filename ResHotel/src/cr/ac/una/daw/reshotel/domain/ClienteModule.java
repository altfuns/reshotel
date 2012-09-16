package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.ClienteRowGateway;
import cr.ac.una.daw.reshotel.dto.ClienteDTO;

public class ClienteModule extends TableModule<ClienteRowGateway, ClienteDTO> {	
	@Override
	public ClienteRowGateway gatewayfromDTO(ClienteRowGateway gateway, ClienteDTO dto) {
		gateway.setId(dto.id);
		gateway.setIdentificacion(dto.identificacion);
		gateway.setNombre(dto.nombre);
		gateway.setTelefono(dto.telefono);
		gateway.setNumeroTarjetaCredito(dto.numeroTarjetaCredito);
		//gateway.setResidenciaId(dto.residencia.id);
		return gateway;
	}

}