<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.vin.employeeDto.SalaryDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View Salary</h1>
	<form action="emp" method="get">
		<input type="text" placeholder="Enter Employee Id" name="empId">
		<input type="hidden" name="action" value="viewSalary">
		<button>Submit</button>
	</form>

	<%
	SalaryDTO salDto = (SalaryDTO) session.getAttribute("salDto");
	if (salDto != null) {
	%>

	<table>
		<tr>
			<td><label>Employee Id</label></td>
			<td><input type="text" name="empId"
				value="<%=salDto.getEmpId()%>" readOnly /></td>
		</tr>
		<tr>
			<td><label>HRA</label></td>
			<td><input type="text" name="HRA" value="<%=salDto.getHRA()%>"
				readOnly /></td>
		</tr>
		<tr>
			<td><label>DA</label></td>
			<td><input type="text" name="DA" value="<%=salDto.getDA()%>"
				readOnly /></td>
		</tr>
		<tr>
			<td><label>MED</label></td>
			<td><input type="text" name="MED" value="<%=salDto.getMED()%>"
				readOnly /></td>
		</tr>
		<tr>
			<td><label>PF</label></td>
			<td><input type="text" name="PF" value="<%=salDto.getPF()%>"
				readOnly /></td>
		</tr>
		<tr>
			<td><label>Basic Salary</label></td>
			<td><input type="text" name="basicSalary"
				value="<%=salDto.getBasicSalary()%>" readOnly /></td>
		</tr>

	</table>

	<%
	}
	request.getSession().removeAttribute("salDto");
	%>

</body>
</html>
