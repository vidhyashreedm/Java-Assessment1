package servletEx;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Date;

public class Datedemo extends HttpServlet
{
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        res.setContentType("text/html");
        Date d = new Date();
        PrintWriter p = res.getWriter();
        p.write("<h3 style='color:green'>current date and time is: " + d + "</h3>");
    }
}