package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TaskID {
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
			
				Tasks[i]="ID: " + rs.getInt(1) +"Task: " + rs.getString(2) + "Time: " + rs.getString(3) + " Status: "
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
			ResultSet rs1=stmt.executeQuery("SELECT TaskID from tasks where GroupID="+groupID);
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

}
