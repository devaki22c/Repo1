package Crud_operations_withStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_row {

	public static void main(String[] args) 
	{
		try
		{
			String qv="delete from student where rollno=552";
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
			Statement st=con.createStatement();
			int r=st.executeUpdate(qv);
			System.out.println(r+" row deleted successfully");
			con.close();
			st.close();
		}
		catch(Exception e)
		{}

	}

}
