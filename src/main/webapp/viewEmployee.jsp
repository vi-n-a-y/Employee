<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 	<%@ page import="com.vin.employeeDto.EmployeeDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="emp" method="get">
<center>
<label>Employee ID</label><input type="number" name ="empId" placeholder="Enter the Employee Id here">
<input type="hidden" name ="action" value="getEmployeeDetails" >
<button>Search</button>
</center>
</form>



<%EmployeeDTO empl=(EmployeeDTO) session.getAttribute("empl"); %>
<%if(empl!=null){ %>
   <table>
     <tr><td><label>Employee Name</label></td><td><input value="<%=empl.getName() %>"></td></tr>
     <tr><td><label>Employee Mail</label></td><td><input value="<%=empl.getMail() %>"></td></tr>
     </table> 
     <%} %>     



</body>
</html>