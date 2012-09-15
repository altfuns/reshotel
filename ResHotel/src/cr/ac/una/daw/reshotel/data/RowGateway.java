package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.jdbc.core.JdbcTemplate;

import cr.ac.una.daw.reshotel.data.Constantes.BaseColumns;

public abstract class RowGateway<T> {

	protected JdbcTemplate jdbcTemplate;

	protected int id;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract String getTableName();

	public abstract String getInsertStatement();

	public abstract String getUpdateStatement();

	public abstract T fromMap(Map<String, Object> values);

	public abstract Object[] getUpdateArgs();

	public int insert() {
		Random generator = new Random();
		id = Math.abs(generator.nextInt());
		jdbcTemplate.update(getInsertStatement(), getUpdateArgs());
		return id;
	}
	
	public int update() {
		jdbcTemplate.update(getUpdateStatement(), getUpdateArgs());
		return id;
	}

	public boolean delete() {
		String deleteStatement = "DELETE FROM " + getTableName() + " WHERE "
				+ BaseColumns.ID + " = ?";
		int rows = jdbcTemplate.update(deleteStatement, id);
		return rows == 1;
	}



}
