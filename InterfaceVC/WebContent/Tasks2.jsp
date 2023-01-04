<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tasks</title>
<link rel="stylesheet" href="Check.css" type="text/css">
</head>
<body>


<div class="sidebar">
  <a href="Home.jsp">Home</a>
  <a  href="Menu.jsp">Groups</a>
  <a class="active" href="Tasks.jsp">Tasks</a>
  <a href="AddGroupTask.jsp">Add Group Task</a>
  <a href="DelTask1.jsp">Delete Task</a>
 	
</div>

<div class="content">

	<div class="innerlogo">
	<label><img src="logo.png" style="width: 5%;margin-top: 10px ">Virtual Collaboration</label>
	</div>
	<br><hr><hr><br><br>
	<div>
	<form  class="FormDiv">
	<h1>Group Tasks</h1>
	</form>
		<form class="innerForm" style="background-color: LightGray; color:teal;">
		<%
		Task t=new TaskProxy().getTask();
		%>		
		<%
		String j=request.getParameter("Group1");
		int input=Integer.parseInt(j);
		String[] req = t.seeTask(input);
		for(int i=0; i<req.length; i++){
		out.println("<hr><br>" + req[i]);
		}
%>

		</form>	
	
	</div>
</div>

</body>
</html>