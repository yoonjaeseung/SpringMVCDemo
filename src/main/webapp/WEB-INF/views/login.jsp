<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<title>Login</title>
</head>
<body>
	<div class="container">
		<form method="post" action="/demo/login">
			<div class="form-group">
				<label for="userId">ID</label>
				<input type="text" class="form-control" id="userId" name="userID">

			</div>
			<div class="form-group">
				<label for="passwd">Password</label>
				<input type="password" class="form-control" id="passwd" name="userPWD">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>