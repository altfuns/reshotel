<%@page import="cr.ac.una.daw.reshotel.dto.HabitacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Habitaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de habitaciones</div>
<%
	List<HabitacionDTO> objs = (List<HabitacionDTO>) request
			.getAttribute("habitaciones");
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
			for (HabitacionDTO obj : objs) {
		%>
		<tr>
			<td><%=obj.ocupacionMaxima%></td>
			<td><%=obj.numero%></td>
			<td><%=obj.mobiliario%></td>
			<td><%=obj.costo%></td>
			<td><a href='/reshotel/detalleHabitacion?id=<%=obj.id%>'> <input class="btn" 
					type="submit" value="Detalle" /></a> <a
				href='/reshotel/eliminarHabitacion?id=<%=obj.id%>'> <input class="btn btn-danger" 
					type="submit" value="Eliminar" /></a></td>
		</tr>
		<%
			}
		%>
	</tbody>
	<tfoot>
		<tr>
			<td><a href='/reshotel/agregarHabitacion'> <input class="btn btn-success" 
					type="submit" name="action" value="Agregar" /></a></td>
		</tr>
	</tfoot>
</table>
</html>