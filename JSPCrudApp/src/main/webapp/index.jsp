<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Student</title>
</head>
<body>
<h2>Add Student</h2>
<form action="insert.jsp" method="post">
    Name: <input type="text" name="name"><br><br>
    Email: <input type="text" name="email"><br><br>
    Course: <input type="text" name="course"><br><br>
    <input type="submit" value="Add">
</form>
<br>
<a href="view.jsp">View Students</a>
</body>
</html>