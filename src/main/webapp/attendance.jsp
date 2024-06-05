<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<label>first half </label>
<input type="text" name="first-half" placeholder="Enter the Employee first-half attendance">
<label>Second half </label>
<input type="text" name="second-half" placeholder="Enter the Employee second-half attendance">
<input type="datetime-local" name="emp_dateTime">
<input type="hidden" name="action" value="attendance">
<input type="button" value="submit">

</form>

</body>
</html>