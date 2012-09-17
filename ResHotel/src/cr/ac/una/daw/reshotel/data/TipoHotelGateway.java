package cr.ac.una.daw.reshotel.data;

/**
 * 
 * {@link TipoHotelGateway} enumarado para especifcar los tipos de hoteles.
 *
 */
public enum TipoHotelGateway {

	MONTANA(1, "Montaña"), PLAYA(2, "Playa"), CIUDAD(3, "Ciudad");

	private long id;

	private String nombre;

	private TipoHotelGateway(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public static TipoHotelGateway parse(long id) {
		TipoHotelGateway result = MONTANA;
		switch ((int) id) {
		case 1:
			result = MONTANA;
			break;
		case 2:
			result = PLAYA;
			break;
		case 3:
			result = CIUDAD;
			break;

		default:
			break;
		}
		return result;
	}
}
