package Crud_operations_withStatement;
import java.sql.*;
public class Insert_row
{
	public static void main(String[] args) 
	{
		
			
			try
			{
				String qv="insert into student values('chaitu',553)";
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
				Statement st=con.createStatement();
				
				int r=st.executeUpdate(qv);
				System.out.println(r+" row inserted");
				con.close();
				st.close();
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}

	
		
	}
}
