<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet" href="css/estilo1.css">
<link rel="stylesheet" href="css/menu.css">
<title>Formulario Registro Proveedores</title>
</head>

<body>
	<header class="menu">
		<img src="img/Logo1.png" class="avatar1" alt="Avatar1 Image">
		<div class="container logo-nav-container">
			<a class="saludo">Proveedores </a>
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
		<h4>Formulario de Registro Proveedores</h4>


		<input class="controls" type="text" name="nit_proveedor"
			id="nit_proveedor" placeholder="Ingresar Nit"><input class="controls"
			type="text" name="nombre_proveedor" id="nombre_proveedor"
			placeholder="Ingresar Nombre">
			 <input	class="controls" type="text" name="ciudad_proveedor"
			id="ciudad_proveedor" placeholder="Ingresar Ciudad"> 
			<input class="controls" type="text" name="dirección_proveedor" id="direcon_proveedor"
			placeholder="Ingresar direcion"> <input class="controls"
			type="text" name="direccion_proveedor" id="direccion_proveedor"
			placeholder="Ingresar Direccion"><input class="controls"
			type="text" name="celular_proveedor" id="celular_proveedor"
			placeholder="Ingresar # Celular">
		

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