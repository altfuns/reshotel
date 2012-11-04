package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public class HabitacionAssembler {
	/**
	 * Crea una nueva instancia de la clase {@link HabitacionDTO} desde un
	 * objeto {@link HabitacionRowGateway}
	 * 
	 * @param obj
	 *            Intancia de la clase {@link HabitacionRowGateway} que contiene
	 *            los datos por convertir
	 * @return Una nueva instancia de la clase {@link HabitacionDTO}
	 */
	public static HabitacionDTO create(Habitacion obj) {
		HabitacionDTO dto = new HabitacionDTO();
		dto.id = obj.getId();
		dto.ocupacionMaxima = obj.getOcupacionMaxima();
		dto.numero = obj.getNumero();
		dto.mobiliario = obj.getMobiliario();
		dto.costo = obj.getCosto();
		dto.reservaciones = obj.getReservaciones();

		return dto;
	}

	/**
	 * Actualizado los datos del dto basado en los del objeto
	 * 
	 * @param obj
	 * @param dto
	 */
	public static void update(Habitacion obj, HabitacionDTO dto) {
		dto.id = obj.getId();
		dto.ocupacionMaxima = obj.getOcupacionMaxima();
		dto.numero = obj.getNumero();
		dto.mobiliario = obj.getMobiliario();
		dto.costo = obj.getCosto();
		dto.reservaciones = obj.getReservaciones();

	}
}