<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    <%@ page import="com.vin.employeeDto.SalaryDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Salary</title>
</head>
<body>
<h1>Update Salary</h1>

<form action="emp" method="get">
<input type="text" placeholder="Enter Employee Id" name="empId">
<input type="hidden" name="action" value="viewUpdateSalary">
<button>Submit</button>
</form>
<a href="home.jsp"><button>Home</button></a>

<%  
	SalaryDTO salDto=(SalaryDTO) session.getAttribute("salDto");
if(salDto!=null){%>
<form action="emp" method="post">
	<table>
			<tr>
				<td><label>Employee Id</label></td>
				<td><input type="text" name="empId" value="<%=salDto.getEmpId() %>" readOnly/></td>
			</tr>
			<tr>
				<td><label>HRA</label></td>
				<td><input type="text" name="HRA" value="<%=salDto.getHRA()%>"  /></td>
			</tr>
			<tr>
				<td><label>DA</label></td>
				<td><input type="text" name="DA"  value="<%=salDto.getDA()%>"  /></td>
			</tr>
			<tr>
				<td><label>MED</label></td>
				<td><input type="text" name="MED"  value="<%=salDto.getMED()%>"  /></td>
			</tr>
			<tr>
				<td><label>PF</label></td>
				<td><input type="text" name="PF" value="<%=salDto.getPF()%>"   /></td>
			</tr>
			<tr>
				<td><label>Basic Salary</label></td>
				<td><input type="text" name="basicSalary" value="<%=salDto.getBasicSalary()%>"  /></td>
			</tr>

		</table>
	

		<input type="hidden" name="action" value="updateSalary">
		<button>Update</button>
	</form>
<% }
request.getSession().removeAttribute("salDto");
%>
</body>
</html>
