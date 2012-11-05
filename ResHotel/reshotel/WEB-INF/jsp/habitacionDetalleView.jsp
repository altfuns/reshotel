<%@page import="cr.ac.una.daw.reshotel.domain.Habitacion"%>
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
	Map<String, Object> myModel = (Map<String, Object>) request
			.getAttribute("model");
	Habitacion habitacion = (Habitacion) myModel
			.get("habitacion");
%>
<form name="ActualizarHabitacion"
	action="/reshotel/actualizarHabitacion" method="get">
	<input type="hidden" name="id" value="<%=habitacion.getId()%>" />
	<table>
		<tbody>
			<tr>
				<th>Ocupaci&oacute;n M&aacute;xima:</th>
				<td><input type="text" name="ocupacionMaxima"
					value="<%=habitacion.getOcupacionMaxima()%>" /></td>
			</tr>
			<tr>
				<th>N&uacute;mero</th>
				<td><input type="text" name="numero"
					value="<%=habitacion.getNumero()%>" /></td>
			</tr>
			<tr>
				<th>Mobiliario</th>
				<td><input type="text" name="mobiliario"
					value="<%=habitacion.getMobiliario()%>" /></td>
			</tr>
			<tr>
				<th>Costo:</th>
				<td><input type="text" name="costo"
					value="<%=habitacion.getCosto()%>" /></td>
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