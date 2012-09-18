package cr.ac.una.daw.reshotel.dto;

/**
 * Objeto de transferencia de datos de la entidad hotel
 *
 */
public class HotelDTO extends DTO{

	public String telefono;
	public String email;
	public int clase;
	public String nombrePersonaEncargada;
	public UbicacionDTO ubicacion = new UbicacionDTO();
}