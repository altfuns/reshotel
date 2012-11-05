package cr.ac.una.daw.reshotel.service;

import java.util.List;

import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class SimpleUbicacionManager implements UbicacionManager {
	private List<UbicacionDTO> ubicaciones;

	public List<UbicacionDTO> getUbicaciones() {
		return ubicaciones;
	}

	public void setUbicacions(List<UbicacionDTO> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}

	@Override
	public UbicacionDTO find(int id) {
		for (UbicacionDTO ubicacion : ubicaciones) {
			if (id == ubicacion.id) {
				return ubicacion;
			}
		}
		return null;
	}

	@Override
	public void save(UbicacionDTO ubicacion) {

	}

	@Override
	public void delete(UbicacionDTO ubicacion) {
		// TODO Auto-generated method stub

	}
}