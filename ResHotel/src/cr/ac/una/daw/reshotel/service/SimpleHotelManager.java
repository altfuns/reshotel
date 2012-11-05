package cr.ac.una.daw.reshotel.service;

import java.util.List;

import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class SimpleHotelManager implements HotelManager {
	private List<HotelDTO> hoteles;

	public List<HotelDTO> getHoteles() {
		return hoteles;
	}

	public void setHotels(List<HotelDTO> hoteles) {
		this.hoteles = hoteles;
	}

	@Override
	public HotelDTO find(int id) {
		for (HotelDTO hotel : hoteles) {
			if (id == hotel.id) {
				return hotel;
			}
		}
		return null;
	}

	@Override
	public void save(HotelDTO hotel) {

	}

	@Override
	public void delete(HotelDTO hotel) {
		// TODO Auto-generated method stub
		
	}
}