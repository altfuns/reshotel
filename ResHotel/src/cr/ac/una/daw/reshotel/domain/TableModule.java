package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.RowGateway;
import cr.ac.una.daw.reshotel.dto.DTO;

import java.util.List;

public abstract class TableModule<T extends RowGateway<T>, K extends DTO> {
	protected T gateway;

	public abstract T gatewayfromDTO(T gateway, K dto);

	public void setGateway(T gateway) {
		this.gateway = gateway;
	}

	public void insertar(K dto) throws Exception {
		this.gateway = gatewayfromDTO(gateway, dto);
		if (gateway != null) {
			gateway.insert();
		}
	}

	public void actualizar(K dto) throws Exception {
		validarId(dto.id);
		if (gateway != null) {
			gateway.update();
		}
	}

	public void eliminar(int id) throws Exception {
		validarId(id);
		if (gateway != null) {
			gateway.setId(id);
			gateway.delete();
		}
	}

	public T buscar(int id) throws Exception {
		validarId(id);
		gateway.setId(id);
		T obj = gateway.find();
		return obj;
	}

	public List<T> listado() throws Exception {
		List<T> objs = gateway.findAll();
		return objs;
	}

	private void validarId(int id) throws Exception {
		if (id <= 0) {
			throw new Exception("Identificador incorrecto");
		}
	}
}