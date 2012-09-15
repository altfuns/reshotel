package cr.ac.una.daw.reshotel.data;

public class Constantes {

	public static final String UBICACION_TABLE_NAME = "ubicacion";
	public static final String HOTEL_TABLE_NAME = "hotel";
	public static final String HABITACION_TABLE_NAME = "habitacion";
	public static final String RESERVACION_TABLE_NAME = "reservacion";
	public static final String CLIENTE_TABLE_NAME = "cliente";

	public static interface BaseColumns {
		public String ID = "id";
	}

	public static interface UbicacionColumns extends BaseColumns {
		public String PAIS = "pais";
		public String CIUDAD = "ciudad";
	}

	public static interface HotelColumns extends BaseColumns {
		public String UBICACION = "ubicacion";
		public String TELEFONO = "telefono";
		public String EMAIL = "email";
		public String CLASE = "clase";
		public String NOMBRE_PERSONA_ENCARGADA = "nombre_persona_encargada";
	}

	public static interface HabitacionColumns extends BaseColumns {
		public String OCUPACION_MAXIMA = "ocupacion_maxima";
		public String NUMERO = "numero";
		public String MOBILIARIO = "mobiliario";
		public String COSTO = "costo";
	}

	public static interface ReservacionColumns extends BaseColumns {
		public String FECHA_ENTRADA = "fecha_entrada";
		public String FECHA_SALIDA = "fecha_salida";
		public String OCUPACION = "ocupacion";
		public String MONTO = "monto";
		public String IDENTIFICACION_CLIENTE = "identificacion_cliente";
	}

	public static interface ClienteColumns extends BaseColumns {
		public String NOMBRE = "nombre";
		public String IDENTIFICACION = "identificacion";
		public String TELEFONO = "telefono";
		public String NUMERO_TARJETA_CREDITO = "numero_tarjeta_credito";
		public String RESIDENCIA = "residencia";
	}

}
