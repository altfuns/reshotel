package cr.ac.una.daw.reshotel.dto;

/**
 * Objeto de transferencia de datos de la entidad hotel
 * 
 */
public class HotelDTO extends DTO {

	public String nombre;
	public String telefono;
	public String email;
	public int clase;
	public String nombrePersonaEncargada;
	public int ubicacionId;
	public UbicacionDTO ubicacion = new UbicacionDTO();

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public int getUbicacionId() {
		return ubicacionId;
	}

	public void setUbicacionId(int ubicacionId) {
		this.ubicacionId = ubicacionId;
	}

	public UbicacionDTO getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionDTO ubicacion) {
		this.ubicacion = ubicacion;
	}
}