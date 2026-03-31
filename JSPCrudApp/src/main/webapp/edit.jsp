<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>
<%@ page import="java.sql.*" %>

<%
int id = Integer.parseInt(request.getParameter("id"));
String name="", email="", course="";

try {
	
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud", "root", "pallavi2015");
    PreparedStatement ps = con.prepareStatement(
        "SELECT * FROM student WHERE id=?");

    ps.setInt(1, id);
    ResultSet rs = ps.executeQuery();

    if(rs.next()) {
        name = rs.getString("name");
        email = rs.getString("email");
        course = rs.getString("course");
    }
} catch(Exception e) {
    out.println(e);
}
%>

<h2>Edit Student</h2>

<form action="update.jsp" method="post">
    <input type="hidden" name="id" value="<%= id %>">

    Name: <input type="text" name="name" value="<%= name %>"><br><br>
    Email: <input type="text" name="email" value="<%= email %>"><br><br>
    Course: <input type="text" name="course" value="<%= course %>"><br><br>

    <input type="submit" value="Update">
</form>
</body>
</html>