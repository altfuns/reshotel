package cr.ac.una.daw.reshotel.service;

import java.util.List;

import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

public class SimpleReservacionManager implements ReservacionManager {
	private List<ReservacionDTO> reservaciones;

	public List<ReservacionDTO> getReservaciones() {
		return reservaciones;
	}

	public void setReservacions(List<ReservacionDTO> reservaciones) {
		this.reservaciones = reservaciones;
	}

	@Override
	public ReservacionDTO find(int id) {
		for (ReservacionDTO reservacion : reservaciones) {
			if (id == reservacion.id) {
				return reservacion;
			}
		}
		return null;
	}

	@Override
	public void save(ReservacionDTO reservacion) {

	}

	@Override
	public void delete(ReservacionDTO reservacion) {
		// TODO Auto-generated method stub
		
	}
}