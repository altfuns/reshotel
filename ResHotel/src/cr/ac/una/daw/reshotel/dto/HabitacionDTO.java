package cr.ac.una.daw.reshotel.dto;

import java.util.List;

import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;

/**
 * Objeto de transferencia de datos de la entidad habitacion
 *
 */
public class HabitacionDTO extends DTO{

	public int ocupacionMaxima;
	public int numero;
	// TODO: revisar que es mobiliario
	public String mobiliario;
	public double costo;
	public List<ReservacionRowGateway> reservaciones;
}
