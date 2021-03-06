<%@page import="cr.ac.una.daw.reshotel.dto.ClienteDTO"%>
<%@page import="cr.ac.una.daw.reshotel.dto.UbicacionDTO"%>
<%@page import="java.util.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Clientes</title>
</head>

<jsp:include page="header.jsp"></jsp:include>

<div class="encabezadoPagina">Detalle de cliente</div>
<%
	ClienteDTO cliente = (ClienteDTO) request.getAttribute("cliente");
	List<UbicacionDTO> ubicaciones = (List<UbicacionDTO>) request
			.getAttribute("ubicaciones");

%>

<form name="ActualizarCliente" action="/reshotel/actualizarCliente"
	method="get">
	<input type="hidden" name="id" value="<%=cliente.id%>" />
	<table>
		<tbody>
			<tr>
				<th>Identificaci&oacute;n:</th>
				<td><input type="text" name="identificacion"
					value="<%=cliente.identificacion%>" /></td>
			</tr>
			<tr>
				<th>Nombre:</th>
				<td><input type="text" name="nombre"
					value="<%=cliente.nombre%>" /></td>
			</tr>
			<tr>
				<th>Tel&eacute;fono:</th>
				<td><input type="text" name="telefono"
					value="<%=cliente.telefono%>" /></td>
			</tr>
			<tr>
				<th>N&uacute;mero tarjeta cr&eacute;dito:</th>
				<td><input type="text" name="numeroTarjetaCredito"
					value="<%=cliente.numeroTarjetaCredito%>" /></td>
			</tr>
			<tr>
				<th>Residencia:</th>
				<td><select name="residencia">
						<option value="-1">Seleccione una opci�n</option>
						<%
							for (UbicacionDTO ubicacion : ubicaciones) {
						%>
						<option value="<%= ubicacion.id %>"
							<%= ubicacion.id == cliente.residencia.id ? "selected" : ""%>><%= ubicacion.ciudad + ", " + ubicacion.pais %></option>
						<%
							}
						%>
				</select>
				</td>
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