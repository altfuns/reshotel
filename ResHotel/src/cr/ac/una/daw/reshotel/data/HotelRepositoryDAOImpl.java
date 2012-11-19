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

/**
 * Repositorio de datos de la clase Hotel
 * @author alfonso
 *
 */
public class HotelRepositoryDAOImpl implements HotelRepository {
	private HotelDAO hotelDAO;

	HotelRepositoryDAOImpl(HotelDAO hotelDAO) {
		this.hotelDAO = hotelDAO;
	}

	/**
	 * Inserta un nuevo hotel
	 */
	public boolean insertHotel(Hotel hotel) {
		HotelDTO hotelDTO = HotelAssembler.create(hotel);
		return (hotelDAO.insert(hotelDTO));
	}

	/**
	 * Elimina el hotel con id
	 */
	public boolean deleteHotel(Hotel hotel) {
		HotelDTO hotelDTO = HotelAssembler.create(hotel);
		return (hotelDAO.delete(hotelDTO));
	}

	/**
	 * Obtiene el registro de hotel
	 */
	public Hotel findHotel(int id) {
		HotelDTO hotelDTO = hotelDAO.findById(id);
		if (hotelDTO != null) {
			System.out.println(hotelDTO.id);
			System.out.println(hotelDTO.ubicacionId);
			Hotel hotel = HotelAssembler.create(hotelDTO);
			return hotel;
		}
		return null;
	}

	/**
	 * Actualiza el registro de hotel
	 */
	public boolean updateHotel(Hotel hotel) {
		HotelDTO hotelDTO = HotelAssembler.create(hotel);
		return (hotelDAO.update(hotelDTO));
	}

	/**
	 * Encuentra el registro de hotel
	 */
	public Collection<Hotel> findAllHotel() {
		Collection<HotelDTO> hotelsDTO = hotelDAO.findAll();
		List<Hotel> hotelList = new ArrayList<Hotel>();
		Iterator<HotelDTO> itr = hotelsDTO.iterator();
		while (itr.hasNext()) {
			HotelDTO hotelDTO = (HotelDTO) itr.next();
			Hotel hotel = HotelAssembler.create(hotelDTO);
			System.out.println(hotel.getId());
			System.out.println(hotel.getUbicacionId());
			hotelList.add(hotel);
		}
		return hotelList;
	}
}
