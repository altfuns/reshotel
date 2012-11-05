package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.domain.Ubicacion;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class UbicacionAssembler {

	/**
	 * Crea una nueva instancia de la clase {@link UbicacionDTO} desde un objeto
	 * {@link Ubicacion}
	 * 
	 * @param obj
	 *            Intancia de la clase {@link Ubicacion} que contiene los datos
	 *            por convertir
	 * @return Una nueva instancia de la clase {@link UbicacionDTO}
	 */
	public static UbicacionDTO create(Ubicacion obj) {
		UbicacionDTO dto = new UbicacionDTO();
		dto.id = obj.getId();
		dto.ciudad = obj.getCiudad();
		dto.pais = obj.getPais();

		return dto;
	}

	public static Ubicacion create(UbicacionDTO dto) {
		Ubicacion obj = new Ubicacion();
		obj.setId(dto.getId());
		obj.setCiudad(dto.getCiudad());
		obj.setPais(dto.getPais());

		return obj;
	}

	/**
	 * Actualizado los datos del dto basado en los del objeto
	 * 
	 * @param obj
	 * @param dto
	 */
	public static void update(Ubicacion obj, UbicacionDTO dto) {
		dto.id = obj.getId();
		dto.ciudad = obj.getCiudad();
		dto.pais = obj.getPais();

	}
}