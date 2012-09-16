<%@page import="cr.ac.una.daw.reshotel.dto.HabitacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Habitaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<h2>Habitaci&oacute;n</h2>
<%
	HabitacionDTO habitacion = (HabitacionDTO) request
			.getAttribute("habitacion");
%>
<form name="ActualizarHabitacion"
	action="/reshotel/actualizarHabitacion" method="get">
	<input type="hidden" name="id" value="<%=habitacion.id%>" />
	<table>
		<tr>
			<td>Ocupaci&oacute;n M&aacute;xima:</td>
			<td><input type="text" name="ocupacionMaxima"
				value="<%=habitacion.ocupacionMaxima%>" /></td>
		</tr>
		<tr>
			<td>N&uacute;mero</td>
			<td><input type="text" name="numero"
				value="<%=habitacion.numero%>" /></td>
		</tr>
		<tr>
			<td>Mobiliario</td>
			<td><input type="text" name="mobiliario"
				value="<%=habitacion.mobiliario%>" /></td>
		</tr>
		<tr>
			<td>Costo:</td>
			<td><input type="text" name="costo"
				value="<%=habitacion.costo%>" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Actualizar" /></td>
		</tr>
	</table>
</form>
</html>