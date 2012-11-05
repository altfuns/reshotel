package cr.ac.una.daw.reshotel.service;

import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Hotel;
import cr.ac.una.daw.reshotel.domain.HotelRepository;

public class SimpleHotelManager implements HotelManager {
	private List<Hotel> hoteles;

	private HotelRepository repository;

	public void setRepository(HotelRepository repository) {
		this.repository = repository;
	}
	
	public Collection<Hotel> getHoteles() {
		return repository.findAllHotel();
	}

	public void setHoteles(List<Hotel> hoteles) {
		this.hoteles = hoteles;
	}

	@Override
	public Hotel find(int id) {
		return repository.findHotel(id);
	}

	@Override
	public void save(Hotel hotel) {
		if (hotel.getId() != -1) {
			repository.updateHotel(hotel);
		} else {
			repository.insertHotel(hotel);
		}
	}

	@Override
	public void delete(Hotel hotel) {
		if(hotel != null){
			repository.deleteHotel(hotel);
		}
		
	}
}