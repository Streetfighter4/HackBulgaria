<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<% page import="java.util.List"%>
<% List eList = (List)session.getAttribute("users");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Hack<h1>
	${message}
	<h3> Users: <h3>
	<ul>
		<% for(int i=0; i<eList.size(); i++) { %>
			<li><%=eList.get(i)%></li>
		<%} %>
	</ul>
</body>
</html>