%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ page import="com.codingdojo.models.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>New Teams</title>
	</head>
	<body>
		<h1>Create A New Team</h1>
		<form action= "/Roster/NewTeam" method="post">
			<p>Team Name: <input type="text" name="team_name"></p>
			<button>Create</button>
		</form>
	</body>
</html>