<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tienda Generica</title>
</head>
<body>
	<p align="center">CREACION DE USUARIOS</p>
	<form method="post" action="./Servlet">
		<table>
			<tr>
				<td><label>Cedula:</label></td>
				<td><input type="text" name="cedula"></td>
			</tr>
			<tr>
				<td><label>Nombre:</label></td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td><label>Apellido:</label></td>
				<td><input type="text" name="apellido"></td>
			</tr>
			<tr>
				<td><label>Correo Electronico:</label></td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td><label>Fecha de nacimiento:</label></td>
				<td><input type="text" name="fecha"></td>
			</tr>
			<tr>
				<td><label>Genero:</label></td>
				<td><input type="text" name="genero"></td>
			</tr>
			<tr>
				<td><label>Usuario:</label></td>
				<td><input type="text" name="usuario"></td>
			</tr>
			<tr>
				<td><label>Contraseņa:</label></td>
				<td><input type="text" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Agregar" name="Agregar"></td>
			</tr>
			<tr>
				<td><button type="submit" name="Listar">Listar
						Usuarios</button></td>
			</tr>
		</table>
	</form>
</body>
</html>