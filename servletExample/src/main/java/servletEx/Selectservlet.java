package servletEx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Selectservlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		try
		{
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			PreparedStatement ps=con.prepareCall("select * from employee where name=?");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			
				if(rs.next())
				{
				String nam=rs.getString("name");
				int age=rs.getInt("age");
				int sal=rs.getInt("salary");
				System.out.println(nam+ " "+age+" "+sal);	
				pw.write("<h2 style='color:green'>selected successfully!!!</h2>");
				//pw.write(nam+ " "+age+" "+sal);
				Employee e = new Employee( name,age, sal );
				req.setAttribute( "emp", e );
				//call display.jsp
				RequestDispatcher rd = req.getRequestDispatcher( "display.jsp" );
				rd.forward( req, res );
				}
			else
			{
				pw.write("No record found!!!");
			}
			pw.close();
			con.close();			
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}
	}
}
