<%@page import="cr.ac.una.daw.reshotel.domain.Ubicacion"%>
<%@page import="cr.ac.una.daw.reshotel.domain.Cliente"%>
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
	Map<String, Object> myModel = (Map<String, Object>) request
			.getAttribute("model");
	Cliente cliente = (Cliente) myModel.get("cliente");
	List<Ubicacion> ubicaciones = (List<Ubicacion>) myModel
			.get("ubicaciones");
%>

<form name="ActualizarCliente" action="/reshotel/actualizarCliente"
	method="get">
	<input type="hidden" name="id" value="<%=cliente.getId()%>" />
	<table>
		<tbody>
			<tr>
				<th>Identificaci&oacute;n:</th>
				<td><input type="text" name="identificacion"
					value="<%=cliente.getIdentificacion()%>" /></td>
			</tr>
			<tr>
				<th>Nombre:</th>
				<td><input type="text" name="nombre"
					value="<%=cliente.getNombre()%>" /></td>
			</tr>
			<tr>
				<th>Tel&eacute;fono:</th>
				<td><input type="text" name="telefono"
					value="<%=cliente.getTelefono()%>" /></td>
			</tr>
			<tr>
				<th>N&uacute;mero tarjeta cr&eacute;dito:</th>
				<td><input type="text" name="numeroTarjetaCredito"
					value="<%=cliente.getNumeroTarjetaCredito()%>" /></td>
			</tr>
			<tr>
				<th>Residencia:</th>
				<td><select name="residencia">
						<option value="-1">Seleccione una opción</option>
						<%
							for (Ubicacion ubicacion : ubicaciones) {
						%>
						<option value="<%=ubicacion.getId()%>"
							<%=ubicacion.getId() == cliente.getResidenciaId() ? "selected"
						: ""%>><%=ubicacion.getCiudad() + ", " + ubicacion.getPais()%></option>
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