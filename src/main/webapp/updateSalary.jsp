<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Salary</title>
</head>
<body>
<h1>Update Salary</h1>
<form action="emp" method="post">
		<table>
			<tr>
				<td><label>Employee Id</label></td>
				<td><input type="text" name="empId"  /></td>
			</tr>
			<tr>
				<td><label>HRA</label></td>
				<td><input type="text" name="HRA" /></td>
			</tr>
			<tr>
				<td><label>DA</label></td>
				<td><input type="text" name="DA" /></td>
			</tr>
			<tr>
				<td><label>MED</label></td>
				<td><input type="text" name="MED" /></td>
			</tr>
			<tr>
				<td><label>PF</label></td>
				<td><input type="text" name="PF" /></td>
			</tr>
			<tr>
				<td><label>Basic Salary</label></td>
				<td><input type="text" name="basicSalary" /></td>
			</tr>

		</table>
		<input type="hidden" name="action" value="updateSalary">
		<button>Update</button>
	</form>

</body>
</html>