package cr.ac.una.daw.reshotel.data;

import java.util.Date;

public class ReservacionRowGateway {

	private Date fechaEntrada;
	private Date fechaSalida;
	private int ocupacion; // TODO revisar tipo de dato
	private float monto;
	private String identificacionCliente;

	public ReservacionRowGateway() {
		super();
	}

	public ReservacionRowGateway(Date fechaEntrada, Date fechaSalida, int ocupacion,
			float monto, String identificacionCliente) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.ocupacion = ocupacion;
		this.monto = monto;
		this.identificacionCliente = identificacionCliente;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

}
