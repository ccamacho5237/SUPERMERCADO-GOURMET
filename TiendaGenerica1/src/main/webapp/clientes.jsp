<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="css/estilo1.css">
<link rel="stylesheet" href="css/menu.css">
<title>Formulario Registro Clientes</title>
</head>

<body>
<header class="menu">
		<img src="img/Logo1.png" class="avatar1" alt="Avatar1 Image">
		<div class="container logo-nav-container">
		<a class="saludo">CLIENTES</a>
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
		<h4>Formulario de Registro Clientes</h4>
		

			<input class="controls" type="text" name="nombre_cliente" id="nombre_cliente"
				placeholder="Ingresar Nombre"> <input class="controls"
				type="text" name="cedula_cliente" id="cedula_cliente"
				placeholder="Ingresar # Cedula"> <input class="controls"
				type="email" name="email_cliente" id="email_cliente"
				placeholder="Ingresar  Correo"> <input class="controls"
				type="text" name="direccion_cliente" id="direccion_cliente"
				placeholder="Ingresar Dirección"> <input class="controls"
				type="text" name="telefono_cliente" id="telefono_cliente"
				placeholder="Ingresar Celular"> 
			
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