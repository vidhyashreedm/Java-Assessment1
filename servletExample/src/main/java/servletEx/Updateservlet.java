package servletEx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Updateservlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("t1");
		int age=Integer.parseInt(req.getParameter("t2"));
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("trying to connect database to update");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		System.out.println("connection established");
		PreparedStatement ps=con.prepareStatement("update employee set age=? where name=?");
		ps.setString(2,name);
		ps.setInt(1, age);
		ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(name+ " "+age);
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		pw.write("<h3 style='color:red'>updated successfully!!!</h3>");
		pw.close();
		}
}
