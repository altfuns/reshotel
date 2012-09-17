package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
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
	public static HabitacionDTO create(HabitacionRowGateway obj) {
		HabitacionDTO dto = new HabitacionDTO();
		dto.id = obj.getId();
		dto.ocupacionMaxima = obj.getOcupacionMaxima();
		dto.numero = obj.getNumero();
		dto.mobiliario = obj.getMobiliario();
		dto.costo = obj.getCosto();
		dto.reservaciones = obj.getReservaciones();

		return dto;
	}
}