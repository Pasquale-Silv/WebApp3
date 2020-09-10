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
			<label for="username">USER:</label>
			<input name="username" type="text" placeholder="Scrivi il tuo username">
			<br>
			<label for="password">PASSWORD:</label>
			<input name="password" type="password" placeholder="Scrivi la tua psw">
			<button type="submit">INVIA</button>
		</form>
	</div>
</body>
</html>