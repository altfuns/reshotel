package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public interface UbicacionManager extends Serializable {
	public List<UbicacionDTO> getUbicaciones();

	public UbicacionDTO find(int id);

	public void save(UbicacionDTO ubicacion);
	
	public void delete(UbicacionDTO ubicacion);
}