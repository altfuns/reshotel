package cr.ac.una.daw.reshotel.domain;

import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.ClienteColumns;

/**
 * 
 * Clase contiene los datos de una fila de la tabla CLIENTE.
 *
 */
public class Cliente extends DomainObject{

	private String nombre;
	private String identificacion;
	private String telefono;
	private int numeroTarjetaCredito;
	private int residenciaId;
	private Ubicacion residencia;

	public Cliente() {
		super();
	}

	public Cliente(int id, String nombre, String identificacion,
			String telefono, int numeroTarjetaCredito,
			Ubicacion residencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.numeroTarjetaCredito = numeroTarjetaCredito;
		this.residencia = residencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getNumeroTarjetaCredito() {
		return numeroTarjetaCredito;
	}

	public void setNumeroTarjetaCredito(int numeroTarjetaCredito) {
		this.numeroTarjetaCredito = numeroTarjetaCredito;
	}

	public int getResidenciaId() {
		return residenciaId;
	}

	public void setResidenciaId(int residenciaId) {
		this.residenciaId = residenciaId;
	}

	public Ubicacion getResidencia() {
		return residencia;
	}

	public void setResidencia(Ubicacion residencia) {
		this.residencia = residencia;
	}

}
