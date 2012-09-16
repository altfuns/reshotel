<%@page import="cr.ac.una.daw.reshotel.dto.HotelDTO"%>
<%@ page import="java.util.*" %>
<html>
    <head>
        <title>Hoteles</title>
    </head>
    
    <jsp:include page="header.jsp"></jsp:include>
    
    <div class="encabezadoPagina">Listado de hoteles</div>
    <% List<HotelDTO> objs = (List<HotelDTO>) request.getAttribute("hoteles");%>
    <table>
        <tr><th>Telefono</th><th>Email</th><th>Clase</th><th>Encargado</th><th>Acciones</th></tr>
        <% for (HotelDTO obj : objs) { %>
        <tr>
            <td><%= obj.telefono %></td>
            <td><%= obj.email %></td>
            <td><%= obj.clase %></td>
            <td><%= obj.nombrePersonaEncargada %></td>
            <td><a href='/reshotel/detalleHotel?id=<%= obj.id %>'>
                    <input type="submit" value="Detalle"/></a>
                <a href='/reshotel/eliminarHotel?id=<%= obj.id %>'>
                    <input type="submit" value="Eliminar"/></a></td>
         </tr>
                    <% }%>
    </table>
    <table>
        <tr><td><a href='/reshotel/agregarHotel'>
                    <input type="submit" name="action" value="Agregar"/></a>
            </td></tr>
    </table>
</html>