
<%@page import="com.service.FlightService"%>
<%@page import="com.service.FlightServiceImple"%>
<jsp:useBean id="flight" class="com.dto.Flight" scope="page"></jsp:useBean>
<jsp:setProperty property="*" name="flight"/>
<%
	
	FlightService fs =new FlightServiceImple();
	int i=fs.modifyFlight(flight);
	if(i>0){
		response.sendRedirect("getflight_list.jsp");
	}else{
		response.sendRedirect("getflight_list.jsp");
	}

%>