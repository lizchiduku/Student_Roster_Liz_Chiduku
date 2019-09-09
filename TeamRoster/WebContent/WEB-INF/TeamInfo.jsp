<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
         <%@ page import="com.codingdojo.models.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
	<body>
		<h1><a href="/Roster/NewTeam">New Team</a></h1>
			<table>
			<tr><th>Team</th><th>Players</th><th>Action</th></tr>
		
			<%for(int i = 0; i < Team.getTeams().size();i++){ %>
			<tr>
				<td><%= Team.getTeams().get(i).getTeam_name() %></td>
				<td><%= Team.getTeams().get(i).getPlayers().size() %></td>
				<td><a href="/Roster/Teams?id=<%=i%>">Details</a> 
				<a href="/Roster/Teams?id=<%=i%>&delete=true">Delete</a></td>
			</tr>
			<%} %>
		
		</table>
</body>
</html>