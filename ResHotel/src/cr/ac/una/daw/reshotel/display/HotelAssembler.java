package cr.ac.una.daw.reshotel.display;

import cr.ac.una.daw.reshotel.data.HotelRowGateway;

public class HotelAssembler {
  public static HotelDTO Create(HotelRowGateway obj) {
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