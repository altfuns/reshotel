package cr.ac.una.daw.reshotel.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import cr.ac.una.daw.reshotel.domain.Hotel;

/**
 * 
 * HotelManager provee los metodos necesarios para el matenimiento de un hotel.
 * Interactua con la capa de acceso a datos.
 *
 */
public interface HotelManager extends Serializable {
	public Collection<Hotel> getHoteles();

	public Hotel find(int id);

	public void save(Hotel hotel);

	public void delete(Hotel hotel);
}