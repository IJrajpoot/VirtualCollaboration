<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Group</title>
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
 if(request.getParameter("newGroup")!=null){
	out.println("Please try again!<br>"); 
 }
 %>
 </div >
  <h1>Create New Group</h1>
<form action="NewGroupResult.jsp" class="myDiv" style="background-color:LightGray;">
 <table class="inner">
   
<tr>
   <th> <b>Name</b></th>
    <th><input type="text" name="groupName"></th>
</tr>
<tr>
   <th> <b>Purpose</b></th>
    <th><input type="text" name="purpose"></th>
  <tr> 
</table>
<br>

    <button type="submit">Create</button>

</form>
</body>
</html>