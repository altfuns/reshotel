package cr.ac.una.daw.reshotel.data;

import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.ClienteColumns;

public class ClienteRowGateway extends RowGateway<ClienteRowGateway> {

	private String nombre;
	private String identificacion;
	private String telefono;
	private int numeroTarjetaCredito;
	private int residenciaId;
	private UbicacionRowGateway residencia;

	public ClienteRowGateway() {
		super();
	}

	public ClienteRowGateway(int id, String nombre, String identificacion,
			String telefono, int numeroTarjetaCredito,
			UbicacionRowGateway residencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.telefono = telefono;
		this.numeroTarjetaCredito = numeroTarjetaCredito;
		this.residencia = residencia;
	}

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

	public int getResidenciaId() {
		return residenciaId;
	}

	public void setResidenciaId(int residenciaId) {
		this.residenciaId = residenciaId;
	}

	public UbicacionRowGateway getResidencia() {
		return residencia;
	}

	public void setResidencia(UbicacionRowGateway residencia) {
		this.residencia = residencia;
	}

	@Override
	public String getTableName() {
		return Constantes.CLIENTE_TABLE_NAME;
	}

	@Override
	public String getInsertStatement() {
		return "INSERT INTO " + getTableName() + "("
				+ ClienteColumns.IDENTIFICACION + ", " + ClienteColumns.NOMBRE
				+ "," + ClienteColumns.TELEFONO + ","
				+ ClienteColumns.NUMERO_TARJETA_CREDITO + ","
				+ ClienteColumns.RESIDENCIA + "," + ClienteColumns.ID + ")"
				+ " VALUES(?,?,?,?,?,?)";
	}

	@Override
	public String getUpdateStatement() {
		return "UPDATE " + getTableName() + " SET "
				+ ClienteColumns.IDENTIFICACION + " = ?" + ", "
				+ ClienteColumns.NOMBRE + " = ?" + ", "
				+ ClienteColumns.TELEFONO + " = ?" + ", "
				+ ClienteColumns.NUMERO_TARJETA_CREDITO + " = ?" + ", "
				+ ClienteColumns.RESIDENCIA + " = ?" + " WHERE "
				+ ClienteColumns.ID + " = ?";
	}

	@Override
	public ClienteRowGateway fromMap(Map<String, Object> values) {
		ClienteRowGateway result = new ClienteRowGateway();
		result.setId((Integer) values.get(ClienteColumns.ID));
		result.setNombre((String) values.get(ClienteColumns.NOMBRE));
		result.setIdentificacion((String) values
				.get(ClienteColumns.IDENTIFICACION));
		result.setNumeroTarjetaCredito((Integer) values
				.get(ClienteColumns.NUMERO_TARJETA_CREDITO));
		result.setResidenciaId((Integer) values.get(ClienteColumns.RESIDENCIA));

		return result;
	}

	@Override
	public Object[] getUpdateArgs() {
		return new Object[] { getIdentificacion(), getNombre(), getTelefono(),
				getNumeroTarjetaCredito(), getResidenciaId(), getId() };
	}

}
