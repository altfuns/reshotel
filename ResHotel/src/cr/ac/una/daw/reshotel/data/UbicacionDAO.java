package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

/**
 * Interactua con la fuente de datos de ubicaciones
 * @author alfonso
 *
 */
public class UbicacionDAO extends HibernateDaoSupport{
	/**
	 * Inserta un nuevo registro de ubicacion apartir de un DTO
	 * @param ubicacionDTO
	 * @return
	 */
	public boolean insert(UbicacionDTO ubicacionDTO) {
		getHibernateTemplate().saveOrUpdate(ubicacionDTO);
		return true;
	}

	/**
	 * Elimina el registro de ubicacion
	 * @param ubicacionDTO
	 * @return
	 */
	public boolean delete(UbicacionDTO ubicacionDTO) {
		getHibernateTemplate().delete(ubicacionDTO);
		return true;
	}

	/**
	 * Obtiene el registro de ubicacion
	 * @param id
	 * Identificador de la ubicacion
	 * @return
	 */
	public UbicacionDTO findById(int id) {
		UbicacionDTO ubicacion;
		ubicacion = (UbicacionDTO) getHibernateTemplate().get(UbicacionDTO.class,
				new Integer(id));
		return ubicacion;
	}

	/**
	 * Actualiza el el registro de ubicacion
	 * @param ubicacionDTO
	 * @return
	 */
	public boolean update(UbicacionDTO ubicacionDTO) {
		getHibernateTemplate().saveOrUpdate(ubicacionDTO);
		return true;
	}

	/**
	 * Obtiene todos los registros de ubicacion
	 * @return
	 * Lista con los registros de ubicacion.
	 */
	public Collection findAll() {
		return getHibernateTemplate().find("from UbicacionDTO");
	}
}
