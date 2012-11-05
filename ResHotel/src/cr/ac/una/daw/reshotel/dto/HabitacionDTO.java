package cr.ac.una.daw.reshotel.dto;

import java.util.List;

import cr.ac.una.daw.reshotel.domain.Reservacion;

/**
 * Objeto de transferencia de datos de la entidad habitacion
 * 
 */
public class HabitacionDTO extends DTO {

	public int ocupacionMaxima;
	public int numero;
	// TODO: revisar que es mobiliario
	public String mobiliario;
	public double costo;
	public List<Reservacion> reservaciones;

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
