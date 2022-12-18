package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task {
	
	public String seeTask(int taskID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from tasks where TaskID="+taskID);
			String Required=null;
			//ArrayList<String> Announcements = new ArrayList<String>();
			while(rs.next())
			{
			
				Required="Task: " + rs.getString(2) + "Time: " + rs.getString(3) + " Status: "
			+ rs.getString(5)+ "Type: " + rs.getString(6);
			}
			con.close();
			return Required;
			
			} catch(Exception e)
			{
				
				return e.getMessage();
			}
		
	}
	
	public String addTask(String task,String date,String time) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="INSERT INTO `tasks` ( `Name`, `Date`, `Time`) VALUES "
					+ "('"+task+"', '"+date+"', '"+time+"');";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Record Added Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
	public String delTask(int taskID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="delete FROM `tasks` WHERE TaskID="+taskID+";";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Record Deleted Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	


}
