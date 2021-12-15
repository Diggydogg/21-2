<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
</head>
<body>
<table>
	<c:forEach items="${list}" var="u">
		<tr>
			<td>${u.seq}</td>
			<td>${u.date}</td>
			<td>${u.weather}</td>
			<td>${u.temp}</td>
			<td>${u.sensTemp}</td>
			<td>${u.humidity}</td>
			<td>${u.wind}</td>
			<td>${u.desc}</td>
			
			<td><a href="editform/${u.seq}">Edit</a></td>
			<td><a href="deleteok/${u.seq}">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br>
<button type="button" onclick="location.href='add'">new post</button>
</body>
</html>
