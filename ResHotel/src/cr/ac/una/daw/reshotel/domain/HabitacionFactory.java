package cr.ac.una.daw.reshotel.domain;

import java.util.List;

/**
 * Contruye nuevos objetos Habitacion 
 * 
 */
public class HabitacionFactory {
	/**
	 * Contruye un nuevo objeto Habitacion.
	 * @param ocupacionMaxima
	 * @param numero
	 * @param mobiliario
	 * @param costo
	 * @param reservaciones
	 * @return
	 * Nueva instancia de la clase Habitacion
	 */
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
