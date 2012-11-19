package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Ubicacion;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

/**
 * 
 * UbicacionManager provee los metodos necesarios para el matenimiento de una ubicacion.
 * Interactua con la capa de acceso a datos.
 *
 */
public interface UbicacionManager extends Serializable {
	public Collection<Ubicacion> getUbicaciones();

	public Ubicacion find(int id);

	public void save(Ubicacion ubicacion);
	
	public void delete(Ubicacion ubicacion);
}