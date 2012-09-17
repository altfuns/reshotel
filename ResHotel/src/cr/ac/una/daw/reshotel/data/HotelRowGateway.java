package cr.ac.una.daw.reshotel.data;

import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.ClienteColumns;
import cr.ac.una.daw.reshotel.data.Constantes.HotelColumns;

/**
 * 
 * {@link HotelRowGateway} representa los datos de una fila de la tabla HOTEL
 * 
 */
public class HotelRowGateway extends RowGateway<HotelRowGateway> {

	private int ubicacionId;
	private UbicacionRowGateway ubicacion;
	private String telefono;
	private String email;
	private int clase;
	private String nombrePersonaEncargada;

	public HotelRowGateway() {
		super();
	}

	public HotelRowGateway(UbicacionRowGateway ubicacion, String telefono,
			String email, int clase, String nombrePersonaEncargada) {
		super();
		this.ubicacion = ubicacion;
		this.telefono = telefono;
		this.email = email;
		this.clase = clase;
		this.nombrePersonaEncargada = nombrePersonaEncargada;
	}

	public int getUbicacionId() {
		return ubicacionId;
	}

	public void setUbicacionId(int ubicacionId) {
		this.ubicacionId = ubicacionId;
	}

	public UbicacionRowGateway getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(UbicacionRowGateway ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getClase() {
		return clase;
	}

	public void setClase(int clase) {
		this.clase = clase;
	}

	public String getNombrePersonaEncargada() {
		return nombrePersonaEncargada;
	}

	public void setNombrePersonaEncargada(String nombrePersonaEncargada) {
		this.nombrePersonaEncargada = nombrePersonaEncargada;
	}

	@Override
	public String getTableName() {
		return Constantes.HOTEL_TABLE_NAME;
	}

	@Override
	public String getInsertStatement() {
		return "INSERT INTO " + getTableName() + "(" + HotelColumns.TELEFONO
				+ ", " + HotelColumns.EMAIL + "," + HotelColumns.CLASE + ","
				+ HotelColumns.NOMBRE_PERSONA_ENCARGADA + ","
				+ HotelColumns.UBICACION + "," + HotelColumns.ID + ")"
				+ " VALUES(?,?,?,?,?,?)";
	}

	@Override
	public String getUpdateStatement() {
		return "UPDATE	 " + getTableName() + " SET " + HotelColumns.TELEFONO
				+ " = ?" + ", " + HotelColumns.EMAIL + " = ?" + ", "
				+ HotelColumns.CLASE + " = ?" + ", "
				+ HotelColumns.NOMBRE_PERSONA_ENCARGADA + " = ?" + ", "
				+ HotelColumns.UBICACION + " = ?" + " WHERE " + HotelColumns.ID
				+ " = ?";
	}

	@Override
	public HotelRowGateway fromMap(Map<String, Object> values) {
		HotelRowGateway result = new HotelRowGateway();
		result.setId((Integer) values.get(HotelColumns.ID));
		result.setTelefono((String) values.get(HotelColumns.TELEFONO));
		result.setEmail((String) values.get(HotelColumns.EMAIL));
		result.setClase((Integer) values.get(HotelColumns.CLASE));
		result.setNombrePersonaEncargada((String) values
				.get(HotelColumns.NOMBRE_PERSONA_ENCARGADA));
		result.setUbicacionId((Integer) values.get(HotelColumns.UBICACION));

		return result;
	}

	@Override
	public Object[] getUpdateArgs() {
		return new Object[] { getTelefono(), getEmail(), getClase(),
				getNombrePersonaEncargada(), getUbicacionId(), getId() };
	}

}
