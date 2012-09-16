package cr.ac.una.daw.reshotel.display;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

import cr.ac.una.daw.reshotel.data.HabitacionRowGateway;
import cr.ac.una.daw.reshotel.data.HotelRowGateway;
import cr.ac.una.daw.reshotel.domain.HabitacionModule;
import cr.ac.una.daw.reshotel.domain.HotelModule;
import cr.ac.una.daw.reshotel.dto.HabitacionDTO;
import cr.ac.una.daw.reshotel.dto.HotelDTO;

public class ListaHabitaciones extends PageController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HabitacionModule module = (HabitacionModule) context
				.getBean("habitacionModule");
		try {
			List<HabitacionRowGateway> data = module.listado();
			List<HabitacionDTO> dtoData = new ArrayList<HabitacionDTO>();

			for (HabitacionRowGateway obj : data) {
				dtoData.add(HabitacionAssembler.create(obj));
			}

			request.setAttribute("habitaciones", dtoData);
			forward("/listaHabitaciones.jsp", request, response);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}