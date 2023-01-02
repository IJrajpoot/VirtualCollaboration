<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding Announcement...</title>
</head>
<body>

<%
Announcement a=new AnnouncementProxy().getAnnouncement();
String announce=request.getParameter("Announcement");
String sout=a.addAnnouncementt(announce, 1);
boolean check=(sout!="");
if(announce!=""){
	if(check){
	response.sendRedirect("Announcement.jsp");
	}
	else{
	response.sendRedirect("AddAnnouncement.jsp?addAnn=1");
	}
}
else{
	response.sendRedirect("AddAnnouncement.jsp?addAnn=1");
}

%>

</body>
</html>