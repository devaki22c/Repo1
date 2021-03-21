package Crud_Ope_WithPreparedStatement;

import java.sql.*;
import  java.util.*;
public class InserRow_PrepredStatement
{

	public static void main(String[] args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","devaki","devaki");
			PreparedStatement pst=con.prepareStatement("insert into emp values(?,?,?)");
			System.out.println("enter emp name");
			String name=sc.next();
			System.out.println("enter emp id");
			int id=sc.nextInt();
			System.out.println("enter emp date of joing");
			String doj=sc.next();
			pst.setString(1,name);
			pst.setInt(2,id);
			pst.setString(3,doj);
			int r=pst.executeUpdate();
			System.out.println(r+" row inserted");
			con.close();
			pst.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
