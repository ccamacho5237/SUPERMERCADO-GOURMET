<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
    <link rel="stylesheet" href="css/estilo.css">
  <title>Iniciar Sesi�n</title>
</head>

  <body>

    <div class="login-box">
      <img src="img/Logo1.png" class="avatar" alt="Avatar Image">
      <h1>Iniciar Sesi�n</h1>
      
     	<form method="post" action="./Servlet">
        <!-- USERNAME INPUT -->
        <label for="username">Usuario</label>
        <input type="text" placeholder="Ingresar Usuario">
        <!-- PASSWORD INPUT -->
        <label for="password">Contrase�a</label>
        <input type="password" placeholder="Ingresar Contrase�a">
        <input type="submit" value="Ingresar">
        <a href="#">Olvidaste tu Contrase�a?</a><br>
        <a href="#">No tienes una Cuenta?</a>
        
      </form>
    </div>
  </body>
</html>