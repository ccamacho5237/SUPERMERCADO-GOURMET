<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import='java.util.Date'%>
<%@ page import='java.util.ArrayList'%>
<html>
<head>
<link href="estilo.css" rel="stylesheet">
<meta charset="ISO-8859-1">
<title>SuperMercado Gourmet</title>
<script src="https://kit.fontawesome.com/cc6483a3b9.js"></script>
</head>
<body class="body">
	<nav>
		<ul>
			<li><a href="#">Inicio</a></li>
			<li><a href="#">Productos</a></li>
			<li><a href="#">Proveedores</a></li>
			<li><a href="#">Sobre nosotros</a></li>
			<li><a href="#">Contacto</a></li>
		</ul>
	</nav>
	<div class="cuadro" align="center">
		<h1 class="titulo">Ingresar</h1>
		<br>
		<form method="post" action="./Servlet">
			<i class="fas fa-user"></i> <input class="caja" type="text"
				name="usuario" placeholder="Usuario" /><br> <br> <i
				class="fas fa-key"></i> <input class="caja" type="password"
				name="password" placeholder="Contraseña" /><br> <br>
			<!--<a>${mensaje}</a>-->
			<input class="boton" type="submit" name="accion" value="Entrar">
			<br> <a href="#">he olvidado mi contraseña</a> <br> <a
				href="index.jsp">no tengo cuenta</a>
		</form>
	</div>
</body>
</html>