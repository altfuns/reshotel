package cr.ac.una.daw.reshotel.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import cr.ac.una.daw.reshotel.assembler.UbicacionAssembler;
import cr.ac.una.daw.reshotel.domain.Ubicacion;
import cr.ac.una.daw.reshotel.domain.UbicacionRepository;
import cr.ac.una.daw.reshotel.dto.UbicacionDTO;

public class UbicacionRepositoryDAOImpl implements UbicacionRepository {
	private UbicacionDAO ubicacionDAO;

	UbicacionRepositoryDAOImpl(UbicacionDAO ubicacionDAO) {
		this.ubicacionDAO = ubicacionDAO;
	}

	public boolean insertUbicacion(Ubicacion ubicacion) {
		UbicacionDTO ubicacionDTO = UbicacionAssembler.create(ubicacion);
		return (ubicacionDAO.insert(ubicacionDTO));
	}

	public boolean deleteUbicacion(Ubicacion ubicacion) {
		UbicacionDTO ubicacionDTO = UbicacionAssembler.create(ubicacion);
		return (ubicacionDAO.delete(ubicacionDTO));
	}

	public Ubicacion findUbicacion(int id) {
		UbicacionDTO ubicacionDTO = ubicacionDAO.findById(id);
		if (ubicacionDTO != null) {
			System.out.println(ubicacionDTO.id);
			Ubicacion ubicacion = UbicacionAssembler.create(ubicacionDTO);
			return ubicacion;
		}
		return null;
	}

	public boolean updateUbicacion(Ubicacion ubicacion) {
		UbicacionDTO ubicacionDTO = UbicacionAssembler.create(ubicacion);
		return (ubicacionDAO.update(ubicacionDTO));
	}

	public Collection<Ubicacion> findAllUbicacion() {
		Collection<UbicacionDTO> ubicacionsDTO = ubicacionDAO.findAll();
		List<Ubicacion> ubicacionList = new ArrayList<Ubicacion>();
		Iterator<UbicacionDTO> itr = ubicacionsDTO.iterator();
		while (itr.hasNext()) {
			UbicacionDTO ubicacionDTO = (UbicacionDTO) itr.next();
			Ubicacion ubicacion = UbicacionAssembler.create(ubicacionDTO);
			ubicacionList.add(ubicacion);
		}
		return ubicacionList;
	}
}
