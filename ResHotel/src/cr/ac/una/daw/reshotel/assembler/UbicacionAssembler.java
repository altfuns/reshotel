package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;
import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class UbicacionAssembler {

	/**
	 * Crea una nueva instancia de la clase {@link UbicacionDTO} desde un objeto
	 * {@link UbicacionRowGateway}
	 * 
	 * @param obj
	 *            Intancia de la clase {@link UbicacionRowGateway} que contiene
	 *            los datos por convertir
	 * @return Una nueva instancia de la clase {@link UbicacionDTO}
	 */
	public static UbicacionDTO create(UbicacionRowGateway obj) {
		UbicacionDTO dto = new UbicacionDTO();
		dto.id = obj.getId();
		dto.ciudad = obj.getCiudad();
		dto.pais = obj.getPais();

		return dto;
	}
}