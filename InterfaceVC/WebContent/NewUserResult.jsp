<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creating New User</title>
</head>
<body>
<%
Login a=new LoginProxy().getLogin();
String name=request.getParameter("name");
String password=request.getParameter("password");
String email=request.getParameter("email");
System.out.println(name);
System.out.println(password);
System.out.println(email);


if(name!="" && email!="" && password!=""){
	a.createUser(name, password, email);
	response.sendRedirect("Home.jsp");
}
else{
	response.sendRedirect("NewUser.jsp?try=1");
}
%>
</body>
</html>