package cr.ac.una.daw.reshotel.data;

public class Constantes {

	public static final String UBICACION_TABLE_NAME = "ubicacion";
	public static final String HOTEL_TABLE_NAME = "hotel";
	public static final String HABITACION_TABLE_NAME = "habitacion";
	public static final String RESERVACION_TABLE_NAME = "reservacion";
	public static final String CLIENTE_TABLE_NAME = "cliente";

	public class BaseColumns {
		public String ID = "id";
	}

	public class UbicacionColumns extends BaseColumns {
		public String PAIS = "pais";
		public String CIUDAD = "ciudad";
	}

	public class HotelColumns extends BaseColumns {
		public String UBICACION = "ubicacion";
		public String TELEFONO = "telefono";
		public String EMAIL = "email";
		public String CLASE = "clase";
		public String NOMBRE_PERSONA_ENCARGADA = "nombre_persona_encargada";
	}
}
