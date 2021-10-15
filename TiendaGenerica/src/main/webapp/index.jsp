<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
  
  <link rel="stylesheet" href="Style.css">
  <title>Formulario Registro</title>
</head>
<body>
  <section class="form-register">
  	<div class="form-group" text-center>
		<center>
		
		  <img src="img/Logo.png" class="avatar" alt="Avatar Image">
		  
	</div>
    <h4>Formulario de Registro </h4>
 
    <input class="controls" type="text" name="nombres" id="nombres" placeholder="Ingrese su Nombre">
    <input class="controls" type="text" name="apellidos" id="apellidos" placeholder="Ingrese su Apellido">
     <input class="controls" type="text" name="cedula" id="cedula" placeholder="Ingrese # Cedula">
    <input class="controls" type="email" name="correo" id="correo" placeholder="Ingrese su Correo">
    <input class="controls" type="text" name="fecha" id="fecha" placeholder="Ingrese Fecha de Nacimiento">
    <input class="controls" type="text" name="genero" id="genero" placeholder="Ingrese Genero">
    <input class="controls" type="text" name="usuario" id="usuario" placeholder="Ingrese Usuario">
    <input class="controls" type="text" name="contraseña" id="contraseña" placeholder="Ingrese su Contraseña">
    <p>Estoy de acuerdo con <a href="#">Terminos y Condiciones</a></p>
    <input class="botons" type="submit" value="Registrar">
    <input class="botons" type="submit" value="Salir">
    
  </section>

</body>
</html>