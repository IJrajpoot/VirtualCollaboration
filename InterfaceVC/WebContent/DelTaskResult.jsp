<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
Task ann=new TaskProxy().getTask();
String ID=request.getParameter("taskID");
int tID=Integer.parseInt(ID);

String sout=ann.delTask(tID);
boolean check=(sout!=null);
if(ID!=null){
	if(check){
	response.sendRedirect("Task.jsp");
	}
	else{
	response.sendRedirect("DelTask.jsp?delTask=1");
	}
}
else{
	response.sendRedirect("DelAnnouncement.jsp?delAnn=1");
}

%>


</body>
</html>