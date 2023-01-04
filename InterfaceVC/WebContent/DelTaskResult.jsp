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
Task a=new TaskProxy().getTask();
String ID=request.getParameter("TaskID");
int tID=Integer.parseInt(ID);

String sout=a.delTask(tID);

boolean check=(sout!=null);
if(ID!=null){
	if(check){
	response.sendRedirect("Tasks.jsp");
	}
	else{
	response.sendRedirect("DelTask1.jsp?delTask=1");
	}
}
else{
	response.sendRedirect("DelTask.jsp?delTask=1");
}

%>



</body>
</html>