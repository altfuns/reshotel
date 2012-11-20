package cr.ac.una.daw.reshotel.dto;

import cr.ac.una.daw.reshotel.domain.Habitacion;


/**
 * Objeto de transferencia de datos de la entidad reservacion
 *
 */
public class ReservacionDTO extends DTO {

	public int habitacionId;
	public HabitacionDTO habitacion;
	public String fechaEntrada;
	public String fechaSalida;
	public int ocupacion; // TODO revisar tipo de dato
	public double monto;
	public String identificacionCliente;
	public int getHabitacionId() {
		return habitacionId;
	}
	public void setHabitacionId(int habitacionId) {
		this.habitacionId = habitacionId;
	}

	public HabitacionDTO getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(HabitacionDTO habitacion) {
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
