package cr.ac.una.daw.reshotel.data;

public class Ubicacion {

	private String pais;
	private String ciudad;

	public Ubicacion() {
		super();
	}

	public Ubicacion(String pais, String ciudad) {
		super();
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
