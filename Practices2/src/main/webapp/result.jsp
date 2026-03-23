<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Mark</title>
</head>
<body>
<h2>Enter Student Marks</h2>
<form action="checkResult.jsp" method="post">
    Marks: <input type="number" name="marks" required>
    <br><br>
    <input type="submit" value="Check Result">
</form>
</body>
</html>