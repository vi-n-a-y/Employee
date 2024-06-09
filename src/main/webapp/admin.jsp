<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="index.css">
</head>
<body>
	<form class ="box">
	<div class="input__wrapper">
		<input id="password" type="password" class="input__field"
		pattern="^(?=.*[A-Za-z])(?=.*\d) [A-Za-z\d]{6,}$" placeholder="your password">
		<label for="password" class="input__label"> Password</label>
		<img alt="Eye Icon" title="Eye Icon" src="C:\Users\balav\Downloads\eye.jpg" class="input_icon">
		</div>
	</form>
	<script >
	const input =document.querySelector(".input__field");
	const inputIcon=document.querySelector(".input__icon");
	
	inputIcon.addEventListener("click",(e)=>{
		e.preventDefault();
		const isPassword=input.getAttribute("type")==="password";
		inputIcon.setAttribute(
		"src",
		isPassword?"eye-off.svg":"eye.svg"
		);
		input.setAttribute(
		"type",
		isPassword?"text":"password"
		);
		
	});
	
	
	</script>

</body>
</html>



<!-- 	<form action="emp" method="get">
	<input type="text" name="name" placeholder="Enter your name">
	<input type="password" name="password" placeholder="enter your password">
	<input type="hidden" name="action" value="adminLogin">
	<input type="button" value="submit">
	
	</form> -->
