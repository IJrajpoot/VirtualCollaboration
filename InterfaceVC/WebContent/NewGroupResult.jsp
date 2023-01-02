<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creating Group...</title>
</head>
<body>


<%
Groups a=new GroupsProxy().getGroups();
String Gname=request.getParameter("groupName");
String Purpose=request.getParameter("purpose");



if(Gname!="" && Purpose!="" ){
	a.createGroup(Gname, Purpose);
	response.sendRedirect("Menu.jsp");
}
else{
	response.sendRedirect("NewGroup.jsp?newGroup=1");
}
%>

</body>
</html>