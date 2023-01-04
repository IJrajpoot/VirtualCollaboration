<%@ page import="virtualcollaboration.*" %>
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
<form action="AddAnnResult.jsp" class="myDiv" style="background-color:LightGray; color:teal">
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
		out.println( "<br><br><br><hr>");
		%>
   
<table>
			<tr>
  			 <th> <b>GroupID: </b></th>
  		  <th><input type="text" name="ann"></th>
		</tr>	
		</table>
   <label style="text-align:left;"> <b>Announcement: </b></label>
   <textarea name="Announcement">Some text...</textarea>

<br>

    <button type="submit">Add</button>

</form>

</body>
</html>