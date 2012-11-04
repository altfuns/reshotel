package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.domain.Hotel;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelAssembler {
	/**
	 * Encargado de convertir un Hotel en un HotelDTO
	 * 
	 * @param obj
	 *            Representa un RowGateway del tipo Hotel
	 * @return HotelDTO con los datos correspondientes
	 */
	public static HotelDTO create(Hotel obj) {
		HotelDTO dto = new HotelDTO();
		dto.id = obj.getId();
		dto.telefono = obj.getTelefono();
		dto.email = obj.getEmail();
		dto.clase = obj.getClase();
		dto.nombrePersonaEncargada = obj.getNombrePersonaEncargada();
		dto.ubicacion.id = obj.getUbicacionId();

		return dto;
	}

	/**
	 * Actualizado los datos del dto basado en los del objeto
	 * 
	 * @param obj
	 * @param dto
	 */
	public static void update(Hotel obj, HotelDTO dto) {
		dto.id = obj.getId();
		dto.telefono = obj.getTelefono();
		dto.email = obj.getEmail();
		dto.clase = obj.getClase();
		dto.nombrePersonaEncargada = obj.getNombrePersonaEncargada();
		dto.ubicacion.id = obj.getUbicacionId();
	}
}