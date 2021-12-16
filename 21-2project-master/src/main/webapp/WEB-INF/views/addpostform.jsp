<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add form</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
<style type="text/css">
h1 {
	margin: 30px 0 0 30px;
}

form {
	width: 800px;
	margin: 30px 0 0 30px;
}
</style>
</head>
<body>
	<h1>add form</h1>
	<form action="addok" method="get">
		<div class="form-group">
			<label>Date</label>
			<input type="text" name="Date" class="form-control">
		</div>
		<div class="form-group">
			<label>Weather</label>
			<input type="text" name="weather" class="form-control">
		</div>
		<div class="form-group">
			<label>Temp</label>
			<input type=text name="temp" class="form-control">
		</div>
		<div class="form-group">
			<label>SensTemp</label>
			<input type="text" name="sensTemp" class="form-control">
		</div>
		<div class="form-group">
			<label>Humidity</label>
			<input type="text" name="humidity" class="form-control">
		</div>
		<div class="form-group">
			<label>Wind</label>
			<input type="text" name="wind" class="form-control">
		</div>
		<button type="submit" class="btn btn-primary">submit</button>
	</form>
</body>
</html>