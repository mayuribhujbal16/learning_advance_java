package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		try 
		{
			response.setContentType("text/html");
			PrintWriter pw = response.getWriter();
			
			String n = request.getParameter("userName");
			
			pw.print("Welcome "+n);
			
	        Cookie ck = new Cookie("userName", n);
	        response.addCookie(ck);
	        
	        pw.print("<form action='SecondServlet' method='Post'>");
	        pw.print("<input type= 'Submit' value='Visit'>");
	        pw.print("</form>");
	        pw.close();
	        
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
