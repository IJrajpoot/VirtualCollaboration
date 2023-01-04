<%@ page import="virtualcollaboration.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Task</title>
<link rel="stylesheet" href="Check.css" type="text/css">
</head>
<body>

<img src="logo.png" class="logo">
<div class="logo">
<label>Virtual Collaboration</label>
</div>
<label class="bottomLine">Sharing is easy here...</label>
<br><br><br><br>
	<form  action="DelTask.jsp" class="innerForm" style="background-color: LightGray; color:teal;">
	 <%
 if(request.getParameter("delTask")!=null){
	out.println("Please try again!<br>"); 
 }
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
  			 
  		  <th><input type="text" name="DelTask"></th>
		</tr>	
		</table>
		
  <button type="submit">View</button>
	</form>	
	

</body>
</html>