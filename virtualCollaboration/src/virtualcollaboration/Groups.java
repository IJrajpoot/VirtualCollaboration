package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Groups {
	
	public String createGroup(String Name,String Purpose) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			
			String query1="insert into groups(name,Purpose) values('"+Name+"','"+Purpose+"');";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Group Created Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
	public String addMembers(int GroupID,String[] users) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
		
			String string1="",string2=null;
			int printComma=users.length-1;
			for (int i=0;i<users.length;i++) {
				
				string1=string1.concat("'");
				string2=users[i];
				string1=string1.concat(string2);
				string1=string1.concat("'");
				if(i<printComma)
				string1=string1.concat(",");
				
					//to concat users and pass them to query
				
			}
			String inputQuery=string1;
			
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select count(*) from `users` where Email in ("+inputQuery+");");
			
			int val=0;
			
			while(rs.next())
			{
				val=Integer.parseInt(rs.getString(1));  
				
			}
			
			
			int UserID=0;
			String insertion;
			if(users.length==val) {	
				 
				for(int j=0;j<users.length;j++) {
					 
					ResultSet rs1=stmt.executeQuery("select UserID from `users` where Email in ('"+users[j]+"');");
					 
					
					while(rs1.next())
					{
						UserID=Integer.parseInt(rs1.getString(1));  
						
					}
					 
					stmt.executeUpdate("insert into `groupmembers` values("+GroupID+","+UserID+");");
					 
				}
				con.close();
				return "Record Added Successfully...";
			
				
			}
			
			
			else { 
				return "Failed!";
			}
				
			} catch(Exception e)
			{
				return e.getMessage();
			}
		
	}
	
	
	
	public String[] existingGroups(int UserID) {

		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT groups.GroupID,groups.Name,groups.Purpose FROM `groups` "
					+ "join groupmembers on groups.GroupID=groupmembers.GroupID WHERE UserID="+UserID);
			
			
			int count=0;
			while(rs.next())
			{
				count++;
				
			}
			
			String[] Announce=new String[count];
			int i=0;
			ResultSet rs1=stmt.executeQuery("SELECT groups.GroupID,groups.Name,groups.Purpose FROM `groups`" + 
				 "join groupmembers on groups.GroupID=groupmembers.GroupID WHERE UserID="+UserID);
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
}