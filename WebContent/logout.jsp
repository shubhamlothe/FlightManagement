<%
	session.removeAttribute("admin");
	session.invalidate();
	response.sendRedirect("login.jsp");
%>


