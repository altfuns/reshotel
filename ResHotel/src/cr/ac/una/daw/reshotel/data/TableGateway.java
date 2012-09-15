package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.jdbc.core.JdbcTemplate;

import cr.ac.una.daw.reshotel.data.Constantes.BaseColumns;

public abstract class TableGateway<T> {

	protected JdbcTemplate jdbcTemplate;

	protected String tableName;

	protected String findAllQuery;

	protected String insertStatement;

	protected String updateStatement;

	protected String deleteStatement;

	protected int id;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public abstract T fromMap(Map<String, Object> values);

	public abstract void load();

	public abstract Object[] getUpdateArgs();

	public int save() {
		if (id == -1) {
			Random generator = new Random();
			id = Math.abs(generator.nextInt());
			jdbcTemplate.update(insertStatement, getUpdateArgs());
		} else {
			jdbcTemplate.update(updateStatement, getUpdateArgs());
		}
		return id;
	}

	public boolean delete() {
		String deleteStatement = "DELETE FROM " + tableName + " WHERE "
				+ BaseColumns.ID + " = ?";
		int rows = jdbcTemplate.update(deleteStatement, id);
		return rows == 1;
	}

	public List<T> findAll() {
		List<T> result = new ArrayList<T>();
		List<Map<String, Object>> items = jdbcTemplate
				.queryForList(findAllQuery);
		for (Map<String, Object> item : items) {
			result.add(fromMap(item));
		}
		return result;
	}

	public T find() {
		T result = null;
		List<Map<String, Object>> items = jdbcTemplate
				.queryForList(findAllQuery);

		if (items != null && items.size() > 0) {
			result = fromMap(items.get(0));
		}

		return result;
	}

}
