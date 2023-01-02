<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Groups</title>
<link rel="stylesheet" href="Check.css" type="text/css">
</head>
<body>
 
<div class="sidebar">
  <a class="active" href="Menu.jsp">Existing Groups</a>
  <a href="Home.jsp">Home</a>
  <a href="AddMember.jsp">Add Members</a>
  <a href="Announcement.jsp">Announcements</a>
  <a href="Tasks.jsp">Tasks</a>
  <a href="About.jsp">About</a>
</div>

<div class="content">

	<div class="innerlogo">
	<label><img src="logo.png" style="width: 5%;margin-top: 10px ">Virtual Collaboration</label>
	</div>
	<br><hr><hr><br><br>
	<div>
	<form  class="FormDiv">
	<h1>Welcome!!!</h1>
	</form>
		<form class="innerForm" style="background-color: LightGray; color:teal;">
		<%
		Groups a=new GroupsProxy().getGroups();
		%>		
		<%
		String[] req = a.existingGroups(1);
		for(int i=0; i<req.length; i++){
		out.println("<hr><br>" + req[i]);
		}
%>
		</form>	
	
	</div>
</div>
 
 </body>
</html>