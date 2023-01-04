<%@ page import="virtualcollaboration.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Announcement</title>
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
 if(request.getParameter("delAnn")!=null){
	out.println("Please try again!<br>"); 
 }
 %>
 </div >
  <h1>Provide Announcement ID to delete it.</h1>
<form action="DelAnnResult.jsp" class="myDiv">
 
   

   <label style="text-align:left;"> <b>Announcement ID: </b></label>
   <select id="AnnouncementID" name="AnnouncementID">
   <%Announcement ann=new AnnouncementProxy().getAnnouncement();%>		
		<%
		
		String id1=request.getParameter("Del");
		int del=Integer.parseInt(id1);
			
		String[] id=ann.seeAnnID(del);
		for(int i=0; i<id.length; i++){
		out.println("<option value="+id[i]+">"+id[i]+"</option>" );
		}%>
   </select>

<br>

    <button type="submit">Delete</button>

</form>



</body>
</html>