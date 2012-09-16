package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.data.Constantes.HotelColumns;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelModule extends TableModule<HotelRowGateway, HotelDTO> {

	@Override
	public HotelRowGateway gatewayfromDTO(HotelDTO dto) {
		HotelRowGateway result = new HotelRowGateway();
		result.setId(dto.id);
		result.setTelefono(dto.telefono);
		result.setEmail(dto.email);
		result.setClase(dto.clase);
		result.setNombrePersonaEncargada(dto.nombrePersonaEncargada);
		return result;
	}
}