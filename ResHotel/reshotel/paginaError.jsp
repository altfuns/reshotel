<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Sistema Universitario</title>
<style>
body {
	font-family: sans-serif;
}

.errorContent {
	border: 3px solid rgba(0, 0, 0, 0.1);
	background: #F7F4D9;
	padding: 10px;
	font-size: 12px;
	width: 95%;
	margin: 0 auto;
}
</style>
</head>
<h3 style="color: red;">Error al ejecutar acción</h3>
<div class="errorContent">
	<%
		String error = request.getAttribute("mensaje").toString();
		out.println(error);
	%>
</div>
</html>