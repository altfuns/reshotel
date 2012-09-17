package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelAssembler {
	/**
	 * Encargado de convertir un HotelRowGateway en un HotelDTO
	 * 
	 * @param obj
	 *            Representa un RowGateway del tipo Hotel
	 * @return HotelDTO con los datos correspondientes
	 */
	public static HotelDTO create(HotelRowGateway obj) {
		HotelDTO dto = new HotelDTO();
		dto.id = obj.getId();
		dto.telefono = obj.getTelefono();
		dto.email = obj.getEmail();
		dto.clase = obj.getClase();
		dto.nombrePersonaEncargada = obj.getNombrePersonaEncargada();
		dto.ubicacion.id = obj.getUbicacionId();

		return dto;
	}
}