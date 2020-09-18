<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AUTENTICATO</title>
<link rel="stylesheet" type="text/css" href="../css/styleJsp.css">
</head>
<body>
	<h3>CONGRATULAZIONI <%= request.getSession().getAttribute("username") + "!!!" %></h3>
	<p>Ti sei autenticato correttamente!</p>
</body>
</html>