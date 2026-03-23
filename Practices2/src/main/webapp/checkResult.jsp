<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Result</title>
</head>
<body>
<%
    String m = request.getParameter("marks");
    int marks = 0;
    try {
        marks = Integer.parseInt(m);
        if (marks >= 50) {
%>
<jsp:forward page="pass.jsp" />
<%
        } else {
%>
<jsp:forward page="fail.jsp" />
<%
        }
    } catch (Exception e) {
    	out.print(e);
    }
%>

</body>
</html>