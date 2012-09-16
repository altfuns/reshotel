<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hoteles</title>
<style type="text/css">
.menuPrincipal ul {
	padding: 0;
	list-style-type: none;
	display: block;
	font: bold 12px sans-serif;
	line-height: 165%;
	width: 350px;
	border: 1px gray solid;
	border-left: 3px #333 solid;
}

.menuPrincipal ul li {
	margin: 0;
	padding: 0;
	border-top: 1px white solid;
	border-bottom: 1px silver solid;
}

.menuPrincipal ul li:FIRST-CHILD {
	border-top: none;
}

.menuPrincipal ul li a {
	display: block;
	text-decoration: none;
	color: #333;
	background: #f2f2f2;
	padding: 10px 20px;
}

.menuPrincipal ul li a:hover {
	background: #f9f9f9 no-repeat 0 9px;
	border-left: 3px orange solid;
}
</style>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
	<div class='menuPrincipal'>
		<ul>
			<li><a href='/reshotel/listaHoteles'>Mantenimiento de
					Hoteles</a></li>
			<li><a href='/reshotel/listaHabitaciones'>Mantenimiento de
					Habitaciones</a></li>
			<li><a href='/reshotel/listaReservaciones'>Mantenimiento de
					Reservaciones</a></li>
			<li><a href='/reshotel/listaClientes'>Mantenimiento de
					Clientes</a></li>
		</ul>
	</div>
</body>
</html>