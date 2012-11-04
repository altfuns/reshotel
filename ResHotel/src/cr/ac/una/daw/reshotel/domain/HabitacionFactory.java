package cr.ac.una.daw.reshotel.domain;

import java.util.List;

public class HabitacionFactory {
	public Habitacion create(int ocupacionMaxima, int numero,
			String mobiliario, float costo, List<Reservacion> reservaciones) {
		try {
			Habitacion habitacion = new Habitacion(ocupacionMaxima, numero,
					mobiliario, costo, reservaciones);
			return habitacion;
		} catch (Exception e) {
			return null;
		}
	}
}
