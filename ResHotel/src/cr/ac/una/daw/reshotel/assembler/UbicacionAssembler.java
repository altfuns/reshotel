package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class UbicacionAssembler {
	public static UbicacionDTO create(UbicacionRowGateway obj) {
		UbicacionDTO dto = new UbicacionDTO();
		dto.id = obj.getId();
		dto.ciudad = obj.getCiudad();
		dto.pais = obj.getPais();

		return dto;
	}
}