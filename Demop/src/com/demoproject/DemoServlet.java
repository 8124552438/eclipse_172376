package com.demoproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServletpath")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet1(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	

		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String userName= request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context=request.getServletContext();
		if(userName!=""&&userName !=null)
		{
		
		context.setAttribute("savedUserName",userName);
		session.setAttribute("savedUserName",userName);
		}
		writer.println("Request parameter has username has"+userName);
		writer.println("Session parameter has username has"+(String)session.getAttribute("savedUserName"));
		writer.println("Context parameter has username has"+(String)context.getAttribute("savedUserName"));
		
		
		
		//writer.println("hello" +userName);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter writer = response.getWriter();
			String userName= request.getParameter("userName");
			String fullName= request.getParameter("fullName");
			String prof = request.getParameter("prof");
			//String location = request.getParameter("location");
			String[] location = request.getParameterValues("location");
		    writer.println("you are at" +location.length +"places" )	;
		    for(int i=0 ;i<location.length;i++)
		    {
		    	writer.println(location[i]);
		    }
		    
			
			
			//out.println("hello from post" +" " +userName +" "+fullName +" "+prof + " " +location);
			
		}



	}


