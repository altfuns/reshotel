package cr.ac.una.daw.reshotel.domain;

public class HotelFactory {
	public Hotel create(Ubicacion ubicacion, String telefono, String email,
			int clase, String nombrePersonaEncargada) {
		try {
			Hotel hotel = new Hotel(ubicacion, telefono, email, clase,
					nombrePersonaEncargada);
			return hotel;
		} catch (Exception e) {
			return null;
		}
	}
}
