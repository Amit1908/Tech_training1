package com.techment.dob;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DateOfBirth
 */
@WebServlet("/DateOfBirth")
public class DateOfBirth extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DateOfBirth() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		String n1 = request.getParameter("n1");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate current = LocalDate.now();
		LocalDate birth = LocalDate.parse(n1, dtf);
		
		out.println("Years :"+ Period.between(birth, current).getYears());
		out.println("Months :"+ Period.between(birth, current).getMonths());
		out.println("Days :"+ Period.between(birth, current).getDays());
		
	}

}
