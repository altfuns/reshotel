package cr.ac.una.daw.reshotel.dto;


public class HotelDTO extends DTO{

	public String telefono;
	public String email;
	public int clase;
	public String nombrePersonaEncargada;
	public UbicacionDTO ubicacion = new UbicacionDTO();
}