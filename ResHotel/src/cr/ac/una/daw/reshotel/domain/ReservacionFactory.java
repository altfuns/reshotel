package cr.ac.una.daw.reshotel.domain;

public class ReservacionFactory {
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
