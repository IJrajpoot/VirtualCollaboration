package virtualcollaboration;
import java.sql.*;
import java.util.ArrayList;
public class Document {
	public String seeDocument(int DocID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM document WHERE DocID="+DocID);

			String Doc=null;
			
			while(rs.next())
			{
			Doc="Name: " + rs.getString(2) + " Category: " + rs.getString(3) + " Date: "
			+ rs.getString(4);
				
			
			}
			con.close();
				return Doc;
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
public String addDocument(String DocName,String DocCategory,int groupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			String query1="insert into `document`(Name,Category,GroupID) "
					+ "values('"+DocName+"', '"+DocCategory+"',"+groupID+");";
			stmt.executeUpdate(query1);
			
			con.close();
				return "Record Added Successfully...";
			} catch(Exception e)
			{
				return e.getMessage();
			}
	}
	
	public String delAnnouncementt(int docID) {
	
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
		Statement stmt=con.createStatement();
		String query1="delete FROM `document` WHERE AnnounceID="+docID+";";
		stmt.executeUpdate(query1);
		
		con.close();
			return "Record Deleted Successfully...";
		} catch(Exception e)
		{
			return e.getMessage();
		}
	}
}
