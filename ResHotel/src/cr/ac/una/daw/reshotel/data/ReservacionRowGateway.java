package cr.ac.una.daw.reshotel.data;

import java.util.Date;
import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.ReservacionColumns;

public class ReservacionRowGateway extends RowGateway<ReservacionRowGateway> {

	private int habitacionId;
	private HabitacionRowGateway habitacion;
	private Date fechaEntrada;
	private Date fechaSalida;	
	private int ocupacion; // TODO revisar tipo de dato
	private float monto;
	private String identificacionCliente;

	public ReservacionRowGateway() {
		super();
	}

	public ReservacionRowGateway(Date fechaEntrada, Date fechaSalida,
			int ocupacion, float monto, String identificacionCliente) {
		super();
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.ocupacion = ocupacion;
		this.monto = monto;
		this.identificacionCliente = identificacionCliente;
	}

	public int getHabitacionId() {
		return habitacionId;
	}

	public void setHabitacionId(int habitacionId) {
		this.habitacionId = habitacionId;
	}

	public HabitacionRowGateway getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(HabitacionRowGateway habitacion) {
		this.habitacion = habitacion;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(int ocupacion) {
		this.ocupacion = ocupacion;
	}

	public float getMonto() {
		return monto;
	}

	public void setMonto(float monto) {
		this.monto = monto;
	}

	public String getIdentificacionCliente() {
		return identificacionCliente;
	}

	public void setIdentificacionCliente(String identificacionCliente) {
		this.identificacionCliente = identificacionCliente;
	}

	@Override
	public String getTableName() {
		return Constantes.RESERVACION_TABLE_NAME;
	}

	@Override
	public String getInsertStatement() {
		return "INSERT INTO " + getTableName() + "("
				+ ReservacionColumns.HABITACION + ", "
				+ ReservacionColumns.FECHA_ENTRADA + ","
				+ ReservacionColumns.FECHA_SALIDA + ","
				+ ReservacionColumns.OCUPACION + "," + ReservacionColumns.MONTO
				+ "," + ReservacionColumns.IDENTIFICACION_CLIENTE + ","
				+ ReservacionColumns.ID + ")" + " VALUES(?,?,?,?,?,?,?)";
	}

	@Override
	public String getUpdateStatement() {
		return "UPDATE	 " + getTableName() + "SET "
				+ ReservacionColumns.HABITACION + " = ?" + ", "
				+ ReservacionColumns.FECHA_ENTRADA + " = ?" + ", "
				+ ReservacionColumns.FECHA_SALIDA + " = ?" + ", "
				+ ReservacionColumns.OCUPACION + " = ?" + ", "
				+ ReservacionColumns.MONTO + " = ?" + ", "
				+ ReservacionColumns.IDENTIFICACION_CLIENTE + " = ?"
				+ " WHERE " + ReservacionColumns.ID + " = ?";
	}

	@Override
	public ReservacionRowGateway fromMap(Map<String, Object> values) {
		ReservacionRowGateway result = new ReservacionRowGateway();
		result.setId((Integer) values.get(ReservacionColumns.ID));
		result.setHabitacionId((Integer) values
				.get(ReservacionColumns.HABITACION));
		// TODO Convertir string en date
		result.setFechaEntrada((Date) values
				.get(ReservacionColumns.FECHA_ENTRADA));
		result.setFechaSalida((Date) values
				.get(ReservacionColumns.FECHA_SALIDA));
		result.setOcupacion((Integer) values.get(ReservacionColumns.OCUPACION));
		result.setMonto((Float) values.get(ReservacionColumns.MONTO));
		result.setIdentificacionCliente((String) values
				.get(ReservacionColumns.IDENTIFICACION_CLIENTE));
		return null;
	}

	@Override
	public Object[] getUpdateArgs() {
		return new Object[] { getHabitacionId(), getFechaEntrada(),
				getFechaSalida(), getOcupacion(), getMonto(),
				getIdentificacionCliente(), getId() };
	}

}
