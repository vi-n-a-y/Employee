<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.vin.employeeDto.EmployeeDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="emp" method="get">
<center>
<label><b>Employee ID</b></label><input type="number" name ="empId" placeholder="Enter the Employee Id here">
<input type="hidden" name ="action" value="getEmployeeDetails" >
<button>Search</button>
</center>
</form>

<%EmployeeDTO empl=(EmployeeDTO) session.getAttribute("empl"); 
if(empl!=null){%>
<form action="emp" method="post">

<table>
   	  <tr><td><label>Employee Id</label></td><td><input name="empId" value="<%=empl.getEmpId() %>" ></td></tr>
     <tr><td><label>Employee Name</label></td><td><input name="name" value="<%=empl.getName() %>"></td></tr>
     <tr><td><label>Employee Mail</label></td><td><input name="mail" value="<%=empl.getMail() %>" ></td></tr>
      <h2>something</h2>
     <tr><td><label>Employee Age</label></td><td><input name="age" value="<%=empl.getAge() %>" ></td></tr>
     <tr><td><label>Employee Gender</label></td><td><input name="gender" value="<%=empl.getGender() %>" ></td></tr>
     <tr><td><label>Employee Job Role</label></td><td><input name="jobRole" value="<%=empl.getJobRole() %>" ></td></tr>
     <tr><td><label>Employee Phone</label></td><td><input name="salary" value="<%=empl.getPhone() %>" ></td></tr>
    
     </table>
     <input type="hidden" name="action" value="updateEmployee">
     
     <button>Update</button><br>
    

</form> 

 <a href="employeeDetails.jsp"><button>Cancel</button></a>
     <%} 
request.getSession().removeAttribute("empl");
     %>     


</body>
</html>