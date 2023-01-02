package virtualcollaboration;
import java.sql.*;
public class Group {
			
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
		
		
		
		public GroupDetail[] existingGroups() {

			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT * FROM groups");
				
				int i=0,size=0;
				rs.last();
				size=rs.getRow();
				
				rs.beforeFirst();
				GroupDetail[] Req=new GroupDetail[size];
				
				while(rs.next())
				{
					Req[i] = new GroupDetail();
					Req[i].Name=rs.getString(2);
					Req[i].Purpose=rs.getString(3);
					i++;
				
				}
				con.close();
					return Req;
				} catch(Exception e)
				{
					
					return null;
				}
		
		}

}
