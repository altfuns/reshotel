<%@page import="cr.ac.una.daw.reshotel.dto.HotelDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Hoteles</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Detalle de hotel</div>
<%
	HotelDTO hotel = (HotelDTO) request
			.getAttribute("hotel");
%>
<form name="ActualizarHotel"
	action="/reshotel/actualizarHotel" method="get">
	<input type="hidden" name="id" value="<%=hotel.id%>" />
	<table>
		<tr>
			<td>Ocupaci&oacute;n M&aacute;xima:</td>
			<td><input type="text" name="ocupacionMaxima"
				value="<%=hotel.ocupacionMaxima%>" /></td>
		</tr>
		<tr>
			<td>N&uacute;mero</td>
			<td><input type="text" name="numero"
				value="<%=hotel.numero%>" /></td>
		</tr>
		<tr>
			<td>Mobiliario</td>
			<td><input type="text" name="mobiliario"
				value="<%=hotel.mobiliario%>" /></td>
		</tr>
		<tr>
			<td>Costo:</td>
			<td><input type="text" name="costo"
				value="<%=hotel.costo%>" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Actualizar" /></td>
		</tr>
	</table>
</form>
</html>