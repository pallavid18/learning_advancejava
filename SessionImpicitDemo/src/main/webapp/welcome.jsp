<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome Session</title>
</head>
<body>
<%
String uname = (String)session.getAttribute("user");
out.print("User Name is  "+uname);
%>
<br>
<% 
String uname1 = (String)pageContext.getAttribute("user1" ,PageContext.SESSION_SCOPE );;
out.print("User1 Name is  "+uname1);
%>
</body>
</html>