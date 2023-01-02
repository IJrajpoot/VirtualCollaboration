<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Group Task</title>
</head>
<body>

<%
Task a=new TaskProxy().getTask();
String tname=request.getParameter("tName");
String tDate=request.getParameter("tDate");
String tTime=request.getParameter("tTime");
String GroupID=request.getParameter("groupID");
int i=Integer.parseInt(GroupID);

if(tname!="" && tDate!="" && tTime!=""){
	a.addTask(tname, tDate, tTime, i);
	response.sendRedirect("Tasks.jsp");
}
else{
	response.sendRedirect("AddGroupTask.jsp?AddTask=1");
}
%>

</body>
</html>