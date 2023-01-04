<%@ page import="virtualcollaboration.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Deleting Announcement</title>
</head>
<body>

<%
Announcement a=new AnnouncementProxy().getAnnouncement();
String ID=request.getParameter("AnnouncementID");

int gID=Integer.parseInt(ID);
String sout=a.delAnnouncementt(gID);
boolean check=(sout!=null);
if(ID!=null){
	if(check){
	response.sendRedirect("Announcement.jsp");
	}
	else{
	response.sendRedirect("DelAnnouncement.jsp?delAnn=1");
	}
}
else{
	response.sendRedirect("DelAnnouncement.jsp?delAnn=1");
}

%>


</body>
</html>