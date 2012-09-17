package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

public class ReservacionAssembler {
	public static ReservacionDTO create(ReservacionRowGateway obj) {
		ReservacionDTO dto = new ReservacionDTO();
		dto.id = obj.getId();
		dto.habitacionId = obj.getHabitacionId();
		dto.fechaEntrada = obj.getFechaEntrada();
		dto.fechaSalida = obj.getFechaSalida();
		dto.ocupacion = obj.getOcupacion();
		dto.monto = obj.getMonto();
		dto.identificacionCliente = obj.getIdentificacionCliente();
		return dto;
	}
}