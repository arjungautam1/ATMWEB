<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body bgcolor="powderblue";>
<h1>e-Banking </h1>
<form action="login" method="post">
Enter your username:<br><input type="text" placeholder="Username" name="uname"><br>
Enter your password:<br><input type="password" placeholder="Passsword " name="pass"><br>
<br>
<input type="submit" value="login">
<button onclick="myFunction()">Forgot Password ?</button>

<script>
function myFunction() {
  alert("You are admin ,You can't say that  !!");
}
</script>
</body>
</html>