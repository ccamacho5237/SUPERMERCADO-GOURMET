<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import='java.util.Date'%>
<%@ page import='java.util.ArrayList'%>
<html>
<head>
	<link href="estilo.css" rel="stylesheet">
	<link rel="stylesheet" href="css/menu.css">
	<meta charset="ISO-8859-1">
	<title>SuperMercado Gourmet</title>
	<script src="https://kit.fontawesome.com/cc6483a3b9.js"></script>
</head>
<body>
	<header class="menu">
		<img src="img/Logo1.png" class="avatar1" alt="Avatar1 Image">
		<div class="container logo-nav-container">
			<a class="saludo">Login </a>
			<nav class="navigation">
				<a href="#" class="nav-enlace"> Usuarios</a> 
				<a href="#"class="nav-enlace"> Clientes</a> 
				<a href="#" class="nav-enlace">Proveedores</a> 
				<a href="#" class="nav-enlace"> Productos</a> 
				<a href="#" class="nav-enlace"> Ventas</a> 
				<a href="#"class="nav-enlace"> Reportes</a> 
				<a href="Login.jsp" class="nav-enlace"> login</a>
			</nav>
		</div>
	</header>
	<div class="cuadro" align="center">
		<h1 class="titulo">Ingresar</h1>
		<br>
		<form method="post" action="./Servlet">
			<i class="fas fa-user"></i> <input class="caja" type="text"
				name="usuario" placeholder="Usuario" /><br> <br> <i
				class="fas fa-key"></i> <input class="caja" type="password"
				name="password" placeholder="Contraseña" /><br> <br> <input
				class="boton" type="submit" name="accion" value="Entrar"> <br>
			<a href="#">he olvidado mi contraseña</a> <br> <a
				href="usuarios.jsp">no tengo cuenta</a>
		</form>
	</div>
</body>
</html>