<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="./CargaProductos"enctype="multipart/form-data">
		<input id="cv_upload" type="file" name="archivo">
		<input type="submit" name="cargar" value="add Archivo">
	</form>
</body>
</html>