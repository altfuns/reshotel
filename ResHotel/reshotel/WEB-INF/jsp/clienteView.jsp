<%@page import="cr.ac.una.daw.reshotel.domain.Cliente"%>
<%@page import="cr.ac.una.daw.reshotel.dto.ClienteDTO"%>
<%@ page import="java.util.*"%>
<html>
<head>
<title>Clientes</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Listado de clientes</div>
<%
	Map<String, Object> myModel = (Map<String, Object>)request.getAttribute("model");
	List<Cliente> objs = (List<Cliente>) myModel.get("clientes");
%>
<table>
	<thead>
		<tr>
			<th>Identificaci&oacute;n</th>
			<th>Nombre</th>
			<th>Tel&eacute;fono</th>
			<th>Acciones</th>
		</tr>
	</thead>
	<tbody>
		<%
			for (Cliente obj : objs) {
		%>
		<tr>
			<td><%=obj.getIdentificacion()%></td>
			<td><%=obj.getNombre()%></td>
			<td><%=obj.getTelefono()%></td>
			<td><a href='/reshotel/detalleCliente?id=<%=obj.getId()%>'> <input class="btn" 
					type="submit" value="Detalle" /></a> <a
				href='/reshotel/eliminarCliente?id=<%=obj.getId()%>'> <input class="btn btn-danger" 
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