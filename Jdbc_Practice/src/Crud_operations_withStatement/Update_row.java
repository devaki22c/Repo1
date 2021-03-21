package Crud_operations_withStatement;
import java.sql.*;
public class Update_row 
{

	public static void main(String[] args) 
	{
		try
		{
			String qv="update student set name='vasu' where rollno=552";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
			Statement st=con.createStatement();
			int r=st.executeUpdate(qv);
			System.out.println(r+" row updated successfully");
			con.close();
			st.close();
		}
		catch(Exception e)
		{}
	}

}
