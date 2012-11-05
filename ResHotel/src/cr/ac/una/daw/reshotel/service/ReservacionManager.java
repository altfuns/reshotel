package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

public interface ReservacionManager extends Serializable {
	public List<ReservacionDTO> getReservaciones();

	public ReservacionDTO find(int id);

	public void save(ReservacionDTO reservacion);
	
	public void delete(ReservacionDTO reservacion);
}