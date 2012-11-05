<%@page import="cr.ac.una.daw.reshotel.dto.HotelDTO"%>
<%@page import="cr.ac.una.daw.reshotel.dto.UbicacionDTO"%>
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
	List<UbicacionDTO> ubicaciones = (List<UbicacionDTO>) request
			.getAttribute("ubicaciones");
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
				<td><select name="clase">
						<% for (int i = 1; i<=5; i++) { %>
						<option value="<%= i %>"
							<%= i == hotel.clase ? "selected" : ""%>><%= i %></option>
						<% } %>
				</select></td>
			</tr>
			<tr>
				<th>Nombre de encargado:</th>
				<td><input type="text" name="nombrePersonaEncargada"
					value="<%=hotel.nombrePersonaEncargada%>" /></td>
			</tr>
			<tr>
				<th>Ubicacion:</th>
				<td><select name="ubicacion">
						<option value="-1">Seleccione una opción</option>
						<%
							for (UbicacionDTO ubicacion : ubicaciones) {
						%>
						<option value="<%=ubicacion.id%>"
							<%=ubicacion.id == hotel.ubicacion.id ? "selected"
						: ""%>><%=ubicacion.ciudad + ", " + ubicacion.pais%></option>
						<%
							}
						%>
				</select></td>
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