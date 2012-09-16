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
	background-color: #49AFCD;
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#5BC0DE),
		to(#2F96B4) );
	background-image: -webkit-linear-gradient(top, #5BC0DE, #2F96B4);
	background-image: -o-linear-gradient(top, #5BC0DE, #2F96B4);
	background-image: linear-gradient(to bottom, #5BC0DE, #2F96B4);
	background-image: -moz-linear-gradient(top, #5BC0DE, #2F96B4);
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

.btn-success {
	color: white;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
	background-color: #5BB75B;
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#62C462),
		to(#51A351) );
	background-image: -webkit-linear-gradient(top, #62C462, #51A351);
	background-image: -o-linear-gradient(top, #62C462, #51A351);
	background-image: linear-gradient(to bottom, #62C462, #51A351);
	background-image: -moz-linear-gradient(top, #62C462, #51A351);
	background-repeat: repeat-x;
	border-color: #51A351 #51A351 #387038;
	filter: progid:dximagetransform.microsoft.gradient(startColorstr='#ff62c462',
		endColorstr='#ff51a351', GradientType=0 );
	filter: progid:dximagetransform.microsoft.gradient(enabled=false );
}

.btn-danger {
	color: white;
	text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.25);
	background-color: #DA4F49;
	background-image: -webkit-gradient(linear, 0 0, 0 100%, from(#EE5F5B),
		to(#BD362F) );
	background-image: -webkit-linear-gradient(top, #EE5F5B, #BD362F);
	background-image: -o-linear-gradient(top, #EE5F5B, #BD362F);
	background-image: linear-gradient(to bottom, #EE5F5B, #BD362F);
	background-image: -moz-linear-gradient(top, #EE5F5B, #BD362F);
	background-repeat: repeat-x;
	border-color: #BD362F #BD362F #802420;
	filter: progid:dximagetransform.microsoft.gradient(startColorstr='#ffee5f5b',
		endColorstr='#ffbd362f', GradientType=0 );
	filter: progid:dximagetransform.microsoft.gradient(enabled=false );
}

.btn-success:hover,.btn-success:active,.btn-success.active,.btn-success.disabled,.btn-success[disabled]
	{
	color: white;
	background-color: #51A351;
}

.btn-danger:hover,.btn-danger:active,.btn-danger.active,.btn-danger.disabled,.btn-danger[disabled]
	{
	color: white;
	background-color: #BD362F;
}

textarea,input[type="text"],input[type="password"],input[type="datetime"],input[type="datetime-local"],input[type="date"],input[type="month"],input[type="time"],input[type="week"],input[type="number"],input[type="email"],input[type="url"],input[type="search"],input[type="tel"],input[type="color"],.uneditable-input
	{
	background-color: white;
	border: 1px solid #CCC;
	-webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
	-moz-box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
	box-shadow: inset 0 1px 1px rgba(0, 0, 0, 0.075);
	-webkit-transition: border linear 0.2s, box-shadow linear 0.2s;
	-moz-transition: border linear 0.2s, box-shadow linear 0.2s;
	-o-transition: border linear 0.2s, box-shadow linear 0.2s;
	transition: border linear 0.2s, box-shadow linear 0.2s;
}

select,textarea,input[type="text"],input[type="password"],input[type="datetime"],input[type="datetime-local"],input[type="date"],input[type="month"],input[type="time"],input[type="week"],input[type="number"],input[type="email"],input[type="url"],input[type="search"],input[type="tel"],input[type="color"],.uneditable-input
	{
	display: inline-block;
	height: 20px;
	padding: 4px 6px;
	margin-bottom: 9px;
	font-size: 14px;
	line-height: 20px;
	color: #555;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	border-radius: 3px;
	width: 75%;
	height: 100%;
	font-size: 18px;
}
</style>
<div class="header">
	<a href="/index.jsp">Sistema de reservación hotelera</a>
</div>
