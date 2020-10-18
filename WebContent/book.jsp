<%@page import="com.dao.BookingdaoImple"%>
<%@page import="com.dto.Booking"%>
<%@page import="com.service.BookingServiceImple"%>
<%@page import="com.service.BookingService"%>
<%@page import="com.dto.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.FlightService"%>
<%@page import="com.service.FlightServiceImple"%>


<jsp:useBean id="booking" class="com.dto.Booking" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="booking"/>

<% 
	int flightNo=Integer.parseInt(request.getParameter("flightNo"));
	
FlightService fs =new FlightServiceImple();
Flight flight =fs.getFlight(flightNo);

BookingService bs= new BookingServiceImple();
	
	int newseat=booking.getBookSeat();
	int bookedseat=flight.getBookSeat();
	int finalseat=bookedseat+newseat;
	if(bookedseat>flight.getTotSeat() || finalseat>flight.getTotSeat())
	{
		response.sendRedirect("wrong.jsp");
		
		
		
	}
	else{
		int i=bs.addBooking(booking);
		int j=fs.Reserveflight(flightNo, finalseat);
		response.sendRedirect("done.jsp");
		
	}
	

%>
	
		
			
