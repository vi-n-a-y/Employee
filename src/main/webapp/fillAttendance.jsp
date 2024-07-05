<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Fill Attendance</h1>
<a href="home.jsp"><button>Home</button></a>
<form action="emp" action="post">
<table>
<tr><td><label>EmpId</label></td><td><input type="text" name="empId"></td></tr> 
<tr><td><label>first Half</label></td><td><select name="firstHalf"><option value="Present">Present</option><option value="Absent">Absent</option></select></td></tr>
<tr><td><label>Second Half</label></td><td><select name="secondHalf"><option value="Present">Present</option><option value="Absent">Absent</option></select></td></tr>
</table>
<input type="text" name="action" value="fillAttendance">
<button>Submit</button>
</form>

</body>
</html>