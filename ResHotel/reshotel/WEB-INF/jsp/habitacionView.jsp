<%@page import="cr.ac.una.daw.reshotel.domain.Habitacion"%>
<%@page import="cr.ac.una.daw.reshotel.dto.HabitacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Habitaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de habitaciones</div>
<%
	Map<String, Object> myModel = (Map<String, Object>) request
			.getAttribute("model");
	List<Habitacion> objs = (List<Habitacion>) myModel
			.get("habitaciones");
%>
<table>
	<thead>
		<tr>
			<th>Ocupaci&oacute;n M&aacute;xima</th>
			<th>N&uacute;mero</th>
			<th>Mobiliario</th>
			<th>Costo</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
		<%
			for (Habitacion obj : objs) {
		%>
		<tr>
			<td><%=obj.getOcupacionMaxima()%></td>
			<td><%=obj.getNumero()%></td>
			<td><%=obj.getMobiliario()%></td>
			<td><%=obj.getCosto()%></td>
			<td><a href='/reshotel/detalleHabitacion?id=<%=obj.getId()%>'> <input
					class="btn" type="submit" value="Detalle" /></a> <a
				href='/reshotel/eliminarHabitacion?id=<%=obj.getId()%>'> <input
					class="btn btn-danger" type="submit" value="Eliminar" /></a></td>
		</tr>
		<%
			}
		%>
	</tbody>
	<tfoot>
		<tr>
			<td><a href='/reshotel/agregarHabitacion'> <input
					class="btn btn-success" type="submit" name="action" value="Agregar" /></a></td>
		</tr>
	</tfoot>
</table>
</html>