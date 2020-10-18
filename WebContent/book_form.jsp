<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Booking Details</title>
</head>
<body>
	<form action="book.jsp" method="post" style="font-family: cursive;" >
		<table align="center" >
			<thead>
				<tr>
					<th colspan="2" >Add Booking Details</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Flight Number:</td>
					<td><input type="text" name="flightNo" value=<%=request.getParameter("flightNo") %>  /> </td>
				</tr>
				<tr>
					<td>Customer Name:</td>
					<td><input type="text" name="custName"  /> </td>
				</tr>
				<tr>
					<td>Customer Number:</td>
					<td><input type="text" name="custNo"  /> </td>
				</tr>
				<tr>
					<td>Number Of Seats:</td>
					<td><input type="text" name="bookSeat"  /> </td>
				</tr>
				
				<tr>
					<td><a href="search_form.jsp" >Back</a> </td>
					<td><input type="submit" value="Book"  /> </td>
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
			</tbody>
		</table>
	</form>
</body>
</html>