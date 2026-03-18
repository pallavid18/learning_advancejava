<%@page import="jakarta.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session</title>
</head>
<body>
<%
out.println("Welcome, your fact is "+request.getParameter("factline"));
String data ="Fareen Khan";
session.setAttribute("user", data);
pageContext.setAttribute("user1","Sarika" ,PageContext.SESSION_SCOPE );

%>
<a href="welcome.jsp">Welcome to fun fact</a>
</body>
</html>