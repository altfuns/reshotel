package cr.ac.una.daw.reshotel.dto;

import java.util.Date;


public class ReservacionDTO extends DTO{

	public Date fechaEntrada;
	public Date fechaSalida;
	public int ocupacion; // TODO revisar tipo de dato
	public float monto;
	public String identificacionCliente;

}
