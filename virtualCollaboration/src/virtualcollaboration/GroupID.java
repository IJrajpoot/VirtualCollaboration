package virtualcollaboration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GroupID {

	public String[] getGroupID(int userID) {

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/virtual_collaboration","root","");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT groupID FROM  groupmembers WHERE UserID="+userID);
			int size=0;
			while(rs.next())
			{size++;
			}
			rs.beforeFirst();
			String[] Tasks=new String[size];
			int i=0;
			while(rs.next())
			{
			
				Tasks[i]=""+rs.getInt(1);
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
	
}
