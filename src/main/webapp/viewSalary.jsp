<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>View Salary</h1>
<form action="emp" method="post">
<input type="text" placeholder="Enter Employee Id" name="empId">
<input type="hidden" name="action" value="viewSalary">
<button>Submit</button>
</form>

</body>
</html>
