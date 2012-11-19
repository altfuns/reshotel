package cr.ac.una.daw.reshotel.domain;

/**
 * Contruye nuevos objetos Ubicacion 
 * 
 */
public class UbicacionFactory {
	/**
	 * Crea una nueva ubicacion
	 * @param id
	 * @param pais
	 * @param ciudad
	 * @return
	 * Nueva instancia de la clase Reservacion
	 */
	public Ubicacion create(int id, String pais, String ciudad) {
		try {
			Ubicacion ubicacion = new Ubicacion(id, pais, ciudad);
			return ubicacion;
		} catch (Exception e) {
			return null;
		}
	}
}
