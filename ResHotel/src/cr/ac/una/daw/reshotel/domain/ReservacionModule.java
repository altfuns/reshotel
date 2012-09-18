package cr.ac.una.daw.reshotel.domain;

import java.util.Date;

import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;
import cr.ac.una.daw.reshotel.data.Constantes.ReservacionColumns;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * 
 * Modulo de tabla de la entidad reservacion.
 *
 */
public class ReservacionModule extends
		TableModule<ReservacionRowGateway, ReservacionDTO> {

	@Override
	public ReservacionRowGateway gatewayfromDTO(ReservacionRowGateway gateway,
			ReservacionDTO dto) {
		gateway.setId(dto.id);
		gateway.setHabitacionId(dto.habitacionId);
		// TODO Convertir string en date
		gateway.setFechaEntrada(dto.fechaEntrada);
		gateway.setFechaSalida(dto.fechaSalida);
		gateway.setOcupacion(dto.ocupacion);
		gateway.setMonto(dto.monto);
		gateway.setIdentificacionCliente(dto.identificacionCliente);
		return gateway;
	}

}