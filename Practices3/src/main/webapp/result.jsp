<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<%
    String m = request.getParameter("marks");
    int marks = Integer.parseInt(m); 
    if (marks >= 50) {
%>
        <jsp:forward page="pass.jsp" />
<%
    } else {
%>
        <jsp:forward page="fail.jsp" />
<%
    }
%>
</body>
</html>