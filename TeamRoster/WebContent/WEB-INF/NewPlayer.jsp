<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
         <%@ page import="com.codingdojo.models.*" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New Player</title>
	</head>
	<body>
		<h1>Create a New Player!</h1>
		<form method="post" action="/Roster/Teams?id=<%= request.getParameter("id") %>">
			<p>First Name: <input type="text" name="first_name"></p>
			<p>Last Name: <input type = "text" name = "last_name"></p>
			<p>Age: <input type="number" name="age"></p>
			<button>Add</button>
		</form>
	</body>
</html>