package com.techment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First1
 */
@WebServlet("/First1")
public class First1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   public First1()
   {
	   super();
	   System.out.println("Constructor");
   }
	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("init is called");
	}

	
	public void destroy() {
		System.out.println("destroy is called");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service is called");
		PrintWriter out = response.getWriter();
		out.println("Welcome");
		
	}

}
