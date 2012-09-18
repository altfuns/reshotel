package cr.ac.una.daw.reshotel.display;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cr.ac.una.daw.reshotel.assembler.ReservacionAssembler;
import cr.ac.una.daw.reshotel.domain.ReservacionModule;
import cr.ac.una.daw.reshotel.dto.ReservacionDTO;

/**
 * 
 * Controlador de pagina para actualizar o insertar la informacion de la reservacion.
 *
 */
public class ActualizarReservacion extends PageController {

	private static final long serialVersionUID = 7900939974504489200L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ReservacionModule module = (ReservacionModule) context
				.getBean("reservacionModule");
		try {
			int id = Integer.parseInt(request.getParameter("id"));

			ReservacionDTO dto = id == -1 ? new ReservacionDTO()
					: ReservacionAssembler.create(module.buscar(id));
			dto.habitacionId = Integer.parseInt(request
					.getParameter("habitacion"));
			dto.fechaEntrada = request.getParameter("fechaEntrada");
			dto.fechaSalida = request.getParameter("fechaSalida");
			dto.ocupacion = Integer.parseInt(request.getParameter("ocupacion"));
			dto.monto = Double.parseDouble(request.getParameter("monto"));
			dto.identificacionCliente = request.getParameter("cliente");
			if (id == -1) {
				module.insertar(dto);
			} else {
				module.actualizar(dto);
			}

			response.sendRedirect("listaReservaciones");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			request.setAttribute("mensaje", e.getMessage());
			forward("/paginaError.jsp", request, response);
		}
	}
}