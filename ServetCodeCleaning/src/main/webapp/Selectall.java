package servletEx;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Selectall extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
			try {
				Class.forName( "com.mysql.jdbc.Driver" );

				Connection con = DriverManager
						.getConnection( "jdbc:mysql://localhost:3306/mydb", "root", "root" );

				PreparedStatement ps = con.prepareStatement( "select * from employee" );
				ResultSet rs = ps.executeQuery();
				System.out.println("employee details:");
				List<Employee> list = new ArrayList<>();
				while ( rs.next() ) {
					int age = rs.getInt( "age" );
					String name = rs.getString( "name" );
					int salary = rs.getInt( "salary" );
					Employee e = new Employee( name, age, salary );
					list.add( e );
				}
				req.setAttribute( "emplist", list );
				RequestDispatcher rd = req.getRequestDispatcher( "displayall.jsp" );
				rd.forward( req, res );
			} catch ( Exception e ) {
				e.printStackTrace();
			}
		}
	
	}

