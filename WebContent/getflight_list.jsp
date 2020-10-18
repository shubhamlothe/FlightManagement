<%@page import="com.dto.Flight"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.service.FlightService"%>
<%@page import="com.service.FlightServiceImple"%>
<jsp:useBean id="flight" class="com.dto.Flight" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>
 <%@ include file="header.jsp" %>
 <%@ include file="cachecontrol.jsp" %>
 <%@ include file="cachecontrol.jsp" %>
  <jsp:useBean id="admin" class="com.dto.Admin" scope="session" ></jsp:useBean>
<% 
	if(admin !=null && admin.getAdminId()>0 ){
%>
<%

	FlightService fs =new FlightServiceImple();
	ArrayList<Flight> al=fs.displayFlight();
	%>
	<table align="center" style="background-color:aqua;  font-size: 25px" >
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
					<th colspan="1" >Delete</th>
					<th colspan="1" >Update</th>
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
			<td><a href="delete.jsp?flightNo=<%=f.getFlightNo()%>">delete</a></td>
			<td><a href="update_form.jsp?flightNo=<%=f.getFlightNo()%> ">update</a></td>
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
		<tr><a href="home.jsp" >Back</a></tr>
		
		
		
<% }else{
	response.sendRedirect("login.jsp");	
	}
	%>