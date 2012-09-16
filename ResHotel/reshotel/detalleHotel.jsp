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
	HotelDTO hotel = (HotelDTO) request.getAttribute("hotel");
%>

<form name="ActualizarHotel" action="/reshotel/actualizarHotel"
	method="get">
	<input type="hidden" name="id" value="<%=hotel.id%>" />
	<table>
		<tbody>
			<tr>
				<th>Tel&eacute;fono:</th>
				<td><input type="text" name="telefono"
					value="<%=hotel.telefono%>" /></td>
			</tr>
			<tr>
				<th>Email:</th>
				<td><input type="text" name="email" value="<%=hotel.email%>" /></td>
			</tr>
			<tr>
				<th>Clase:</th>
				<td><input type="text" name="clase" value="<%=hotel.clase%>" /></td>
			</tr>
			<tr>
				<th>Nombre de encargado:</th>
				<td><input type="text" name="nombrePersonaEncargada"
					value="<%=hotel.nombrePersonaEncargada%>" /></td>
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