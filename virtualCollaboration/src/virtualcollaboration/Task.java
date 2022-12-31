package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Task {
	
	public String[] seeTask(int groupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from tasks where GroupID="+groupID);
			int size=0;
			while(rs.next())
			{size++;
			}
			rs.beforeFirst();
			String[] Tasks=new String[size];
			int i=0;
			while(rs.next())
			{
			
				Tasks[i]="Task: " + rs.getString(2) + "Time: " + rs.getString(3) + " Status: "
			+ rs.getString(5)+ "Type: " + rs.getString(6);
				i++;
			}
			con.close();
			return Tasks;
			
			} catch(Exception e)
			{
				String[] ex= {e.getMessage()};
				return ex;
			}
		
	}
	
	public String addTask(String task,String date,String time,int GroupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="INSERT INTO `tasks` ( `Name`, `Date`, `Time`,GroupID) VALUES "
					+ "('"+task+"', '"+date+"', '"+time+"',"+GroupID+");";
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
	
	
	public String addSpTask(String task,String date,String time,String Email) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT UserID from users where users.Email="+Email);
			rs.next();
			int Required=rs.getInt(1);
			String query1="INSERT INTO `assignedtasks` ( `Name`, `Date`, `Time`,UserID) VALUES "
					+ "('"+task+"', '"+date+"', '"+time+"',"+Required+");";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Command Sent to User";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
	public String userApproval(int UserID) {
		

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from assignedtasks where Status='Pending' and UserID="+UserID);
			boolean row=rs.next();
			String Required="Name: "+rs.getString(2)+"   Description: "+rs.getString(3)+"   Date: "
			+rs.getString(4)+"   Time:"+rs.getString(5);
			
			con.close();
			if(row) {
				return Required;
			}
			else {
				return "No More Taks";
			}
			
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
}
