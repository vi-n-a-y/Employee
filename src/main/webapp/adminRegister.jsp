<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="emp" method="post">
	<input type="text" name="name" placeholder="Enter your name">
	<input type="password" name="password" placeholder="enter your password">
	<input type="email" name="mail" placeholder="enter your mail">
	<input type="hidden" name="action" value="adminRegister">
	<input type="button" value="submit">
	
	</form>

</body>
</html>