package cr.ac.una.daw.reshotel.data;

import java.util.Collection;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * Encargado de interacctuar con repositorio de datos de Reservaciones
 * @author alfonso
 *
 */
public class ReservacionDAO extends HibernateDaoSupport{
	/**
	 * Inserta una nueva reservacion
	 * @param reservacionDTO
	 * @return
	 */
	public boolean insert(ReservacionDTO reservacionDTO) {
		getHibernateTemplate().saveOrUpdate(reservacionDTO);
		return true;
	}

	/**
	 * Elimina el registro de reservacion
	 * @param reservacionDTO
	 * @return
	 */
	public boolean delete(ReservacionDTO reservacionDTO) {
		getHibernateTemplate().delete(reservacionDTO);
		return true;
	}

	/**
	 * Obtiene el registro de reservacion
	 * @param id
	 * @return
	 */
	public ReservacionDTO findById(int id) {
		ReservacionDTO reservacion;
		reservacion = (ReservacionDTO) getHibernateTemplate().get(ReservacionDTO.class,
				new Integer(id));
		return reservacion;
	}

	/**
	 * Actualiza el registro de la reservacion
	 * @param reservacionDTO
	 * @return
	 */
	public boolean update(ReservacionDTO reservacionDTO) {
		getHibernateTemplate().saveOrUpdate(reservacionDTO);
		return true;
	}

	/**
	 * Obtiene todos los objetos reservacion
	 * @return
	 */
	public Collection findAll() {
		return getHibernateTemplate().find("from ReservacionDTO");
	}
}
