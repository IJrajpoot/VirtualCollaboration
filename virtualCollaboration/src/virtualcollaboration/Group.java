package virtualcollaboration;
import java.sql.*;
public class Group {
		public void ViewMembers(int gID) {
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("SELECT users.Name, users.Email, `group`.Name from users,`group` "
						+ "where users.GroupID=`group`.GroupID and users.GroupID="+gID+";");

				while(rs.next())
				{
				System.out.println("Member Name: " + rs.getString(1) + " Email: " + rs.getString(2) + " Group Name: "
				+ rs.getString(3));
				}
				con.close();
				} catch(Exception e)
				{
				System.out.println(e);
				}
		}
}
