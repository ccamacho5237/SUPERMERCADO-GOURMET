<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import='java.util.Date' %>
<%@ page import='co.edu.unbosque.supermercadogourmet.Usuario' %>
<%@ page import='java.util.ArrayList' %>
<html>
<head>
<link rel="stylesheet" href="css/menu.css">
<meta charset="ISO-8859-1">
<title>Tienda Genérica</title>
</head>
<body>
<header class="menu">
		<img src="img/Logo1.png" class="avatar1" alt="Avatar1 Image">
		<div class="container logo-nav-container">
		<a class="saludo">BIENVENIDOS </a>
			<nav class="navigation">
				<a href="usuarios.jsp" class="nav-enlace"> Usuarios</a> 
				<a href="#"class="nav-enlace"> Clientes</a> 
				<a href="#" class="nav-enlace">Proveedores</a> 
				<a href="#" class="nav-enlace"> Productos</a> 
				<a href="#" class="nav-enlace"> Ventas</a> 
				<a href="#"class="nav-enlace"> Reportes</a> 
				<a href="Login.jsp" class="nav-enlace"> login</a>
			</nav>
		</div>
	</header>
	<p align="center"> LISTADO DE USUARIOS </p>
	<p align="center"> Hora Servidor es <%= new Date()%></p>
	<table>
		<tr>
			<td><label>Cédula</label></td>
			<td><label>Nombre</label></td>
			<td><label>Apellido</label></td>		
			<td><label>Correo</label></td>
			<td><label>Fecha</label></td>
			<td><label>Genero</label></td>
			<td><label>Usuario</label></td>
			<td><label>Password</label></td>
		</tr>
		<%
		ArrayList<Usuario> lista = (ArrayList<Usuario>) request.getAttribute("lista");
		for (Usuario usuario : lista){
		%>
		<tr>
			<td><%=usuario.getCedula_usuario()%></td>
			<td><%=usuario.getNombre_usuario()%></td>
			<td><%=usuario.getApellido_usuario()%></td>
			<td><%=usuario.getEmail_usuario()%></td>
			<td><%=usuario.getFecha_usuario()%></td>
			<td><%=usuario.getGenero_usuario()%></td>
			<td><%=usuario.getUsuario()%></td>
			<td><%=usuario.getPassword()%></td>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>