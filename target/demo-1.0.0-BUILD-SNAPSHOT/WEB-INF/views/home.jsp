<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<title>Home</title>
</head>
<body>
	<div class="container">
		<h1>My SpringMVC Demo</h1>
		<h2>${home.message}</h2>
		<h4>Server date time is : ${home.dateTime}</h4>
		<a class="btn btn-info btn-sm" href="/demo/login">Sign in</a>
	</div>
</body>
</html>
