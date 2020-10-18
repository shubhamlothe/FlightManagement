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
<title>Login Page</title>



</head>
<body style="background-image: url('img1.jpg');  background-repeat: no-repeat;background-attachment: fixed;background-size: cover; font-family: cursive;">
<div ><h3 style="text-align: left;">Welcome Admin!!!</h3>
<br>
<tr>
					<td><a href="addflight_form.jsp" style="text-decoration: none; color:black;">Add Flight</a></td>
</tr><br>
<tr>
					<td><a href="getflight_list.jsp" style="text-decoration: none;color:black;">Get Flights List</a></td>				
				</tr>
</div>
	
</body>
</html>

<% }else{
	response.sendRedirect("login.jsp");	
	}
	%>
