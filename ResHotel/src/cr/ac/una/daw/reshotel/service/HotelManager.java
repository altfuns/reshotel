package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Hotel;

public interface HotelManager extends Serializable {
	public List<Hotel> getHoteles();

	public Hotel find(int id);

	public void save(Hotel hotel);

	public void delete(Hotel hotel);
}