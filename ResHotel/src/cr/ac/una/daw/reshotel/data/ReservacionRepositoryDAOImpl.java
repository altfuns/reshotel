package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.ReservacionAssembler;
import cr.ac.una.daw.reshotel.domain.Reservacion;
import cr.ac.una.daw.reshotel.domain.ReservacionRepository;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

public class ReservacionRepositoryDAOImpl implements ReservacionRepository {
	private ReservacionDAO reservacionDAO;

	ReservacionRepositoryDAOImpl(ReservacionDAO reservacionDAO) {
		this.reservacionDAO = reservacionDAO;
	}

	public boolean insertReservacion(Reservacion reservacion) {
		ReservacionDTO reservacionDTO = ReservacionAssembler.create(reservacion);
		return (reservacionDAO.insert(reservacionDTO));
	}

	public boolean deleteReservacion(Reservacion reservacion) {
		ReservacionDTO reservacionDTO = ReservacionAssembler.create(reservacion);
		return (reservacionDAO.delete(reservacionDTO));
	}

	public Reservacion findReservacion(int id) {
		ReservacionDTO reservacionDTO = reservacionDAO.findById(id);
		if (reservacionDTO != null) {
			Reservacion reservacion = new Reservacion();
			System.out.println(reservacionDTO.id);
			ReservacionAssembler.update(reservacion, reservacionDTO);
			return reservacion;
		}
		return null;
	}

	public boolean updateReservacion(Reservacion reservacion) {
		ReservacionDTO reservacionDTO = ReservacionAssembler.create(reservacion);
		return (reservacionDAO.update(reservacionDTO));
	}

	public Collection<Reservacion> findAllReservacion() {
		Collection<ReservacionDTO> reservacionsDTO = reservacionDAO.findAll();
		List<Reservacion> reservacionList = new ArrayList<Reservacion>();
		Iterator<ReservacionDTO> itr = reservacionsDTO.iterator();
		while (itr.hasNext()) {
			Reservacion reservacion = new Reservacion();
			ReservacionDTO reservacionDTO = (ReservacionDTO) itr.next();
			ReservacionAssembler.update(reservacion, reservacionDTO);
			reservacionList.add(reservacion);
		}
		return reservacionList;
	}
}
