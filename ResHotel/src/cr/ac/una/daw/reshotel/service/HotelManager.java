package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Hotel;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public interface HotelManager extends Serializable {
	public List<HotelDTO> getHoteles();

	public HotelDTO find(int id);

	public void save(HotelDTO hotel);
	
	public void delete(HotelDTO hotel);
}