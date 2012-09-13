package cr.ac.una.daw.reshotel.data;

public class Cliente {

	private String nombre;
	private String identificacion;
	private String telefono;
	private int numeroTarjetaCredito;
	private Ubicacion residencia;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, String identificacion, String telefono,
			int numeroTarjetaCredito, Ubicacion residencia) {
		super();
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

	public Ubicacion getResidencia() {
		return residencia;
	}

	public void setResidencia(Ubicacion residencia) {
		this.residencia = residencia;
	}

}
