package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ParameterServlet")
public class ParameterServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ParameterServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("userName");
		
		pw.print("<html><body>");
		pw.println("<h2>Using doGet</h2>");
		pw.print("<h2>Welcome "+name+"</h2>");
		pw.print("</body></html>");
		
    
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		//doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("userName");
		String pass = request.getParameter("urPassword");
		
		pw.print("<html><body>");
		pw.println("<h2>Using doPost</h2>");
		pw.print("<h2>Welcome "+name+"</h2>");
		pw.print("<h4>Your Password is:  "+pass+"</h4>");
		pw.print("</body></html>");
		
	}

}
