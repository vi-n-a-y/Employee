<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Register</title>
</head>
<body>
<form action="emp" method="post">
<h1>Employee Login</h1>
<a href="home.jsp"><button>Home</button></a>
<label>Name : </label>
<input type="text" name="name" placeholder="Enter your Name">

<br>
<label>Gender</label>
<input type="text" name="gender" placeholder="your Gender">
<br>
<label>age</label>
<input type="number" name="age" placeholder="Enter your age">
<br>
<label>mail</label>
<input type="email" name="mail" placeholder="Enter your mail">
<br>
<label>jobRole</label>
<input type="text" name="jobRole" placeholder="Enter your role">
<br>
<label>phone</label>
<input type="text" name="phone" placeholder="Enter your phone Number">
<br>
<input type="hidden" name="action" value="employeeRegister">
<button>submit</button>
</form>
</body>
</html>
