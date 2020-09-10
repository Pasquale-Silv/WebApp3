<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
</head>
<body>
	<div>
		<form action="<%= request.getContextPath() + "/servlet1" %>" method="get">
			<label for="username">USER:</label><br>
			<input name="username" id="username" type="text" placeholder="Scrivi il tuo username"><br>
			<label for="password">PASSWORD:</label><br>
			<input name="password" id="password" type="password" placeholder="Scrivi la tua psw"><br>
			<button type="submit">INVIA</button>
		</form>
	</div>
</body>
</html>