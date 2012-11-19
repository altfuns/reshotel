package cr.ac.una.daw.reshotel.service;

import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.ReservacionRepository;
import cr.ac.una.daw.reshotel.domain.Ubicacion;
import cr.ac.una.daw.reshotel.domain.UbicacionRepository;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

/**
 * Implementa los metodos necesarios para dar mantenimiento a una ubicacion.
 * Interactua con el repositio de datos de la capa de acceso a datos.
 *
 */
public class SimpleUbicacionManager implements UbicacionManager {
	private List<Ubicacion> ubicaciones;

	private UbicacionRepository repository;

	public void setRepository(UbicacionRepository repository) {
		this.repository = repository;
	}
	
	public Collection<Ubicacion> getUbicaciones() {
		return repository.findAllUbicacion();
	}

	public void setUbicaciones(List<Ubicacion> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	@Override
	public Ubicacion find(int id) {
		return repository.findUbicacion(id);
	}

	@Override
	public void save(Ubicacion ubicacion) {
		if (ubicacion.getId() != -1) {
			repository.updateUbicacion(ubicacion);
		} else {
			repository.insertUbicacion(ubicacion);
		}
	}

	@Override
	public void delete(Ubicacion ubicacion) {
		// TODO Auto-generated method stub

	}
}