package cr.ac.una.daw.reshotel.domain;

public class UbicacionFactory {
	public Ubicacion create(int id, String pais, String ciudad) {
		try {
			Ubicacion ubicacion = new Ubicacion(id, pais, ciudad);
			return ubicacion;
		} catch (Exception e) {
			return null;
		}
	}
}
