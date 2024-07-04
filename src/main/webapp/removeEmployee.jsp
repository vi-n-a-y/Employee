<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Remove Employee</title>
</head>
<body>
<form action="emp" >
<label>Employee Id</label>
<input type="text" name="empId">
<input type="hidden" name="action" value="removeEmployee" placeholder="enter employee ID">
<button>Delete</button>

</form>
<a href="home.jsp"><button>Home</button></a>

</body>
</html>