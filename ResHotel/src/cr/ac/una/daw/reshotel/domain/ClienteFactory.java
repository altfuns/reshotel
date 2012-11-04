package cr.ac.una.daw.reshotel.domain;

public class ClienteFactory {
	public Cliente create(int id, String nombre, String identificacion,
			String telefono, int numeroTarjetaCredito, Ubicacion residencia) {
		try {
			Cliente cliente = new Cliente(id, nombre, identificacion, telefono,
					numeroTarjetaCredito, residencia);
			return cliente;
		} catch (Exception e) {
			return null;
		}
	}
}
