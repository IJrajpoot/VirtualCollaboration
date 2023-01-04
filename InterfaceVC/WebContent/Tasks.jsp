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
  <a href="DelTask1.jsp">Delete Tasks</a>
 	
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
		<form action="Tasks2.jsp" class="innerForm" style="background-color: LightGray; color:teal;">
		<%
		Task t=new TaskProxy().getTask();
		%>		
		<%
		Task b=new TaskProxy().getTask();
		String email = session.getAttribute("userEmail").toString();
		String c=b.getUserID(email);
		int input=Integer.parseInt(c);
		out.println("Your Available Group's IDs:  " );
		GroupID g=new GroupIDProxy().getGroupID();
		String[] gID =g.getGroupID(input);
		for(int i=0; i<gID.length; i++){
		out.println( "<br>"+gID[i] );
		}
		
		
%>
<table>
		<tr>
  		<th> <b>GroupID: </b></th>
  		<th><input type="text" name="Group1"></th>
		</tr>	
</table>
		
  <button type="submit">View</button>
		</form>	
	
	</div>
</div>

</body>
</html>