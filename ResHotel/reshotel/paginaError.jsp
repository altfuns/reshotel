<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Sistema Universitario</title>
        <style>
            .errorContent{
                border: 3px solid rgba(0, 0, 0, 0.1);
                background: #F7F4D9;
                padding: 10px;
            }
        </style>
    </head>
    <h1 style="color: red;">Error al ejecutar acción</h1>
    <div class="errorContent">
        <%
            String error = request.getAttribute("mensaje").toString();
            out.println(error);
        %>
    </div>
</html>