package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cr.ac.una.daw.reshotel.data.Constantes.BaseColumns;

/**
 * 
 * {@link RowGateway} clase abstract que permite la reutilzación del código de
 * acceso a datos mediante la implementación de alguna métodos abstractos en las
 * subclases.
 * 
 * @param <T>
 *            Tipo de dato de la clase a la cual se le implementan las
 *            funcionalidades.
 */
public abstract class RowGateway<T> {

	protected JdbcTemplate jdbcTemplate;

	protected int id;

	/**
	 * Obtiene la instacia del template de jdbc.
	 * 
	 * @return Instancie del template de jdbc
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	/**
	 * Establece la fuente de datos utilizada por la clase
	 * 
	 * @param dataSource
	 */
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	/**
	 * Obtiene el identificador de la fila
	 * 
	 * @return Identificador de la fila
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el identificador de fila
	 * 
	 * @param id
	 *            Identificador de fila
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtiene nombre de la tabla donde se encuentra almacenado el registro.
	 * 
	 * @return
	 */
	public abstract String getTableName();

	/**
	 * Obtiene la sentencia utilizada para insertar el registro de fila
	 * 
	 * @return SQL Statement para insertar un registro
	 */
	public abstract String getInsertStatement();

	/**
	 * Obtiene la sentencia utilizada para actualizar el registro de fila
	 * 
	 * @return
	 */
	public abstract String getUpdateStatement();

	/**
	 * Convierte un Map con lo valores obtenidos de la BD a una instancia de la
	 * clase.
	 * 
	 * @param values
	 * Map con los datos provenientes de la BD.
	 * @return
	 */
	public abstract T fromMap(Map<String, Object> values);

	/**
	 * Obtiene los parámetros para realizar las transacciones para insertar y actualizar.
	 * @return
	 * Arreglo de objetos
	 */
	public abstract Object[] getUpdateArgs();

	/**
	 * Inserta los datos de la instancia en la BD.
	 * @return
	 */
	public int insert() {
		Random generator = new Random();
		id = Math.abs(generator.nextInt());
		jdbcTemplate.update(getInsertStatement(), getUpdateArgs());
		return id;
	}

	/**
	 * Actualiza el registro con los datos nuevos.
	 * @return
	 */
	public int update() {
		jdbcTemplate.update(getUpdateStatement(), getUpdateArgs());
		return id;
	}

	/**
	 * Elimina el registro de fila de la BD.
	 * @return
	 * @throws Exception
	 */
	public boolean delete() throws Exception {
		String deleteStatement = "DELETE FROM " + getTableName() + " WHERE "
				+ BaseColumns.ID + " = ?";
		int rows = jdbcTemplate.update(deleteStatement, id);
		return rows == 1;
	}

	/**
	 * Obtiene todos los registros en la BD con el mismo tipo de entitidad.
	 * @return
	 */
	public List<T> findAll() {
		List<T> result = new ArrayList<T>();
		String findAllQuery = "SELECT * FROM " + getTableName();
		List<Map<String, Object>> items = jdbcTemplate
				.queryForList(findAllQuery);

		for (Map<String, Object> item : items) {
			result.add(fromMap(item));
		}
		return result;
	}

	/**
	 * Busca un registro específico por su identificador de fila
	 * @return
	 */
	public T find() {
		T result = null;
		String findQuery = "SELECT * FROM " + getTableName() + " WHERE "
				+ BaseColumns.ID + " = ?";
		List<Map<String, Object>> items = jdbcTemplate.queryForList(findQuery,
				id);

		if (items != null && items.size() > 0) {
			result = fromMap(items.get(0));
		}

		return result;
	}

}
