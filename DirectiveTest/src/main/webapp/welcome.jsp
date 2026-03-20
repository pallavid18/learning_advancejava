<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include Directives</title>
</head>
<body>
<%@ include file="index.jsp" %>
Todays Date : <%= java.util.Calendar.getInstance().getTime() %> 

<%-- <%@ taglib uri="https://www.google.com/" prefix="mytag" %> --%>
<!-- This will not run because the jar file are not availables. -->
</body>
</html>