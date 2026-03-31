<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete</title>
</head>
<body>
<%@ page import="java.sql.*" %>

<%
int id = Integer.parseInt(request.getParameter("id"));

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/jspcrud", "root", "pallavi2015");

    PreparedStatement ps = con.prepareStatement(
        "DELETE FROM student WHERE id=?");

    ps.setInt(1, id);
    ps.executeUpdate();

    response.sendRedirect("view.jsp");

} catch(Exception e) {
    out.println(e);
}
%>
</body>
</html>