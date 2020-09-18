<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<link rel="stylesheet" type="text/css" href="../css/styleJsp.css">
</head>
<body>
	<div>
		<form action="<%= request.getContextPath() + "/servlet1" %>" method="post">
			<label for="username">USER:</label><br>
			<input name="username" id="username" type="text" placeholder="Scrivi il tuo username"><br>
			<label for="password">PASSWORD:</label><br>
			<input name="password" id="password" type="password" placeholder="Scrivi la tua psw"><br>
			<button type="submit">INVIA</button>
		</form>
	</div>
	
	<c:if test="${sessionScope.loginFailed}">
		<p>Credenziali non corrette, inserisci validi username e password</p>
	</c:if>
	
</body>
</html>