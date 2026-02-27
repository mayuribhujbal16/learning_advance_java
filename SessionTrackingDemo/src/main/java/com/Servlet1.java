package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
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
			PrintWriter pw = response.getWriter()
;
			String urname = request.getParameter("urName");
			String urpass = request.getParameter("urPass");
			
			if(urpass.equals("abc@16"))
			{
				RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
				rd.forward(request, response);
			}
			else
			{
				pw.print("Sorry.....Incorrect Password!!! ");
				RequestDispatcher rd = request.getRequestDispatcher("/index.html");
				rd.forward(request, response);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
