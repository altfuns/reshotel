package cr.ac.una.daw.reshotel.domain;

/**
 * 
 * {@link Hotel} representa los datos de una fila de la tabla HOTEL
 * 
 */
public class Hotel extends DomainObject {

	private int ubicacionId;
	private Ubicacion ubicacion;
	private String telefono;
	private String email;
	private int clase;
	private String nombrePersonaEncargada;

	public Hotel() {
		super();
	}

	public Hotel(Ubicacion ubicacion, String telefono, String email, int clase,
			String nombrePersonaEncargada) {
		super();
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.email = email;
		this.clase = clase;
		this.nombrePersonaEncargada = nombrePersonaEncargada;
	}

	public int getUbicacionId() {
		return ubicacionId;
	}

	public void setUbicacionId(int ubicacionId) {
		this.ubicacionId = ubicacionId;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public String getNombrePersonaEncargada() {
		return nombrePersonaEncargada;
	}

	public void setNombrePersonaEncargada(String nombrePersonaEncargada) {
		this.nombrePersonaEncargada = nombrePersonaEncargada;
	}

}