package cr.ac.una.daw.reshotel.domain;

import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.UbicacionColumns;

/**
 * 
 * {@link Ubicacion} representa los datos de una fila de la tabla UBICACION
 * 
 */
public class Ubicacion extends DomainObject {

	private String pais;
	private String ciudad;

	public Ubicacion() {
		super();
	}

	public Ubicacion(int id, String pais, String ciudad) {
		super();
		this.id = id;
		this.pais = pais;
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
}
