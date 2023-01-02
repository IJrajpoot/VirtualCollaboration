<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verifying Login...</title>
</head>
<body>
<%
Login a=new LoginProxy().getLogin();
String password=request.getParameter("password");
String email=request.getParameter("email");
boolean check=a.login(email, password);
if(email!="" && password!=""){
	if(check){
	response.sendRedirect("Home.jsp");
	}
	else{
	response.sendRedirect("Login.jsp?login=1");
	}
}
else{
	response.sendRedirect("Login.jsp?login=1");
}

%>
</body>
</html>