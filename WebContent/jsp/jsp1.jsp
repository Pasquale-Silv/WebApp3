<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prima JSP</title>
<!-- Link alla styling(CSS) per i file di tipo .jsp -->
<link rel="stylesheet" type="text/css" href="../css/styleJsp.css">
</head>
<body>
	<h1>Questa è la tua prima jsp.  ${a} ${param.parametro1}</h1>
	<a href="<%= request.getContextPath() %>">Torna in <b> <%= request.getContextPath() %> </b> <br></a>
	
	<% 
		for(int i=0; i<5; i++){
		out.print("Siamo a: " + i + "<br>");
	    }
	%>
	
	<h2>Voilà</h2>
</body>
</html>