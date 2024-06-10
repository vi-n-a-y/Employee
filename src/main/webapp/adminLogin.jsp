<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
 <body>
    <form class="container" action="emp" method="get">
      <div class="container">
        <input
          type="text"
          id="name"
          autocomplete="off"
          placeholder=" "
          class="form__input"
          name="name"
        />
        <label for="name">Name</label>
      </div>

      <div class="container">
        <input
          type="password"
          id="name"
      
          placeholder=" "
          class="form__input"
          name="password"
        />
        <label for="name">password</label>
      </div>
      <div>
      <input type="hidden" name="action" value="adminLogin">
        <button class="submit_btn">Submit</button>
      </div>
    </form>
  </body>
</html>
