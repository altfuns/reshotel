<%@page import="cr.ac.una.daw.reshotel.dto.HabitacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Habitaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Detalle de habitaci&oacute;n</div>
<%
	HabitacionDTO habitacion = (HabitacionDTO) request
			.getAttribute("habitacion");
%>
<form name="ActualizarHabitacion"
	action="/reshotel/actualizarHabitacion" method="get">
	<input type="hidden" name="id" value="<%=habitacion.id%>" />
	<table>
		<tbody>
			<tr>
				<th>Ocupaci&oacute;n M&aacute;xima:</th>
				<td><input type="text" name="ocupacionMaxima"
					value="<%=habitacion.ocupacionMaxima%>" /></td>
			</tr>
			<tr>
				<th>N&uacute;mero</th>
				<td><input type="text" name="numero"
					value="<%=habitacion.numero%>" /></td>
			</tr>
			<tr>
				<th>Mobiliario</th>
				<td><input type="text" name="mobiliario"
					value="<%=habitacion.mobiliario%>" /></td>
			</tr>
			<tr>
				<th>Costo:</th>
				<td><input type="text" name="costo"
					value="<%=habitacion.costo%>" /></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>			
				<td><input class="btn" type="submit" value="Guardar cambios" /></td>
				<td></td>
			</tr>
		</tfoot>
	</table>
</form>
</html>