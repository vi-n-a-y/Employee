<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Register</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

<form action="emp" method="post">
	<input type="text" name="name1" placeholder="Enter your name">
	<input type="password" name="password" placeholder="enter your password">
	<input type="text" name="mail" placeholder="enter your mail">
	<input type="hidden" name="action" value="adminRegister">
	<button>submit</button>
	
	</form>

</body>
</html>