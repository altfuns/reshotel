<style>
body {
	font-family: sans-serif;
	margin: 30px 0 0 0;
}

.header {
	width: 100%;
	height: 30px;
	background-color: #333;
	position: absolute;
	top: 0px;
	left: 0px;
	line-height: 30px;
	box-shadow: 0px 0px 10px black;
	border-bottom: 1px white solid;
}

.header a {
	text-decoration: none;
	color: white;
	font-weight: bold;
	font-size: 14px;
	margin-left: 10px;
}

.header a:hover {
	color: silver;
}

.encabezadoPagina {
	background: #F2F2F2;
	width: 100%;
	height: 50px;
	padding: 5px 10px;
	line-height: 50px;
	color: #AAA;
	font-size: 20px;
	font-weight: bold;
	box-shadow: 0 0px 10px black;
	margin-bottom: 20px;
}

table {
	width: 70%;
	margin: 0 auto;
}

table th {
	padding: 5px;
	color: white;
	text-shadow: 1px 1px 1px black;
	background-color: #9DD929;
	background: -webkit-gradient(linear, left bottom, left top, color-stop(0.02, #7BC043
		), color-stop(0.51, #8BC642), color-stop(0.87, #9ED929) );
}

table tbody td {
	padding: 10px;
	text-align: center;
	background-color: #f2f2f2;
	border: 2px solid #E7EFE0;
	-moz-border-radius: 2px;
	-webkit-border-radius: 2px;
	border-radius: 2px;
	color: #666;
	text-shadow: 1px 1px 1px #fff;
}

.btn {
	display: inline-block;
	padding: 4px 14px;
	margin-bottom: 0;
	font-size: 14px;
	line-height: 20px;
	color: #333;
	text-align: center;
	text-shadow: 0 1px 1px rgba(255, 255, 255, 0.75);
	vertical-align: middle;
	cursor: pointer;
	background-color: whiteSmoke;
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(white),
		to(#E6E6E6) );
	background-image: -webkit-linear-gradient(top, white, #E6E6E6);
	background-image: -o-linear-gradient(top, white, #E6E6E6);
	background-image: linear-gradient(to bottom, white, #E6E6E6);
	background-image: -moz-linear-gradient(top, white, #E6E6E6);
	background-repeat: repeat-x;
	border: 1px solid #BBB;
	border-color: rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.1) rgba(0, 0, 0, 0.25);
	border-bottom-color: #A2A2A2;
	-webkit-border-radius: 4px;
	-moz-border-radius: 4px;
	border-radius: 4px;
	filter: progid:dximagetransform.microsoft.gradient(startColorstr='#ffffffff',
		endColorstr='#ffe6e6e6', GradientType=0 );
	filter: progid:dximagetransform.microsoft.gradient(enabled=false );
	-webkit-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	-moz-box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
	box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.2), 0 1px 2px
		rgba(0, 0, 0, 0.05);
}

.btn:hover {
	color: #333;
	text-decoration: none;
	background-color: #E6E6E6;
	background-position: 0 -15px;
	-webkit-transition: background-position 0.1s linear;
	-moz-transition: background-position 0.1s linear;
	-o-transition: background-position 0.1s linear;
	transition: background-position 0.1s linear;
}
</style>
<div class="header">
	<a href="/index.jsp">Sistema de reservación hotelera</a>
</div>
