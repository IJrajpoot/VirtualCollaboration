package virtualcollaboration;
import java.*;
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
			ResultSet rs=stmt.executeQuery("SELECT UserID from users where users.Email='"+Email+"'");
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
	
	public String[] userApproval(int UserID) {
		

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from assignedtasks where Status='Pending' and UserID="+UserID);
			int size=0;
			while(rs.next()) {
				size++;
				}
			rs.beforeFirst();
			String[] Required=new String[size];
			int i=0;
			while(rs.next()) {
			Required[i]="TaskID: "+rs.getInt(1)+"   Name: "+rs.getString(2)+"   Description: "+rs.getString(3)+"   Date: "
			+rs.getString(4)+"   Time:"+rs.getString(5);
			i++;
			}
			con.close();
			
				return Required;
			
			
			} catch(Exception e)
			{
				return null;
			}
	}
	public String getUserID(String email) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT UserID from `users` where Email='"+email+"';");
			String taskID=null;
			int count=0;
			rs.next();
			
				taskID=""+rs.getInt(1) ;
				con.close();
				return taskID;
		
			
			} catch(Exception e)
			{
				
				return "Exception";
			}
		


	}

	public String[] getTaskID(int groupID) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT TaskID FROM `tasks` WHERE GroupID="+groupID);
			
			
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
public String rejectTask(int taskID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="delete FROM `assignedtasks` WHERE AssignedTaskID="+taskID+";";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Record Deleted Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}

}
