package VirtualCollaboration;

import java.sql.*;

public class Announcement {
	
public void seeAnnouncements(int groupID) {
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * from announcement");

		while(rs.next())
		{
		System.out.println("Announcement: " + rs.getString(2) + "Announcement Time: " + rs.getString(3) + " GroupID: "
		+ rs.getString(4));
		}
		con.close();
		
		} catch(Exception e)
		{
		System.out.println(e);
		}
}
}
