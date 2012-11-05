package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.HabitacionAssembler;
import cr.ac.una.daw.reshotel.assembler.HotelAssembler;
import cr.ac.una.daw.reshotel.domain.Habitacion;
import cr.ac.una.daw.reshotel.domain.Hotel;
import cr.ac.una.daw.reshotel.domain.HotelRepository;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelRepositoryDAOImpl implements HotelRepository {
	private HotelDAO hotelDAO;

	HotelRepositoryDAOImpl(HotelDAO hotelDAO) {
		this.hotelDAO = hotelDAO;
	}

	public boolean insertHotel(Hotel hotel) {
		HotelDTO hotelDTO = HotelAssembler.create(hotel);
		return (hotelDAO.insert(hotelDTO));
	}

	public boolean deleteHotel(Hotel hotel) {
		HotelDTO hotelDTO = HotelAssembler.create(hotel);
		return (hotelDAO.delete(hotelDTO));
	}

	public Hotel findHotel(int id) {
		HotelDTO hotelDTO = hotelDAO.findById(id);
		if (hotelDTO != null) {
			System.out.println(hotelDTO.id);
			Hotel hotel = HotelAssembler.create(hotelDTO);
			return hotel;
		}
		return null;
	}

	public boolean updateHotel(Hotel hotel) {
		HotelDTO hotelDTO = HotelAssembler.create(hotel);
		return (hotelDAO.update(hotelDTO));
	}

	public Collection<Hotel> findAllHotel() {
		Collection<HotelDTO> hotelsDTO = hotelDAO.findAll();
		List<Hotel> hotelList = new ArrayList<Hotel>();
		Iterator<HotelDTO> itr = hotelsDTO.iterator();
		while (itr.hasNext()) {
			HotelDTO hotelDTO = (HotelDTO) itr.next();
			Hotel hotel = HotelAssembler.create(hotelDTO);
			hotelList.add(hotel);
		}
		return hotelList;
	}
}
