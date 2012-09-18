package cr.ac.una.daw.reshotel.domain;

import cr.ac.una.daw.reshotel.data.RowGateway;
import cr.ac.una.daw.reshotel.dto.DTO;

import java.util.List;

/**
 * 
 * Modulo de tabla abstracto que agrupa las funcionalidades basicas de una entidad. 
 *
 * @param <T>
 * Subclase de RowGateway
 * @param <K>
 * Subclase de DTO
 */
public abstract class TableModule<T extends RowGateway<T>, K extends DTO> {
	protected T gateway;

	/**
	 * Convierte la intancia del DTO en una instancia del Gateway
	 * @param gateway
	 * Intancia del gateway por modificar
	 * @param dto
	 * Instacia del dto que contien los datos por copiar
	 * @return
	 * Instancia con los nuevos valores/
	 */
	public abstract T gatewayfromDTO(T gateway, K dto);

	/**
	 * Establece la instancia del gateway
	 * @param gateway
	 */
	public void setGateway(T gateway) {
		this.gateway = gateway;
	}
	
	/**
	 * Inserta en un nuevo registro de la entidad basado en los datos del dto
	 * @param dto
	 * DTO con lo datos fuente
	 * @throws Exception
	 */
	public void insertar(K dto) throws Exception {
		this.gateway = gatewayfromDTO(gateway, dto);
		if (gateway != null) {
			gateway.insert();
		}
	}
	
	/**
	 * Actualiza los datos de la entidad con los datos del DTO.
	 * @param dto
	 * DTO con lo datos fuente
	 * @throws Exception
	 */
	public void actualizar(K dto) throws Exception {
		this.gateway = gatewayfromDTO(gateway, dto);
		validarId(dto.id);
		if (gateway != null) {
			gateway.update();
		}
	}

	/**
	 * Elimina el registro con el id dado.
	 * @param id
	 * Identificador de la entidad.
	 * @throws Exception
	 */
	public void eliminar(int id) throws Exception {
		validarId(id);
		if (gateway != null) {
			gateway.setId(id);
			gateway.delete();
		}
	}

	/**
	 * Busca la entidad RowGateway con el id dado. 
	 * @param id
	 * Identificador de la entidad
	 * @return
	 * Entidad encontrada, null si no la encuentra
	 * @throws Exception
	 */
	public T buscar(int id) throws Exception {
		validarId(id);
		gateway.setId(id);
		T obj = gateway.find();
		return obj;
	}

	/**
	 * Obtiene el listado de todas las entidades.
	 * @return
	 * Listado de entidades
	 * @throws Exception
	 */
	public List<T> listado() throws Exception {
		List<T> objs = gateway.findAll();
		return objs;
	}

	/**
	 * Valida el identificador de la entidad
	 * @param id
	 * Identificador de la entidad
	 * @throws Exception
	 */
	private void validarId(int id) throws Exception {
		if (id <= 0) {
			throw new Exception("Identificador incorrecto");
		}
	}
}