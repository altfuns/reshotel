package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelModule extends TableModule<HotelRowGateway, HotelDTO> {

	@Override
	public HotelRowGateway gatewayfromDTO(HotelRowGateway gateway, HotelDTO dto) {
		gateway.setId(dto.id);
		gateway.setTelefono(dto.telefono);
		gateway.setEmail(dto.email);
		gateway.setClase(dto.clase);
		gateway.setNombrePersonaEncargada(dto.nombrePersonaEncargada);
		return gateway;
	}

}