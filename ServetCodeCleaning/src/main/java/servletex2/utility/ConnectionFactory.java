package servletex2.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static Connection c=null;
	static
	{
		try
		{
			System.out.println("trying to connect to database");
			Class.forName( "com.mysql.jdbc.Driver" );
			 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			System.out.println("connection established");
		}
		catch ( Exception ex ) 
		{
			ex.printStackTrace();
		}
	}
	public static Connection getCon()
	{
		return c;
	}
}
