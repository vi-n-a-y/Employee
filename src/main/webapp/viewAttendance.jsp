<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
   <%@ page import="com.vin.employeeDto. AttendanceDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Attendance</title>
</head>
<body>

<h1>View Attendance</h1>
<form action="emp" method="get">
<Table>
<tr><td><label>EmpId</label></td><td><input type="text"  name="empId"></td></tr>

<tr><td><input type="hidden" name="action" value="viewAttendance"></td></tr>
</table>
<button>Submit</button>
</form>

<% AttendanceDTO attendance=( AttendanceDTO) session.getAttribute("attendance");%>
<% if(attendance!=null){%>
<form action="emp" method="get">
<Table>
<tr><td><label>EmpId</label></td><td><input type="text"  name="empId"></td></tr>
<tr><td><label>First Half</label></td><td><input type="text"  name="firstHalf"></td></tr>
<tr><td><label>Second Half</label></td><td><input type="text"  name="secondHalf"></td></tr>
<tr><td><label>Time Date</label></td><td><input type="date"  name="dateTime"></td></tr>
</table>
</form>
<%}%>

</body>
</html>
