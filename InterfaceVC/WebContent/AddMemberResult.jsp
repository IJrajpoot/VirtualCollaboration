<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Members...</title>
</head>
<body>
<%
Groups a = new GroupsProxy().getGroups();
String ID=request.getParameter("gID");
String member[]=new String[1];
member[0]=request.getParameter("newEmail");
int groupID=Integer.parseInt(ID);
if(true){
	a.addMembers(groupID, member);
	response.sendRedirect("Menu.jsp");
}
else{
	response.sendRedirect("AddMember.jsp?addMem=1");
}
%>

</body>
</html>