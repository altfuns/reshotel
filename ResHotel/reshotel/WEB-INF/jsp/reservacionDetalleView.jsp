<%@page import="cr.ac.una.daw.reshotel.domain.Habitacion"%>
<%@page import="cr.ac.una.daw.reshotel.domain.Reservacion"%>
<%@page import="cr.ac.una.daw.reshotel.dto.HabitacionDTO"%>
<%@page import="cr.ac.una.daw.reshotel.dto.ReservacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Reservaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Detalle de reservaci&oacute;n</div>
<%
	Map<String, Object> myModel = (Map<String, Object>) request
			.getAttribute("model");
	Reservacion reservacion = (Reservacion) myModel
			.get("reservacion");
	List<Habitacion> habitaciones = (List<Habitacion>) myModel
			.get("habitaciones");
%>
<form name="ActualizarReservacion"
	action="/reshotel/actualizarReservacion" method="get">
	<input type="hidden" name="id" value="<%=reservacion.getId()%>" />
	<table>
		<tbody>
			<tr>
				<th>Habitaci&oacute;n</th>
				<td><select name="habitacion">
						<option value="-1">Seleccione una opción</option>
						<%
							for (Habitacion habitacion : habitaciones) {
						%>
						<option value="<%=habitacion.getId()%>"
							<%=habitacion.getId() == reservacion.getHabitacionId() ? "selected"
						: ""%>><%=habitacion.getHotel().getNombre() + ", " +habitacion.getNumero()%></option>
						<%
							}
						%>
				</select></td>
			</tr>
			<tr>
				<th>Fecha Entrada</th>
				<td><input type="text" name="fechaEntrada"
					value="<%=reservacion.getFechaEntrada()%>" /></td>
			</tr>
			<tr>
				<th>Fecha Salida</th>
				<td><input type="text" name="fechaSalida"
					value="<%=reservacion.getFechaSalida()%>" /></td>
			</tr>
			<tr>
				<th>Ocupaci&oacute;n:</th>
				<td><input type="text" name="ocupacion"
					value="<%=reservacion.getOcupacion()%>" /></td>
			</tr>
			<tr>
				<th>Monto:</th>
				<td><input type="text" name="monto"
					value="<%=reservacion.getMonto()%>" /></td>
			</tr>
			<tr>
				<th>Cliente:</th>
				<td><input type="text" name="cliente"
					value="<%=reservacion.getIdentificacionCliente()%>" /></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td><input class="btn btn-success" type="submit"
					value="Guardar cambios" /></td>
				<td></td>
			</tr>
		</tfoot>
	</table>
</form>
</html>