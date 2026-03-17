<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Config</title>
</head>
<body>
<%
out.print("Welcome  "+request.getParameter("uname"));
String d = config.getInitParameter("admin");
out.print("   File is   "+d);
%>
<br>
<%
String cname = application.getInitParameter("conpara");
out.print("   Project Info is :    "+cname);
%>
</body>
</html>