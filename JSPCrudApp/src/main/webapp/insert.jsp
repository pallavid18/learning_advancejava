<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database</title>
</head>
<body>
<%@ page import="java.sql.*" %>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String course = request.getParameter("course");

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud", "root", "pallavi2015");

    PreparedStatement ps = con.prepareStatement("INSERT INTO student(name,email,course) VALUES(?,?,?)");

    ps.setString(1, name);
    ps.setString(2, email);
    ps.setString(3, course);

    ps.executeUpdate();

    response.sendRedirect("view.jsp");

} catch(Exception e) {
    out.println(e);
}
%>
</body>
</html>