package Crud_Ope_WithPreparedStatement;
import java.sql.*;
import java.util.*;
public class UpdateRow_withPS
{

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
			PreparedStatement pst=con.prepareStatement("update student set name=? where rollno=?");
			System.out.println("enter stu update name");
			String name=sc.next();
			System.out.println("enter rollno");
			int rollno=sc.nextInt();
			pst.setString(1, name);
			pst.setInt(2, rollno);
			int r=pst.executeUpdate();
			System.out.println(r+" row updated successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
