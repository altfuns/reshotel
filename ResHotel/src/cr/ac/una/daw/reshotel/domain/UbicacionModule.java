package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

/**
 * 
 * Modulo de tabla de la entidad ubicacion.
 *
 */
public class UbicacionModule extends TableModule<UbicacionRowGateway, UbicacionDTO> {
	@Override
	public UbicacionRowGateway gatewayfromDTO(UbicacionRowGateway gateway, UbicacionDTO dto) {
		gateway.setId(dto.id);
		gateway.setCiudad(dto.ciudad);
		gateway.setPais(dto.pais);

		return gateway;
	}

}