package Crud_operations_withStatement;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class Create_table
{

	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
			Statement st=con.createStatement();
			String qv="create table emp(name varchar(20) not null,per float not null,rollno number(10) primary key)";
			st.executeUpdate(qv);
			System.out.println("table created");
			con.close();
			st.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
