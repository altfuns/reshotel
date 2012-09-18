package cr.ac.una.daw.reshotel.dto;


/**
 * Objeto de transferencia de datos de la entidad reservacion
 *
 */
public class ReservacionDTO extends DTO {

	public int habitacionId;
	public String fechaEntrada;
	public String fechaSalida;
	public int ocupacion; // TODO revisar tipo de dato
	public double monto;
	public String identificacionCliente;

}
