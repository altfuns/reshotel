package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

public interface UbicacionRepository {
	public boolean insertUbicacion(Ubicacion ubicacion);

	public boolean deleteUbicacion(Ubicacion ubicacion);

	public Ubicacion findUbicacion(int id);

	public boolean updateUbicacion(Ubicacion ubicacion);

	public Collection<Ubicacion> findAllUbicacion();
}
