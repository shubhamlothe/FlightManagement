<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="header.jsp" %>
     <%@ include file="cachecontrol.jsp" %>
      <jsp:useBean id="admin" class="com.dto.Admin" scope="session" ></jsp:useBean>
<% 
	if(admin !=null && admin.getAdminId()>0){
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add flight details</title>
</head>
<body>
	<form action="addflight.jsp" method="post" >
		<table align="center"  >
			<thead>
				<tr>
					<th colspan="2" >Add Flight Details</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>Source:</td>
					<td><input type="text" name="source"  /> </td>
				</tr>
				<tr>
					<td>Destination:</td>
					<td><input type="text" name="destination"  /> </td>
				</tr>
				<tr>
					<td>Arrival Date:</td>
					<td><input type="text" name="arrDate"  /> </td>
				</tr>
				<tr>
					<td>Arrival Time:</td>
					<td><input type="text" name="bookTime"  /> </td>
				</tr>
				<tr>
					<td>Total Seat:</td>
					<td><input type="text" name="totSeat"  /> </td>
				</tr>
				<tr>
					<td>Booked Seat:</td>
					<td><input type="text" name="bookSeat"  /> </td>
				</tr>
				<tr>
					<td>Fare Amount:</td>
					<td><input type="text" name="amount"  /> </td>
				</tr>
				<tr>
					<td><a href="home.jsp" >Back</a> </td>
					<td><input type="submit" value="Add"  /> </td>
				</tr>
				<tr>
					<% 
					String m = request.getParameter("msg");
					
					String msg = "";
					if(m!=null && Integer.parseInt(m)>0){
						msg = "success";
					}
					%>
					<td colspan="2" ><%=msg%></td>
					
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>


<% }else{
	response.sendRedirect("login.jsp");	
	}
	%>