<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="signIn" method="post">
		<div>
			<label for="username">Enter Username:</label> <input type="text"
				id="username" placeholder="Enter username" name="username">
		</div>
		<div>
			<label for="pwd">Enter Password:</label> <input type="password"
				id="password" placeholder="Enter password" name="password">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	<a href="register" >Register here</a>

</body>
</html>