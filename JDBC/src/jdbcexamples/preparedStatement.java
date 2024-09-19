package jdbcexamples;

import java.sql.*;
import java.util.*;

public class preparedStatement {

	public static void main(String[] args) throws Exception {
	//	Class.forName("com.mysql.jdbc.Driver");//registration
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		
		
		PreparedStatement ps=c.prepareStatement("select * from employee where name=? and age=?");
	
		/*
		//set parameters manually
		ps.setString(1,"ravi");
		ps.setInt(2,20);
		*/
		
		// set parameters from user
		
		System.out.println("For select: enter name and age");
		Scanner sc=new Scanner(System.in);
		String nam=sc.nextLine();
		int ag=sc.nextInt();
		sc.nextLine(); // Consume the leftover newline
		
		ps.setString(1, nam);
		ps.setInt(2, ag);
		System.out.println("Name Age salary");
		System.out.println("---------------");
		
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString("name")+ " "+rs.getInt("age")+ " "+rs.getInt("salary"));
			
		}
		
		System.out.println("---------------------------------------------------------------");
		
		PreparedStatement ps1=c.prepareStatement("insert into employee values(?,?,?)");
		System.out.println("For insert:enter the values for name,age,salary ");
		String name=sc.nextLine(); //input for name
		
		int age=sc.nextInt();
		sc.nextLine();  //// Consume the leftover newline
		int sal=sc.nextInt();
		sc.nextLine();  //// Consume the leftover newline
		ps1.setString(1, name);
		ps1.setInt(2, age);
		ps1.setInt(3, sal);
		
		int res=ps1.executeUpdate();
		System.out.println(res+ " record inserted");
		System.out.println("after inserting,table contains: ");
		display(c);
		
		
		System.out.println("----------------------------------------------------------");
		
		PreparedStatement ps2=c.prepareStatement("delete  from employee where name=?");
		System.out.println("For delete:enter name ");
		String na=sc.nextLine();
		
		
		ps2.setString(1, na);
		
		
		int res1=ps2.executeUpdate();
		
		if(res1>0)
		{
			System.out.println(res1+ " record deleted");
		}
		else
			System.out.println("No record found with the name "+na);
		System.out.println("after deleting,table records are: ");
		display(c);
		
		System.out.println("---------------------------------------------------------------");
		
		PreparedStatement ps3=c.prepareStatement("update employee set name=? where age=?");
		System.out.println("For update:enter name and age ");
		String names=sc.nextLine(); //input for name
		int ages=sc.nextInt();
		sc.nextLine();  // Consume the leftover newline
		
		ps3.setString(1, names);
		ps3.setInt(2, ages);
		
		
		
		int res2=ps3.executeUpdate();
		
		if(res2>0)
		{
			System.out.println(res1+ " record updated");
		}
		else
			System.out.println("No record updated");
		System.out.println("after updating,table records are: ");
		display(c);
		
	}
	
	private static void display(Connection c) throws SQLException {
		PreparedStatement ps=c.prepareStatement("select * from employee");
		ResultSet rs=ps.executeQuery();
		System.out.println("Name Age salary");
		System.out.println("---------------");
		while(rs.next())
		{
			System.out.println(rs.getString("name")+ " "+rs.getInt("age")+ " "+rs.getInt("salary"));
			
		}
		
	}
}
