package servletex2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletex2.dao.EmpDao;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void service( HttpServletRequest req, HttpServletResponse res ) throws ServletException, IOException {
		//read data from form
		String name = req.getParameter( "t1" );
		int age = Integer.parseInt( req.getParameter( "t2" ) );
		int salary = Integer.parseInt( req.getParameter( "t3" ) );
		
        Employee e=new Employee(name,age,salary);
		EmpDao edao=new EmpDao();
		boolean isAdded=edao.register(e);
	
		if(isAdded)
		{
			req.setAttribute("msg", "Registration successfull");
			RequestDispatcher rd=req.getRequestDispatcher("Successmsg.jsp");
			rd.forward(req,res);
		}
		else
		{
			req.setAttribute("errmsg", "Registration unsuccessfull");
			RequestDispatcher rd=req.getRequestDispatcher("Failuremsg.jsp");
			rd.forward(req,res);
		}
		
	}
}
