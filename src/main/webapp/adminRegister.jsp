<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Register</title>
<!-- <link rel="stylesheet" href="style.css"> -->
</head>
<body>
	<a href="home.jsp"><button>Home</button></a>



	<form action="emp" method="post">
		<table>
			<tr>
				<td><label>UserName</label></td>
				<td><input type="text" name="name1"
					placeholder="Enter your name"></td>
			</tr>
			<tr>
				<td><label>Password</label></td>
				<td><input type="password" name="password"
					placeholder="enter your password"></td>
			</tr>
			<tr>
				<td><label>Mail</label></td>
				<td><input type="text" name="mail"
					placeholder="enter your mail"></td>
			</tr>
			<tr>
				<td><input type="hidden" name="action" value="adminRegister"></td>
			</tr>
			<tr>
				<td><button>submit</button></td>
			</tr>
		</table>

	</form>
	<a href="adminLogin.jsp"><button>Login</button></a>

</body>
</html>
