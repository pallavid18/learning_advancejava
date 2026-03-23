<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validate Page</title>
</head>
<body>

<%
    String user = request.getParameter("username");
    String pass = request.getParameter("password");
    if(user.equals("admin") && pass.equals("1234")) {
%>
<jsp:forward page="success.jsp" />
<%
    } else {
%>
<jsp:forward page="error.jsp" />
<%
    }
%>
</body>
</html>