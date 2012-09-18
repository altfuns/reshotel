package cr.ac.una.daw.reshotel.dto;

/**
 * Objeto de transferencia de datos de la entidad cliente
 *
 */
public class ClienteDTO extends DTO{

	public String nombre;
	public String identificacion;
	public String telefono;
	public int numeroTarjetaCredito;
	public UbicacionDTO residencia = new UbicacionDTO();
}
