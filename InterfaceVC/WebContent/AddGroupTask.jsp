<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Group Task</title>
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
 if(request.getParameter("AddTask")!=null){
	out.println("Please try again!<br>"); 
 }
 %>
 </div >
  <h1>Add Group Task</h1>
<form action="GroupTaskResult.jsp" class="myDiv">
 <table class="inner">
   
<tr>
   <th> <b>Task</b></th>
    <th><input type="text" name="tName"></th>
</tr>
<tr>
   <th> <b>Date</b></th>
    <th><input type="text" name="tDate"></th>
  </tr> 
  <tr>
   <th> <b>Time</b></th>
    <th><input type="text" name="tTime"></th>
    
</tr>
 <tr>
   <th> <b>Group ID</b></th>
    <th><input type="text" name="groupID"></th>
    
</tr>
</table>
<br>

    <button type="submit">Register</button>

</form>

</body>
</html>