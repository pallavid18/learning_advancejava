<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UseBean</title>
</head>
<body>
<jsp:useBean id="obj" class="test.Calculator"/><br>
<jsp:useBean id="obj1" class="test.Square"/>
<%
int a=obj.cube(20);
out.println("The cube of 20 is : "+a);
%>
<br>
<%
int b=obj1.squareNo(29);
out.println("The Square of 29 is : "+b);
%>
</body>
</html>