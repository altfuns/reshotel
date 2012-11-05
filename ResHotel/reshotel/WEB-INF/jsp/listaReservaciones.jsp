<%@page import="cr.ac.una.daw.reshotel.dto.ReservacionDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Reservaciones</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de reservaciones</div>
<%
	List<ReservacionDTO> objs = (List<ReservacionDTO>) request
			.getAttribute("reservaciones");
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
			for (ReservacionDTO obj : objs) {
		%>
		<tr>
			<td><%=obj.habitacionId%></td>
			<td><%=obj.fechaEntrada%></td>
			<td><%=obj.fechaSalida%></td>
			<td><%=obj.ocupacion%></td>
			<td><%=obj.monto%></td>
			<td><%=obj.identificacionCliente%></td>
			<td><a href='/reshotel/detalleReservacion?id=<%=obj.id%>'> <input
					class="btn" type="submit" value="Detalle" /></a> <a
				href='/reshotel/eliminarReservacion?id=<%=obj.id%>'> <input
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