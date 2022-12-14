package virtualcollaboration;
import java.sql.*;
import java.util.ArrayList;
public class Document {
	
	public String[] seeDocument(int GroupID) {
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM document WHERE groupID="+GroupID);
			
			int i=0,size=0;
			while(rs.next())
			{
			size++;
			}
			
			rs.beforeFirst();
			String[] Doc=new String[size];
			
			while(rs.next())
			{
			Doc[i]="Name: " + rs.getString(2) + " Category: " + rs.getString(3) + " Date: "
			+ rs.getString(4);
				
				i++;
			
			}
			con.close();
				return Doc;
			} catch(Exception e)
			{
				String[] ex= {e.getMessage()};
				return ex;
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
	
	public String delDocument(int docID) {
	
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
	
	public String[] searchDocument(String search) {
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =
		DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM document WHERE name='"+search+"' or category='"+search+"' or date='"+search+"';");

		int i=0,size=0;
		while(rs.next())
		{
		size++;
		}
		
			if(size==0) {
				String[] ex= {"No Document Found"};
				return ex;
			}
		
		rs.beforeFirst();
		String[] Doc=new String[size];
	
		while(rs.next())
		{
		Doc[i]="Name: " + rs.getString(2) + " Category: " + rs.getString(3) + " Date: "
		+ rs.getString(4);
			
			i++;
		
		}
		con.close();
			return Doc;
		
		} catch(Exception e)
		{
			String[] ex= {e.getMessage()};
			
			return ex;
		}
	}
}
