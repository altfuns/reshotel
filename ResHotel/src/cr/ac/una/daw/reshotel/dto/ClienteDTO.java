package cr.ac.una.daw.reshotel.dto;

/**
 * Objeto de transferencia de datos de la entidad cliente
 *
 */
public class ClienteDTO extends DTO{

	public String nombre;
	public String identificacion;
	public String telefono;
	public int numeroTarjetaCredito;
	public int residenciaId;
	public UbicacionDTO residencia = new UbicacionDTO();
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
	public UbicacionDTO getResidencia() {
		return residencia;
	}
	public void setResidencia(UbicacionDTO residencia) {
		this.residencia = residencia;
	}
	public int getResidenciaId() {
		return residenciaId;
	}
	public void setResidenciaId(int residenciaId) {
		this.residenciaId = residenciaId;
	}
	
	
}
