<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div >
		<main>
			<form action="./signup" method="post">
					Enter Name : <input type="text" name="name" placeholder="Name" required><br><br>
					Enter Email : <input type="text" name="email" placeholder="Email" required><br><br>
					Enter Password : <input type="password" name="password" placeholder="Password" required><br><br>
					<input type="submit" value="submit" class="btn">
			</form>
		</main>
	</div>
</body>
</html>