package cr.ac.una.daw.reshotel.dto;


/**
 * Objeto de transferencia de datos de la entidad ubicacion
 *
 */
public class UbicacionDTO extends DTO{
	public String ciudad;
	public String pais;
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
}
