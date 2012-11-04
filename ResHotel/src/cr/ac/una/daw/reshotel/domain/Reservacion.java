package cr.ac.una.daw.reshotel.domain;


/**
 * 
 * {@link Reservacion} representa los datos de una fila de la tabla RESERVACION
 * 
 */
public class Reservacion extends DomainObject {

	private int habitacionId;
	private Habitacion habitacion;
	private String fechaEntrada;
	private String fechaSalida;
	private int ocupacion; // TODO revisar tipo de dato
	private double monto;
	private String identificacionCliente;

	public Reservacion() {
		super();
	}

	public Reservacion(String fechaEntrada, String fechaSalida, int ocupacion,
			double monto, String identificacionCliente) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.ocupacion = ocupacion;
		this.monto = monto;
		this.identificacionCliente = identificacionCliente;
	}

	public int getHabitacionId() {
		return habitacionId;
	}

	public void setHabitacionId(int habitacionId) {
		this.habitacionId = habitacionId;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

}
