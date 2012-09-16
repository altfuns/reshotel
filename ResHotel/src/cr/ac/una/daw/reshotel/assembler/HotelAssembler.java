package cr.ac.una.daw.reshotel.assembler;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class HotelAssembler {
  public static HotelDTO create(HotelRowGateway obj) {
    HotelDTO dto = new HotelDTO();
    dto.id = obj.getId();
    dto.telefono = obj.getTelefono();
    dto.email = obj.getEmail();
    dto.clase = obj.getClase();
    dto.nombrePersonaEncargada = obj.getNombrePersonaEncargada();
    //dto.ubicacion = UbicacionAssembler.Create(obj.getUbicacion());

    return dto;
  }
}