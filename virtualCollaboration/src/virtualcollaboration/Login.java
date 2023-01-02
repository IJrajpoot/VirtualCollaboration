package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
	public boolean login(String email,String password) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from users where Username='"+password+"' and Email='"+email+"';");
			int count=0;
			
			while(rs.next()) {
			count++;
			}
			con.close();

			if(count>0) {return true;}
			
			else {return false;}
			
			} catch(Exception e)
			{
				return false;
			}
		
	
	}
	
	public String createUser(String name,String password,String Email) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="insert into `users`(Name,Username,Email) "
					+ "values('"+name+"','"+password+"'"+",'"+Email+"');";
			stmt.executeUpdate(query1);
			
			con.close();
				return "User created Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	
	}
public String delUser(String password,String email) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * from users where Username='"+password+"' or Email='"+email+"';");
			int count=0;
			
			while(rs.next()) {
			count++;
			}
			
			
			if(count==1) {String query1="delete FROM `users` WHERE Username='"+password+"' and Email='"+email+"';";
			stmt.executeUpdate(query1);
			con.close();
			return "Record Deleted Successfully...";}
			
			else {return "Failed to delete record";}
			
				
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
}
