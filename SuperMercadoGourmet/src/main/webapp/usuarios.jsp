<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="css/estilo1.css">
<link rel="stylesheet" href="css/menu.css">
<title>Formulario Registro Usuarios</title>
</head>

<body>
	<header class="menu">
		<img src="img/Logo1.png" class="avatar1" alt="Avatar1 Image">
		<div class="container logo-nav-container">
			<a class="saludo">USUARIOS </a>
			<nav class="navigation">
				<a href="usuarios.jsp" class="nav-enlace"> Usuarios</a>
				<a href="#" class="nav-enlace"> Clientes</a>
				<a href="#" class="nav-enlace"> Proveedores</a>
				<a href="#" class="nav-enlace"> Productos</a>
				<a href="#" class="nav-enlace"> Ventas</a>
				<a href="#" class="nav-enlace"> Reportes</a>
				<a href="menu.jsp" class="nav-enlace"> SALIR</a>
			</nav>

		</div>
	</header>

	<section class="form-register">
		<div class="form-group">
			<img src="img/Logo1.png" class="avatar" alt="Avatar Image">

		</div>
		<h4>Formulario de Registro Usuarios</h4>
		<form  method="post" action="./Servlet">
		<input class="controls" type="text" name="nombre_usuario"
			id="nombre_usuario" placeholder="Ingresar Nombre"> <input
			class="controls" type="text" name="apellido_usuario"
			id="apellido_usuario" placeholder="Ingresar Apellido"> <input
			class="controls" type="text" name="cedula_usario" id="cedula_usuario"
			placeholder="Ingresar # Cedula"> <input class="controls"
			type="text" name="fecha_usuario" id="fecha_usuario"
			placeholder="Ingresar fecha de nacimiento"><input class="controls"
			type="text" name="genero_usario" id="genero_usuario"
			placeholder="Ingresar Genero"><input class="controls"
			type="email" name="email_usuario" id="email_usuario"
			placeholder="Ingresar  Correo"> <input class="controls"
			type="text" name="usuario" id="usuario"
			placeholder="Ingresar Usuario"> <input class="controls"
			type="password" name="password" id="contrase?a"
			placeholder="Ingresar Contrase?a">
		<p>
			Estoy de acuerdo con <a href="#">Terminos y Condiciones</a>
		</p>

		<table>
			<tr>
				<td>
					<button class="botons" type="submit" name="AgregarUsuario">Agregar</button>
					<button class="botons" type="submit" name="ListarClientes">Listar</button>
					<button class="botons" type="submit" name="ActualizarCliente">Actualizar</button>
					<button class="botons" type="submit" name="EliminarCliente">Eliminar</button>

				</td>
			</tr>
		</table>
		</form>
	</section>

</body>
</html>