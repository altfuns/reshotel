package cr.ac.una.daw.reshotel.display;

import java.util.List;

import cr.ac.una.daw.reshotel.data.ReservacionGateway;

public class HabitacionDTO {

	public int ocupacionMaxima;
	public int numero;
	//TODO: revisar que es mobiliario
	public String mobiliario;
	public float costo;
	public List<ReservacionGateway> reservaciones;
}
