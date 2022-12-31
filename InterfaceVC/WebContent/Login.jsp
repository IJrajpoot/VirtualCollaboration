
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="Check.css" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Virtual Collaboration</title>

</head>
<body>
<img src="logo.png" class="logo">
<div class="logo">
<label>Virtual Collaboration</label>
</div>
<label class="bottomLine">Sharing is easy here...</label>
<div class="first">
 <%
 if(request.getParameter("login")!=null){
	out.println("Please try again!<br>"); 
 }
 %>
 </div >
  <h1>LOGIN</h1>
<form action="LoginResult.jsp" class="myDiv">
 <table class="inner">
   
<tr>
   <th> <b>Email</b></th>
    <th><input type="text" name="email"></th>
</tr>
<tr>
   <th> <b>Password</b></th>
    <th><input type="password" name="password"></th>
  <tr> 
</table>
<br>
<a href="NewUser.jsp" id="newUser">Are you a new User?</a>
    <button type="submit">Login</button>

</form>
</body>
</html>