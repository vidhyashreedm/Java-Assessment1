package servletex2;

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

import servletex2.dao.EmpDao;
public class Selectall extends HttpServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		EmpDao edao=new EmpDao();
		List<Employee> e=edao.allRecords();
		
		if(e==null)
		{
			req.setAttribute("msg", "No record found!!!!");
			RequestDispatcher rd=req.getRequestDispatcher("Successmsg.jsp");
			rd.forward(req,res);
		}
		else
		{
			req.setAttribute("list", e);
			RequestDispatcher rd=req.getRequestDispatcher("displayall.jsp");
			rd.forward(req,res);
		}
		}
	
	}

