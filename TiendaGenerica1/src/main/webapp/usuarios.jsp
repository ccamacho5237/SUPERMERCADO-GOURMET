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
				<a href="#" class="nav-enlace"> Usuarios</a> <a href="#"
					class="nav-enlace"> Clientes</a> <a href="#" class="nav-enlace">
					Proveedores</a> <a href="#" class="nav-enlace"> Productos</a> <a
					href="#" class="nav-enlace"> Ventas</a> <a href="#"
					class="nav-enlace"> Reportes</a> <a href="#" class="nav-enlace">
					SALIR</a>
			</nav>

		</div>
	</header>

	<section class="form-register">
		<div class="form-group">
			<img src="img/Logo1.png" class="avatar" alt="Avatar Image">

		</div>
		<h4>Formulario de Registro Usuarios</h4>


		<input class="controls" type="text" name="nombre_usuario"
			id="nombre_usuario" placeholder="Ingresar Nombre"> <input
			class="controls" type="text" name="cedula_usario" id="cedula_usuario"
			placeholder="Ingresar # Cedula"> <input class="controls"
			type="email" name="email_usuario" id="email_usuario"
			placeholder="Ingresar  Correo"> <input class="controls"
			type="text" name="rol_usuario" id="usuario"
			placeholder="Ingresar Usuario"> <input class="controls"
			type="text" name="password" id="contraseña"
			placeholder="Ingresar Contraseña">
		<p>
			Estoy de acuerdo con <a href="#">Terminos y Condiciones</a>
		</p>

		<table>
			<tr>
				<td>
					<button class="botons" type="submit" name="AgregarCliente">Agregar</button>
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