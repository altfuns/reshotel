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
	ReservacionDTO reservacion = (ReservacionDTO) request
			.getAttribute("reservacion");
	List<HabitacionDTO> habitaciones = (List<HabitacionDTO>) request
			.getAttribute("habitaciones");
%>
<form name="ActualizarReservacion"
	action="/reshotel/actualizarReservacion" method="get">
	<input type="hidden" name="id" value="<%=reservacion.id%>" />
	<table>
		<tbody>
			<tr>
				<th>Habitaci&oacute;n</th>
				<td><select name="habitacion">
						<option value="-1">Seleccione una opción</option>
						<%
							for (HabitacionDTO habitacion : habitaciones) {
						%>
						<option value="<%=habitacion.id%>"
							<%=habitacion.id == reservacion.habitacionId ? "selected"
						: ""%>><%=habitacion.numero%></option>
						<%
							}
						%>
				</select></td>
			</tr>
			<tr>
				<th>Fecha Entrada</th>
				<td><input type="text" name="fechaEntrada"
					value="<%=reservacion.fechaEntrada%>" /></td>
			</tr>
			<tr>
				<th>Fecha Salida</th>
				<td><input type="text" name="fechaSalida"
					value="<%=reservacion.fechaSalida%>" /></td>
			</tr>
			<tr>
				<th>Ocupaci&oacute;n:</th>
				<td><input type="text" name="ocupacion"
					value="<%=reservacion.ocupacion%>" /></td>
			</tr>
			<tr>
				<th>Monto:</th>
				<td><input type="text" name="monto"
					value="<%=reservacion.monto%>" /></td>
			</tr>
			<tr>
				<th>Cliente:</th>
				<td><input type="text" name="cliente"
					value="<%=reservacion.identificacionCliente%>" /></td>
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