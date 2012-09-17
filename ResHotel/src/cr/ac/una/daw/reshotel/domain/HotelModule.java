package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.dto.DTO;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelModule extends TableModule<HotelRowGateway, HotelDTO> {

	@Override
	public HotelRowGateway gatewayfromDTO(HotelRowGateway gateway, HotelDTO dto) {
		gateway.setId(dto.id);
		gateway.setTelefono(dto.telefono);
		gateway.setEmail(dto.email);
		gateway.setClase(dto.clase);
		gateway.setNombrePersonaEncargada(dto.nombrePersonaEncargada);
		gateway.setUbicacionId(dto.ubicacion.id);
		return gateway;
	}
	
	@Override
	public void insertar(HotelDTO dto) throws Exception {
		validacionesGenerales(dto);
		super.insertar(dto);
	}
	
	@Override
	public void actualizar(HotelDTO dto) throws Exception {
		validacionesGenerales(dto);
		super.actualizar(dto);
	}
	
	private void validacionesGenerales(HotelDTO dto) throws Exception{
		if(dto.ubicacion.id == -1){
			throw new Exception("Debe seleccionar una ubicación");
		}
		if(dto.clase < 1 || dto.clase > 5){
			throw new Exception("La clase del hotel debe estar entre 1 y 5");
		}
	}

}