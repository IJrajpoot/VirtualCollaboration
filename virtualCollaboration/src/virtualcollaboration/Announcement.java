package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Announcement {
	public String seeAnnouncements(int groupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from announcement where GroupID="+groupID);
			String Announce=null;
			//ArrayList<String> Announcements = new ArrayList<String>();
			while(rs.next())
			{
			
				Announce="Announcement: " + rs.getString(2) + "Announcement Time: " + rs.getString(3) + " GroupID: "
			+ rs.getString(4);
			}
			con.close();
			return Announce;
			
			} catch(Exception e)
			{
				
				return e.getMessage();
			}
		
	}
	
	public String addAnnouncementt(String Announcement,int groupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="insert into `announcement`(Description,GroupID) "
					+ "values('"+Announcement+"',"+groupID+");";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Record Added Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
	public String delAnnouncementt(int announceID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="delete FROM `announcement` WHERE AnnounceID="+announceID+";";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Record Deleted Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	

}
