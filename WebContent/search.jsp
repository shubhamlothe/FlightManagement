<%@page import="com.service.BookingServiceImple"%>
<%@page import="com.service.BookingService"%>
<%@page import="com.dto.Flight"%>
<%@page import="java.util.ArrayList"%>

<jsp:useBean id="flight" class="com.dto.Flight" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>
<%
	String source = request.getParameter("source");
	String destination = request.getParameter("destination");
	String arrDate = request.getParameter("arrDate");
	BookingService bs= new BookingServiceImple();
	ArrayList<Flight> al=bs.findFlights(source, destination, arrDate);
	%>
	
	<h1 style="text-align: center;" >Flight Management System</h1>
	<table align="center" style="background-color:aqua;  font-size: 25px; font-family: cursive; border-radius:20px; " >
			<thead>
				<tr>
					<th colspan="1" >FlightNo</th>
					<th colspan="1" >Source</th>
					<th colspan="1" >Destination</th>
					<th colspan="1" >Arrival Date</th>
					<th colspan="1" >Arrival Time</th>
					<th colspan="1" >Total Seat</th>
					<th colspan="1" >Booked Seat</th>
					<th colspan="1" >Fare</th>
					<th colspan="1" >Book</th>
					
				</tr>
			</thead>	<tbody><% 
	for(Flight f:al){
		%>
		
		
		<tr>
			<td><%=f.getFlightNo()%></td>
			<td><%=f.getSource() %></td>
			<td><%=f.getDestination()%></td>
			<td><%=f.getArrDate()%></td>
			<td><%=f.getBookTime()%></td>
			<td><%=f.getTotSeat()%></td>
			<td><%=f.getBookSeat()%></td>
			<td><%=f.getAmount()%></td>
			<td><a href="book_form.jsp?flightNo=<%=f.getFlightNo()%>">Book</a></td>
			
		</tr>
		<tr>
					<% 
					String m = request.getParameter("msg");
					
					String msg = "";
					if(m!=null && Integer.parseInt(m)>0){
						msg = "";
					}
					%>
					<td colspan="2" ><%=msg%></td>
					
				</tr>
				
		<%
		}
		
	
%>    	
</tbody>
		</table>
		<tr><a href="search_form.jsp">Back</a></tr>