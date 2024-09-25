package servletex2;

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

import servletex2.dao.EmpDao;

public class Selectservlet extends HttpServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		
		EmpDao edao=new EmpDao();
		Employee e=edao.getByName(name);
		
		
		if(e==null)
		{
			req.setAttribute("msg", "No record found!!!!");
			RequestDispatcher rd=req.getRequestDispatcher("Successmsg.jsp");
			rd.forward(req,res);
		}
		else
		{
			req.setAttribute("emp", e);
			RequestDispatcher rd=req.getRequestDispatcher("display.jsp");
			rd.forward(req,res);
		}
	}
}
