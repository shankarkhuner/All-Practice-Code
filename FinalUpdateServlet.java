package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import UserDao.FlightServiceImpl;

/**
 * Servlet implementation class FinalUpdateServlet
 */
public class FinalUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FinalUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ServletContext context=getServletContext();
		Flight flight =(Flight) context.getAttribute("flight-details");
		int flightNumber=flight.getFlightNumber();
		
		String fName=request.getParameter("t1");
		String fSrc=request.getParameter("t2");
		String fDest=request.getParameter("t3");
		String fPrice=request.getParameter("t5");
		Double price=Double.parseDouble(fPrice);
		String fTime=request.getParameter("t4");
		DateTimeFormatter df=DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate flightdate=LocalDate.parse(fTime,df);
		
		Flight flightObj =new Flight();
		flightObj.setFlightName(fName);
		flightObj.setSource(fSrc);
		flightObj.setDestination(fDest);
		flightObj.setFlightPrice(price);
		flightObj.setFlyTime(flightdate);
		
		
		FlightServiceImpl service = new FlightServiceImpl();
		Flight updateFlightObj = service.updateFlight(flightNumber, flightObj);
		PrintWriter out =response.getWriter();
		if(updateFlightObj!=null) {
			response.sendRedirect("ViewFlight.jsp");
			
		}else {
			out.println("not update");
			
		}
		
		FlightServiceImpl service1=new FlightServiceImpl();
		int DeleteFlightObj=service1.removeFlight(flightNumber);
		PrintWriter out1=response.getWriter();
		if(DeleteFlightObj==flightNumber) {
			response.sendRedirect("ViewFlight.jsp");
		}else {
			out.println("not deleted");
		}
		
	}
	/*FlightServiceImpl service1=new FlightServiceImpl();
	int DeleteFlightObj=service1.removeFlight(flightNumber);
	PrintWriter out1=response.getWriter();
	if (DeleteFlightObj==flightNumber) {
	response.sendRedirect("ViewFlight.jsp");
	} else {
		out.println("not deleted");
	}
	*/

	
	
	
//**********************************

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
