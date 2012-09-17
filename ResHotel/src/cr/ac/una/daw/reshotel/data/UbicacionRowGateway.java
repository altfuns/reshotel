package cr.ac.una.daw.reshotel.data;

import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.UbicacionColumns;

/**
 * 
 * {@link UbicacionRowGateway} representa los datos de una fila de la tabla
 * UBICACION
 * 
 */
public class UbicacionRowGateway extends RowGateway<UbicacionRowGateway> {

	private String pais;
	private String ciudad;

	public UbicacionRowGateway() {
		super();
	}

	public UbicacionRowGateway(int id, String pais, String ciudad) {
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

	@Override
	public String getTableName() {
		return Constantes.UBICACION_TABLE_NAME;
	}

	@Override
	public String getInsertStatement() {
		return "INSERT INTO " + getTableName() + "(" + UbicacionColumns.PAIS
				+ ", " + UbicacionColumns.CIUDAD + "," + UbicacionColumns.ID
				+ ")" + " VALUES(?,?,?)";
	}

	@Override
	public String getUpdateStatement() {
		return "UPDATE " + getTableName() + " SET " + UbicacionColumns.PAIS
				+ " = ?" + ", " + UbicacionColumns.PAIS + " = ?" + " WHERE "
				+ UbicacionColumns.ID + " = ?";
	}

	@Override
	public UbicacionRowGateway fromMap(Map<String, Object> values) {
		UbicacionRowGateway result = new UbicacionRowGateway(
				(Integer) values.get(UbicacionColumns.ID),
				(String) values.get(UbicacionColumns.PAIS),
				(String) values.get(UbicacionColumns.CIUDAD));
		return result;
	}

	@Override
	public Object[] getUpdateArgs() {
		return new Object[] { getPais(), getCiudad(), getId() };
	}

}
