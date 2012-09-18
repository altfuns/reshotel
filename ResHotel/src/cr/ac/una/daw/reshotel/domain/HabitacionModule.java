package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

/**
 * 
 * Modulo de tabla de la entidad habitacion.
 *
 */
public class HabitacionModule extends
		TableModule<HabitacionRowGateway, HabitacionDTO> {

	@Override
	public HabitacionRowGateway gatewayfromDTO(HabitacionRowGateway gateway,
			HabitacionDTO dto) {
		gateway.setId(dto.id);
		gateway.setOcupacionMaxima(dto.ocupacionMaxima);
		gateway.setNumero(dto.numero);
		gateway.setMobiliario(dto.mobiliario);
		gateway.setCosto(dto.costo);
		return gateway;
	}
}