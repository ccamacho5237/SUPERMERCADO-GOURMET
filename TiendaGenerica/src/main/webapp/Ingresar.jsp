<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<link href="estilo.css" rel="stylesheet">
		<meta charset="ISO-8859-1">
		<title>SuperMercado Gourmet</title>
		<script src="https://kit.fontawesome.com/cc6483a3b9.js" crossorigin="anonymous"></script>
	</head>
	<body class="body">
		<header>
		</header>
		<div class="cuadro" align="center">
			<h1 class="titulo">Ingresar</h1>
			<br>
			<form method="get" action="./servlet">
				<i class="fas fa-user"></i>
				<input class="caja" type = "text" placeholder = "Usuario" name ="usuario"/><br>
				<br>
				<i class="fas fa-key"></i>
				<input class="caja" type = "password" placeholder = "Contraseņa" name="contraseņa"/><br>
				<br>	
				<input class="boton" type = "submit"  value = "Entrar">
				<br>
				<a href ="#">he olvidado mi contraseņa</a>
				<br>
				<a href ="index.jps">no tengo cuenta</a>		
			</form>
		</div>
	</body>
</html>