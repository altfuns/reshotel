package cr.ac.una.daw.reshotel.domain;

import java.util.List;
import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.HabitacionColumns;

/**
 * 
 * {@link Habitacion} representa los datos de una fila de la tabla
 * HABITACION
 * 
 */
public class Habitacion extends DomainObject {

	private int hotelId;
	private int ocupacionMaxima;
	private int numero;
	// TODO: revisar que es mobiliario
	private String mobiliario;
	private double costo;
	private List<Reservacion> reservaciones;

	public Habitacion() {
		super();
	}

	public Habitacion(int ocupacionMaxima, int numero,
			String mobiliario, float costo,
			List<Reservacion> reservaciones) {
		super();
		this.ocupacionMaxima = ocupacionMaxima;
		this.numero = numero;
		this.mobiliario = mobiliario;
		this.costo = costo;
		this.reservaciones = reservaciones;
	}

	
	
	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public List<Reservacion> getReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(List<Reservacion> reservaciones) {
		this.reservaciones = reservaciones;
	}
}
