package cr.ac.una.daw.reshotel.data;

import java.util.List;

public class Habitacion {

	private int ocupacionMaxima;
	private int numero;
	// TODO: revisar que es mobiliario
	private String mobiliario;
	private float costo;
	private List<Reservacion> reservaciones;

	public Habitacion() {
		super();
	}

	public Habitacion(int ocupacionMaxima, int numero, String mobiliario,
			float costo, List<Reservacion> reservaciones) {
		super();
		this.ocupacionMaxima = ocupacionMaxima;
		this.numero = numero;
		this.mobiliario = mobiliario;
		this.costo = costo;
		this.reservaciones = reservaciones;
	}

	public int getOcupacionMaxima() {
		return ocupacionMaxima;
	}

	public void setOcupacionMaxima(int ocupacionMaxima) {
		this.ocupacionMaxima = ocupacionMaxima;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMobiliario() {
		return mobiliario;
	}

	public void setMobiliario(String mobiliario) {
		this.mobiliario = mobiliario;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public List<Reservacion> getReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(List<Reservacion> reservaciones) {
		this.reservaciones = reservaciones;
	}

}
