package com.techment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		int age= Integer.parseInt(request.getParameter("age"));
		
		if(age>=18) {
			
			RequestDispatcher rd = request.getRequestDispatcher("welcome.html");
			rd.forward(request,response);
			
		}
		else
		{
			out.println("you cannot vote");
			RequestDispatcher rd = request.getRequestDispatcher("index.html");
			rd.include(request,response);
		}
	}

}
