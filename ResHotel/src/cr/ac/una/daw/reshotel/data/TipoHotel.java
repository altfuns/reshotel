package cr.ac.una.daw.reshotel.data;

public enum TipoHotel {

	MONTANA(1, "Montaña"), PLAYA(2, "Playa"), CIUDAD(3, "Ciudad");

	private long id;

	private String nombre;

	private TipoHotel(long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public static TipoHotel parse(long id) {
		TipoHotel result = MONTANA;
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
