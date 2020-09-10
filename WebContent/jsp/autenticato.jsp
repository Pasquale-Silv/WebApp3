<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AUTENTICATO</title>
</head>
<body>
	<h3>CONGRATULAZIONI <%= request.getSession().getAttribute("username") + "!!!" %></h3>
	<p>Ti sei autenticato correttamente!</p>
</body>
</html>