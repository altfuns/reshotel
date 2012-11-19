package cr.ac.una.daw.reshotel.domain;

/**
 * Contruye nuevos objetos Cliente 
 * 
 */
public class ClienteFactory {
	/**
	 * Crea un nuevo objeto cliente con los datos correspondientes.
	 * @param id
	 * @param nombre
	 * @param identificacion
	 * @param telefono
	 * @param numeroTarjetaCredito
	 * @param residencia
	 * @return
	 * Nueva instancia de la clase Cliente
	 */
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
