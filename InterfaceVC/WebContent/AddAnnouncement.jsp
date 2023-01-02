<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Announcement</title>
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
 if(request.getParameter("addAnn")!=null){
	out.println("Please try again!<br>"); 
 }
 %>
 </div >
  <h1>Add Announcement</h1>
<form action="AddAnnResult.jsp" class="myDiv">
 
   

   <label style="text-align:left;"> <b>Announcement: </b></label>
   <textarea name="Announcement">Some text...</textarea>

<br>

    <button type="submit">Add</button>

</form>

</body>
</html>