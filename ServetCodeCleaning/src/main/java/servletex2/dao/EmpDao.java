package servletex2.dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import servletex2.Employee;
import servletex2.utility.ConnectionFactory;

public class EmpDao {
	
public boolean register(Employee e)
{
	try {
		Connection c=ConnectionFactory.getCon();
		PreparedStatement ps=c.prepareStatement("insert into employee values(?,?,?)");
		ps.setString( 1, e.getName() );
		ps.setInt( 2, e.getAge() );
		ps.setInt( 3, e.getSalary() );
		int res=ps.executeUpdate();
		if(res==1)
			return true;
			
	   } 
	catch(Exception ex)
	{
		ex.printStackTrace();
	}
	return false;
}
public boolean updateSalary(String name,int age)
{
	try
	{
		Connection con=ConnectionFactory.getCon();
	PreparedStatement ps=con.prepareStatement("update employee set age=? where name=?");
	ps.setString(2,name);
	ps.setInt(1, age);
	int res=ps.executeUpdate();
	if(res==1)
	{
		return true;
	}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
}
public Employee getByName(String name)
{
	try
	{
		Connection con=ConnectionFactory.getCon();
		PreparedStatement ps=con.prepareCall("select * from employee where name=?");
		ps.setString(1, name);
		ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			String nam=rs.getString("name");
			int age=rs.getInt("age");
			int sal=rs.getInt("salary");
			Employee e=new Employee(nam,age,sal);	
			return e;
			}
		else
		{
			//for no records
			return null;
		}
					
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return null;
}

public List<Employee> allRecords()
{
	try {
		Connection con=ConnectionFactory.getCon();
		PreparedStatement ps = con.prepareStatement( "select * from employee" );
		ResultSet rs = ps.executeQuery();
		
		List<Employee> list = new ArrayList<>();
		while ( rs.next() ) 
		{
			int age = rs.getInt( "age" );
			String name = rs.getString( "name" );
			int salary = rs.getInt( "salary" );
			Employee e = new Employee( name, age, salary );
			list.add( e );
		}
		return list;
	} 
	catch ( Exception e )
	{
		e.printStackTrace();
	}
	return null;
	
}
}
