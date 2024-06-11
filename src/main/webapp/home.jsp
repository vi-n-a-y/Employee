<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<a href="salary.jsp" ><button class="sign">salary</button></a>

<h1>Home Page</h1>
<form action="emp" method="get">
<label>Employee Id : </label>
<input type="number" name="empId" placeholder="enter the employee details">
<input type="hidden" name ="action" value="getEmployeeDetails" >
<button>submit</button>


</form>

</body>
</html>