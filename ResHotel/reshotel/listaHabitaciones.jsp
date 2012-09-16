<%@page import="cr.ac.una.daw.reshotel.dto.HabitacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Habitaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<h2>Listado de habitaciones</h2>
<%
	List<HabitacionDTO> objs = (List<HabitacionDTO>) request
			.getAttribute("habitaciones");
%>
<table>
	<tr>
		<th>Ocupaci&oacute;n M&aacute;xima</th>
		<th>N&uacute;mero</th>
		<th>Mobiliario</th>
		<th>Costo</th>
	</tr>
	<%
		for (HabitacionDTO obj : objs) {
	%>
	<tr>
		<td><%=obj.ocupacionMaxima%></td>
		<td><%=obj.numero%></td>
		<td><%=obj.mobiliario%></td>
		<td><%=obj.costo%></td>
		<td><a href='/reshotel/detalleHabitacion?id=<%=obj.id%>'> <input
				type="submit" value="Detalle" /></a> <a
			href='/reshotel/eliminarHabitacion?id=<%=obj.id%>'> <input
				type="submit" value="Eliminar" /></a></td>
	</tr>
	<%
		}
	%>
</table>
<table>
	<tr>
		<td><a href='/reshotel/agregarHabitacion'> <input
				type="submit" name="action" value="Agregar" /></a></td>
	</tr>
</table>
</html>