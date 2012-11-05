package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Ubicacion;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public interface UbicacionManager extends Serializable {
	public Collection<Ubicacion> getUbicaciones();

	public Ubicacion find(int id);

	public void save(Ubicacion ubicacion);
	
	public void delete(Ubicacion ubicacion);
}