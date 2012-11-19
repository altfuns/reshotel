<%@page import="cr.ac.una.daw.reshotel.domain.Hotel"%>
<%@page import="cr.ac.una.daw.reshotel.dto.HotelDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Hoteles</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de hoteles</div>
<%
	Map<String, Object> myModel = (Map<String, Object>) request
			.getAttribute("model");
	List<Hotel> objs = (List<Hotel>) myModel.get("hoteles");
%>
<table>
	<thead>
		<tr>
			<th>NOmbre</th>
			<th>Telefono</th>
			<th>Email</th>
			<th>Clase</th>
			<th>Encargado</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
		<%
			if (objs != null) {
				for (Hotel obj : objs) {
		%>
		<tr>
			<td><%=obj.getNombre()%></td>
			<td><%=obj.getTelefono()%></td>
			<td><%=obj.getEmail()%></td>
			<td><%=obj.getClase()%></td>
			<td><%=obj.getNombrePersonaEncargada()%></td>
			<td><a href='/reshotel/detalleHotel?id=<%=obj.getId()%>'> <input
					class="btn" type="submit" value="Detalle" /></a> <a
				href='/reshotel/eliminarHotel?id=<%=obj.getId()%>'> <input
					class="btn btn-danger" type="submit" value="Eliminar" /></a></td>
		</tr>
		<%
			}
			}
		%>
	</tbody>
	<tfoot>
		<tr>
			<td><a href='/reshotel/agregarHotel'> <input type="submit"
					class="btn btn-success" name="action" value="Agregar" /></a></td>
		</tr>
	</tfoot>
</table>
</html>