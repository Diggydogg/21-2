<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board list</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style type="text/css">
h1 {
	margin: 50px 0 30px 30px;
}

.table {
	width: 1200px;
	margin: 0 0 0 30px;
}
button {
	margin: 0 0 0 30px;
}

</style>
<script>
	function delete_ok(id){
		var a = confirm("정말로 삭제하겠습니까?");
		if(a) location.href='deleteok/' + id;
	}
</script>
</head>
<body>
<h1>Weather</h1>
<table class="table table-hover">
	<tr>
		<th>No</th>
		<th>Date</th>
		<th>Weather</th>
		<th>Temperature</th>
		<th>SensTemperature</th>
		<th>Humidity</th>
		<th>Wind</th>
		<th></th>
	</tr>
	<h2>1주일 평균 기온 : ${ave}</h2>
	<c:forEach items="${list}" var="u" varStatus="status">
		<tr>
			<td>${fn:length(list)-status.index}</td>
			<td>${u.date}</td>
			<td>${u.weather}</td>
			<td>${u.temp}</td>
			<td>${u.sensTemp}</td>
			<td>${u.humidity}</td>
			<td>${u.wind}</td>
			<td><a href="editform/${u.seq}">Edit</a></td>
			<td><a href="javascript:delete_ok('${u.seq}')">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br>
<button type="button" onclick="location.href='add'" class="btn btn-primary">new post</button>
</body>
</html>
