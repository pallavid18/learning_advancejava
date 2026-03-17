<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP</title>
</head>
<body>
<h2>Welcome to JSP</h2>

<%
/*
String n ="Hello";
out.print(n);
out.print("Pallavi....");
out.print("Multiply : "+(2*5));
out.print("Addition : "+(2+5));
out.print("Division : "+(2/5));
out.print("Sub : "+(2-5));
*/
%>
<%! int age =24; %>
<%! int cube(int num)
{
	return num*num*num;
}
%>
<%= "Cube of 5 : "+cube(5) %>
<%= "Welcome to Java Server Page"%>
<% 
String name = request.getParameter("uname");
String pass = request.getParameter("upass");
out.print("Welcome   " +name+"   Password : "+pass +"  Age : "+age);
%>


</body>
</html>