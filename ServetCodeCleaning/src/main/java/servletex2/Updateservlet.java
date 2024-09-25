package servletex2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import servletex2.dao.EmpDao;

public class Updateservlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("t1");
		int age=Integer.parseInt(req.getParameter("t2"));
		
		EmpDao edao=new EmpDao();
		boolean isUpdated=edao.updateSalary(name, age);
		if(isUpdated)
		{
			req.setAttribute("msg", "SalaryUpdation successfull");
			RequestDispatcher rd=req.getRequestDispatcher("Successmsg.jsp");
			rd.forward(req,res);
		}
		else
		{
			req.setAttribute("errmsg", "SalaryUpdation unsuccessfull");
			RequestDispatcher rd=req.getRequestDispatcher("Failuremsg.jsp");
			rd.forward(req,res);
		}
		
		
		}
}
