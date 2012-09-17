package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.ReservacionAssembler;
import cr.ac.una.daw.reshotel.data.ReservacionRowGateway;
import cr.ac.una.daw.reshotel.domain.ReservacionModule;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

public class ListaReservaciones extends PageController {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ReservacionModule module = (ReservacionModule) context
				.getBean("reservacionModule");
		try {
			List<ReservacionRowGateway> data = module.listado();
			List<ReservacionDTO> dtoData = new ArrayList<ReservacionDTO>();

			for (ReservacionRowGateway obj : data) {
				dtoData.add(ReservacionAssembler.create(obj));
			}

			request.setAttribute("reservaciones", dtoData);
			forward("/listaReservaciones.jsp", request, response);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}