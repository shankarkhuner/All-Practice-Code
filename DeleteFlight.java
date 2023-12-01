package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserDao.FlightServiceImpl;

/**
 * Servlet implementation class DeleteFlight
 */
public class DeleteFlight extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteFlight() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String flightNumber = request.getParameter("p1");
		PrintWriter out = response.getWriter();
		
		int fno = Integer.parseInt(flightNumber);
		
		out.print(flightNumber);
		
		FlightServiceImpl service = new FlightServiceImpl();
		Flight flight =service.getFlightByNumber(fno);
		
		ServletContext context = getServletContext();
		context.setAttribute("flight-details", flight);
		RequestDispatcher rd =request.getRequestDispatcher("/DeleteFlight.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
