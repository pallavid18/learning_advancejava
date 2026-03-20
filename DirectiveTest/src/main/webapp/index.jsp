<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" errorPage="error.jsp" session = "true"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pages Directives</title>
</head>
<body>
<%-- <%@  page import="java.util.Date" %>   extends --%>
Todays Date is : <%= new Date()%>
<br>
</body>
</html>