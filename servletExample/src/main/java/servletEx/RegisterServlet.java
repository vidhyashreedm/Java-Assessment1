package servletEx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
		//read data from form
		String name = req.getParameter( "t1" );
		int age = Integer.parseInt( req.getParameter( "t2" ) );
		int salary = Integer.parseInt( req.getParameter( "t3" ) );

		try {
			System.out.println("trying to connect to database");
			Class.forName( "com.mysql.jdbc.Driver" );
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			System.out.println("connection established");
			PreparedStatement ps=c.prepareStatement("insert into employee values(?,?,?)");
			ps.setString( 1, name );
			ps.setInt( 2, age );
			ps.setInt( 3, salary );
			ps.executeUpdate();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
System.out.println(name+" "+age+" "+salary);
		res.setContentType( "text/html" );
		PrintWriter pw = res.getWriter();
		pw.write( "<h3 style='color:green'>Registration successfull</h3>" );
		pw.close();
	}
}
