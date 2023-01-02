package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Announcement {
	
	
	public String[] seeAnnouncements(int groupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from announcement where GroupID="+groupID);
			
			
			int count=0;
			while(rs.next())
			{
				count++;
				
			}
			
			String[] Announce=new String[count];
			int i=0;
			ResultSet rs1=stmt.executeQuery("SELECT * from announcement where GroupID="+groupID);
			while(rs1.next())
			{
			
				Announce[i]="   ID: " + rs1.getInt(1) + ";            	     " + rs1.getString(2) + "			" + rs1.getString(3);
				
				i++;
				
			}
			con.close();
			return Announce;
			
			} catch(Exception e)
			{
				String[] ex=new String[1];
				ex[0]=e.getMessage();
				return ex;
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
	
	public String[] seeAnnID(int groupID) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from announcement where GroupID="+groupID);
			
			
			int count=0;
			while(rs.next())
			{
				count++;
				
			}
			
			String[] Announce=new String[count];
			int i=0;
			ResultSet rs1=stmt.executeQuery("SELECT * from announcement where GroupID="+groupID);
			while(rs1.next())
			{
			
				Announce[i]=""+rs1.getInt(1) ;
				
				i++;
				
			}
			con.close();
			return Announce;
			
			} catch(Exception e)
			{
				
				return null;
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
