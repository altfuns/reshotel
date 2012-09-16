<%@page import="cr.ac.una.daw.reshotel.dto.ClienteDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Clientes</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de clientes</div>
<%
	List<ClienteDTO> objs = (List<ClienteDTO>) request.getAttribute("clientes");
%>
<table>
	<thead>
		<tr>
			<th>Identificaci&oacute;n</th>
			<th>Nombre</th>
			<th>Tel&eacute;fono</th>
			<th>Residencia</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
		<%
			for (ClienteDTO obj : objs) {
		%>
		<tr>
			<td><%=obj.identificacion%></td>
			<td><%=obj.nombre%></td>
			<td><%=obj.telefono%></td>
			<td> -- </td>
			<td><a href='/reshotel/detalleCliente?id=<%=obj.id%>'> <input class="btn" 
					type="submit" value="Detalle" /></a> <a
				href='/reshotel/eliminarCliente?id=<%=obj.id%>'> <input class="btn btn-danger" 
					type="submit" value="Eliminar" /></a></td>
		</tr>
		<%
			}
		%>
	</tbody>
	<tfoot>
		<tr>
			<td><a href='/reshotel/agregarCliente'> <input type="submit" class="btn btn-success" 
					name="action" value="Agregar" /></a></td>
		</tr>
	</tfoot>
</table>
</html>