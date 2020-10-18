<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>add flight details</title>
</head>
<body>
	<form action="search.jsp" method="post" >
		<table align="center" >
			<thead>
				<tr>
					<th colspan="2" >Search Flight Details</th>
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
					
					<td><input type="submit" value="Search"  /> </td>
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