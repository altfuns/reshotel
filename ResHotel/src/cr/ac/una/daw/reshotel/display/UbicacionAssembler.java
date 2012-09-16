package cr.ac.una.daw.reshotel.display;

import cr.ac.una.daw.reshotel.data.UbicacionRowGateway;

public class UbicacionAssembler {
	public static UbicacionDTO Create(UbicacionRowGateway obj) {
		UbicacionDTO dto = new UbicacionDTO();
		dto.id = obj.getId();
		dto.ciudad = obj.getCiudad();
		dto.pais = obj.getPais();

		return dto;
	}
}