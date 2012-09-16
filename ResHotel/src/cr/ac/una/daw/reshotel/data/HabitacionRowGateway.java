package cr.ac.una.daw.reshotel.data;

import java.util.List;
import java.util.Map;

import cr.ac.una.daw.reshotel.data.Constantes.HabitacionColumns;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;

public class HabitacionRowGateway extends RowGateway<HabitacionRowGateway> {

	private int ocupacionMaxima;
	private int numero;
	// TODO: revisar que es mobiliario
	private String mobiliario;
	private double costo;
	private List<ReservacionRowGateway> reservaciones;

	public HabitacionRowGateway() {
		super();
	}

	public HabitacionRowGateway(int ocupacionMaxima, int numero,
			String mobiliario, float costo,
			List<ReservacionRowGateway> reservaciones) {
		super();
		this.ocupacionMaxima = ocupacionMaxima;
		this.numero = numero;
		this.mobiliario = mobiliario;
		this.costo = costo;
		this.reservaciones = reservaciones;
	}

	public int getOcupacionMaxima() {
		return ocupacionMaxima;
	}

	public void setOcupacionMaxima(int ocupacionMaxima) {
		this.ocupacionMaxima = ocupacionMaxima;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMobiliario() {
		return mobiliario;
	}

	public void setMobiliario(String mobiliario) {
		this.mobiliario = mobiliario;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public List<ReservacionRowGateway> getReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(List<ReservacionRowGateway> reservaciones) {
		this.reservaciones = reservaciones;
	}

	@Override
	public String getTableName() {
		return Constantes.HABITACION_TABLE_NAME;
	}

	@Override
	public String getInsertStatement() {
		return "INSERT INTO " + getTableName() + "("
				+ HabitacionColumns.OCUPACION_MAXIMA + ", "
				+ HabitacionColumns.NUMERO + "," + HabitacionColumns.MOBILIARIO
				+ "," + HabitacionColumns.COSTO + "," + HabitacionColumns.ID
				+ ")" + " VALUES(?,?,?,?,?)";
	}

	@Override
	public String getUpdateStatement() {
		return "UPDATE	 " + getTableName() + " SET "
				+ HabitacionColumns.OCUPACION_MAXIMA + " = ?" + ", "
				+ HabitacionColumns.NUMERO + " = ?" + ", "
				+ HabitacionColumns.MOBILIARIO + " = ?" + ", "
				+ HabitacionColumns.COSTO + " = ?" + " WHERE "
				+ HabitacionColumns.ID + " = ?";
	}

	@Override
	public HabitacionRowGateway fromMap(Map<String, Object> values) {
		HabitacionRowGateway result = new HabitacionRowGateway();
		result.setId((Integer) values.get(HabitacionColumns.ID));
		result.setOcupacionMaxima((Integer) values
				.get(HabitacionColumns.OCUPACION_MAXIMA));
		result.setNumero((Integer) values.get(HabitacionColumns.NUMERO));
		result.setMobiliario((String) values.get(HabitacionColumns.MOBILIARIO));
		result.setCosto((Double) values.get(HabitacionColumns.COSTO));
		return result;
	}

	@Override
	public Object[] getUpdateArgs() {
		return new Object[] { getOcupacionMaxima(), getNumero(),
				getMobiliario(), getCosto(), getId() };
	}
}
