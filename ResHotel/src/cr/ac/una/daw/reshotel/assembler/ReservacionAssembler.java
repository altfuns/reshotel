package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.domain.Reservacion;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * Esamblador de la clase Reservacion
 * @author alfonso
 *
 */
public class ReservacionAssembler {

	/**
	 * Crea una nueva instancia de la clase {@link ReservacionDTO} desde un
	 * objeto {@link Reservacion}
	 * 
	 * @param obj
	 *            Intancia de la clase {@link ReservacionRowGateway} que
	 *            contiene los datos por convertir
	 * @return Una nueva instancia de la clase {@link ReservacionDTO}
	 */
	public static ReservacionDTO create(Reservacion obj) {
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

	public static Reservacion create(ReservacionDTO dto) {
		Reservacion entity = new Reservacion();
		entity.setId(dto.getId());
		entity.setHabitacionId(dto.getHabitacionId());
		entity.setFechaEntrada(dto.getFechaEntrada());
		entity.setFechaSalida(dto.getFechaSalida());
		entity.setOcupacion(dto.getOcupacion());
		entity.setMonto(dto.getMonto());
		entity.setIdentificacionCliente(dto.getIdentificacionCliente());
		return entity;
	}

	/**
	 * Actualizado los datos del dto basado en los del objeto
	 * 
	 * @param obj
	 * @param dto
	 */
	public static void update(Reservacion obj, ReservacionDTO dto) {
		dto.id = obj.getId();
		dto.habitacionId = obj.getHabitacionId();
		dto.fechaEntrada = obj.getFechaEntrada();
		dto.fechaSalida = obj.getFechaSalida();
		dto.ocupacion = obj.getOcupacion();
		dto.monto = obj.getMonto();
		dto.identificacionCliente = obj.getIdentificacionCliente();

	}
}