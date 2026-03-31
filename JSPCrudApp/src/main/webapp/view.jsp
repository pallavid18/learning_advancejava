<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>
</head>
<body>
<%@ page import="java.sql.*" %>
<h2>Student List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Course</th>
    <th>Action</th>
</tr>

<%
try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud", "root", "pallavi2015");

    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("SELECT * FROM student");

    while(rs.next()) {
%>
<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("email") %></td>
    <td><%= rs.getString("course") %></td>
    <td>
        <a href="edit.jsp?id=<%= rs.getInt("id") %>">Edit</a> |
        <a href="delete.jsp?id=<%= rs.getInt("id") %>">Delete</a>
    </td>
</tr>
<%
    }
} catch(Exception e) {
    out.println(e);
}
%>

</table>

<br>
<a href="index.jsp">Add New Student</a>
</body>
</html>