package cr.ac.una.daw.reshotel.domain;

/**
 * Contruye nuevos objetos Reservacion 
 * 
 */
public class ReservacionFactory {
	/**
	 * Contruye una nueva Reservacion
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param ocupacion
	 * @param monto
	 * @param identificacionCliente
	 * @return
	 * Nueva instancia de la clase Reseracion
	 */
	public Reservacion create(String fechaEntrada, String fechaSalida,
			int ocupacion, double monto, String identificacionCliente) {
		try {
			Reservacion reservacion = new Reservacion(fechaEntrada,
					fechaSalida, ocupacion, monto, identificacionCliente);
			return reservacion;
		} catch (Exception e) {
			return null;
		}
	}
}
