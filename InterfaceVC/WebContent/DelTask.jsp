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
<div class="first">
 <%
 if(request.getParameter("delTask")!=null){
	out.println("Please try again!<br>"); 
 }
 %>
 </div >
  <h1>Provide Task ID to delete it.</h1>
<form action="DelTaskResult.jsp" class="myDiv">
<%TaskID ann=new TaskIDProxy().getTaskID();%>
 <% 
 String id1=request.getParameter("DelTask");
	int del=Integer.parseInt(id1);
 out.println("Existing tasks of group::");
		String[] req = ann.seeTask(del);
		for(int i=0; i<req.length; i++){
		out.println("<hr><br>" + req[i]);
		}
		%>
<br><br><br>
    <label style="text-align:left;"> <b>Task ID: </b></label>
   <select id="TaskID" name="TaskID">
   		
		<%
		
		
			
		String[] id=ann.getTaskID(del);
		for(int i=0; i<id.length; i++){
		out.println("<option value="+id[i]+">"+id[i]+"</option>" );
		}%>
   </select>
<br>

    <button type="submit">Delete</button>

</form>
</body>
</html>