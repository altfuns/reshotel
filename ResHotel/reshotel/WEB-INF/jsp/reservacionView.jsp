<%@page import="cr.ac.una.daw.reshotel.domain.Reservacion"%>
<%@page import="cr.ac.una.daw.reshotel.dto.ReservacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Reservaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de reservaciones</div>
<%
	Map<String, Object> myModel = (Map<String, Object>) request
			.getAttribute("model");
	List<Reservacion> objs = (List<Reservacion>) myModel
			.get("reservaciones");
%>
<table>
	<thead>
		<tr>
			<th>Habitaci&oacute;n</th>
			<th>Fecha Entrada</th>
			<th>Fecha Salida</th>
			<th>Ocupaci&oacute;n</th>
			<th>Monto</th>
			<th>Cliente</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
		<%
			for (Reservacion obj : objs) {
		%>
		<tr>
			<td><%=obj.getHabitacionId()%></td>
			<td><%=obj.getFechaEntrada()%></td>
			<td><%=obj.getFechaSalida()%></td>
			<td><%=obj.getOcupacion()%></td>
			<td><%=obj.getMonto()%></td>
			<td><%=obj.getIdentificacionCliente()%></td>
			<td><a href='/reshotel/detalleReservacion?id=<%=obj.getId()%>'>
					<input class="btn" type="submit" value="Detalle" />
			</a> <a href='/reshotel/eliminarReservacion?id=<%=obj.getId()%>'> <input
					class="btn btn-danger" type="submit" value="Eliminar" /></a></td>
		</tr>
		<%
			}
		%>
	</tbody>
	<tfoot>
		<tr>
			<td><a href='/reshotel/agregarReservacion'> <input
					class="btn btn-success" type="submit" name="action" value="Agregar" /></a></td>
		</tr>
	</tfoot>
</table>
</html>