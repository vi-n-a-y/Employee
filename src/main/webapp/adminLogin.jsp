<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title> Admin Login</title>
</head>


 <body>
 
 
  <%
  response.setHeader("Cache-Control","no-cache"); 	//to prevent back button after logOut it remove all cache data in application
  response.setHeader("Cache-Control","no-store");
  response.setHeader("Pragma","no-cache");
  response.setDateHeader ("Expires", 0);
  response.setDateHeader ("Expires", -1);
  %>
  
   <a href="adminRegister.jsp"><button >Register</button></a>
    <form class="container" action="emp" method="post">
      <div class="container">
        <input
          type="text"
          id="name"
          autocomplete="off"
          placeholder=" "
          class="form__input"
          name="name"
        />
        <label for="name" class="lab">Name</label>
      </div>

      <div class="container">
        <input
          type="password"
          id="name"
      
          placeholder=" "
          class="form__input"
          name="password"
        />
        <label for="name" class="lab">password</label>
      </div>
      <div>
      <input type="hidden" name="action" value="adminLogin">
        <button class="submit_btn">Submit</button>
      </div>
    
    </form>
   
   
  </body>
</html>
