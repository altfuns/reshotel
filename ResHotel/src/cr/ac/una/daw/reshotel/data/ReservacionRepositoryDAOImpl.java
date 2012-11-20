package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.ReservacionAssembler;
import cr.ac.una.daw.reshotel.domain.Reservacion;
import cr.ac.una.daw.reshotel.domain.ReservacionRepository;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * Repositorio de datos de la clase Rervacion
 * 
 * @author alfonso
 * 
 */
public class ReservacionRepositoryDAOImpl implements ReservacionRepository {
	private ReservacionDAO reservacionDAO;
	private HabitacionDAO habitacionDAO;

	ReservacionRepositoryDAOImpl(ReservacionDAO reservacionDAO,
			HabitacionDAO habitacionDAO) {
		this.reservacionDAO = reservacionDAO;
		this.habitacionDAO = habitacionDAO;
	}

	/**
	 * Inserta un nuevo registro de Reservacion
	 */
	public boolean insertReservacion(Reservacion reservacion) {
		ReservacionDTO reservacionDTO = ReservacionAssembler
				.create(reservacion);
		return (reservacionDAO.insert(reservacionDTO));
	}

	/**
	 * Elimina el registro de reservacion
	 */
	public boolean deleteReservacion(Reservacion reservacion) {
		ReservacionDTO reservacionDTO = ReservacionAssembler
				.create(reservacion);
		return (reservacionDAO.delete(reservacionDTO));
	}

	/**
	 * Obtiene el registro de reservacion
	 */
	public Reservacion findReservacion(int id) {
		ReservacionDTO reservacionDTO = reservacionDAO.findById(id);
		if (reservacionDTO != null) {
			System.out.println(reservacionDTO.id);
			Reservacion reservacion = ReservacionAssembler
					.create(reservacionDTO);
			return reservacion;
		}
		return null;
	}

	/**
	 * Actualiza el registro de reservacion
	 */
	public boolean updateReservacion(Reservacion reservacion) {
		ReservacionDTO reservacionDTO = ReservacionAssembler
				.create(reservacion);
		return (reservacionDAO.update(reservacionDTO));
	}

	/**
	 * Obtiene todos los registros de reservacion
	 */
	public Collection<Reservacion> findAllReservacion() {
		Collection<ReservacionDTO> reservacionsDTO = reservacionDAO.findAll();
		List<Reservacion> reservacionList = new ArrayList<Reservacion>();
		Iterator<ReservacionDTO> itr = reservacionsDTO.iterator();
		while (itr.hasNext()) {
			ReservacionDTO reservacionDTO = (ReservacionDTO) itr.next();
			HabitacionDTO habitacion = habitacionDAO.findById(reservacionDTO
					.getHabitacionId());
			reservacionDTO.setHabitacion(habitacion);
			Reservacion reservacion = ReservacionAssembler
					.create(reservacionDTO);
			reservacionList.add(reservacion);
		}
		return reservacionList;
	}
}
