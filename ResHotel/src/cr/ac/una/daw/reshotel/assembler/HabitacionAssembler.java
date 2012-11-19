package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

/**
 * Ensamblador de la clase Habitacion
 * 
 * @author alfonso
 * 
 */
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
		dto.hotelId = obj.getHotelId();
		dto.ocupacionMaxima = obj.getOcupacionMaxima();
		dto.numero = obj.getNumero();
		dto.mobiliario = obj.getMobiliario();
		dto.costo = obj.getCosto();
		dto.reservaciones = obj.getReservaciones();

		return dto;
	}

	/**
	 * Create un objeto habitacion desde un objeto HabitacionDTO
	 * 
	 * @param dto
	 * @return
	 * Nueva instancia de la clase Habitacion
	 */
	public static Habitacion create(HabitacionDTO dto) {
		Habitacion obj = new Habitacion();
		obj.setId(dto.getId());
		obj.setHotelId(dto.getHotelId());
		obj.setOcupacionMaxima(dto.getOcupacionMaxima());
		obj.setNumero(dto.getNumero());
		obj.setMobiliario(dto.getMobiliario());
		obj.setCosto(dto.getCosto());
		obj.setReservaciones(dto.getReservaciones());
		if (dto.getHotel() != null) {
			obj.setHotel(HotelAssembler.create(dto.getHotel()));
		}

		return obj;
	}

	/**
	 * Actualizado los datos del dto basado en los del objeto
	 * 
	 * @param obj
	 * @param dto
	 */
	public static void update(Habitacion obj, HabitacionDTO dto) {
		dto.id = obj.getId();
		dto.hotelId = obj.getHotelId();
		dto.ocupacionMaxima = obj.getOcupacionMaxima();
		dto.numero = obj.getNumero();
		dto.mobiliario = obj.getMobiliario();
		dto.costo = obj.getCosto();
		dto.reservaciones = obj.getReservaciones();

	}
}