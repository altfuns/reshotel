package cr.ac.una.daw.reshotel.domain;

import java.util.Collection;

/**
 * 
 * HotelRepository brinda los metodos necesarios para el matenimiento de Hoteles 
 *
 */
public interface HotelRepository {
	public boolean insertHotel(Hotel hotel);

	public boolean deleteHotel(Hotel hotel);

	public Hotel findHotel(int id);

	public boolean updateHotel(Hotel hotel);

	public Collection<Hotel> findAllHotel();
}
