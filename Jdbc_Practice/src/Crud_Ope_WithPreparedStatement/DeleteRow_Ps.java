package Crud_Ope_WithPreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRow_Ps {

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
			PreparedStatement pst=con.prepareStatement("delete from student  where rollno=?");
			
			System.out.println("enter rollno which u want to delete");
			int rollno=sc.nextInt();
			pst.setInt(1, rollno);
			int r=pst.executeUpdate();
			System.out.println(r+" row deleted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
