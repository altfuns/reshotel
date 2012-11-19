package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

/**
 * 
 * UbicacionRepository brinda los metodos necesarios para el matenimiento de Ubicaciones 
 *
 */
public interface UbicacionRepository {
	public boolean insertUbicacion(Ubicacion ubicacion);

	public boolean deleteUbicacion(Ubicacion ubicacion);

	public Ubicacion findUbicacion(int id);

	public boolean updateUbicacion(Ubicacion ubicacion);

	public Collection<Ubicacion> findAllUbicacion();
}
