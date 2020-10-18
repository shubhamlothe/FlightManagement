
<%@page import="com.service.FlightService"%>
<%@page import="com.service.FlightServiceImple"%>
<jsp:useBean id="flight" class="com.dto.Flight" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>
<%@ include file="cachecontrol.jsp" %>
 <jsp:useBean id="admin" class="com.dto.Admin" scope="session" ></jsp:useBean>
<% 
	if(admin !=null){
%>
<%
	FlightService fs =new FlightServiceImple();
	int i=fs.addFlight(flight);
	if(i>0){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("addflight_form.jsp?error_msg=no record added");
	}

%>


<% }else{
	response.sendRedirect("login.jsp");	
	}
	%>