package cr.ac.una.daw.reshotel.domain;

/**
 * Contruye nuevos objetos Hoteles 
 * 
 */
public class HotelFactory {
	/**
	 * Contruye un nuevo objeto Hotel
	 * @param nombre
	 * @param ubicacion
	 * @param telefono
	 * @param email
	 * @param clase
	 * @param nombrePersonaEncargada
	 * @return
	 * Nueva instancia de la clase Hotel
	 */
	public Hotel create(String nombre,Ubicacion ubicacion, String telefono, String email,
			int clase, String nombrePersonaEncargada) {
		try {
			Hotel hotel = new Hotel(nombre, ubicacion, telefono, email, clase,
					nombrePersonaEncargada);
			return hotel;
		} catch (Exception e) {
			return null;
		}
	}
}
