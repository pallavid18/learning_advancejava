<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ include file="index.html" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Include Page</title>
</head>
<body>
<h1>This is include page</h1>
<jsp:include page="printdata.jsp">
<jsp:param name="uname" value="Radha"/>
</jsp:include>
<h2>End of My Pages</h2>
</body>
</html>