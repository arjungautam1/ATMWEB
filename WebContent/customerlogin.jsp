<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CustomerLogin</title>
</head>
<body bgcolor="#87CEEB">
<h1><font color="white">-- Texas e-Banking --</font><h1></h1> <br>
<style>
.alert {
  padding: 20px;
  background-color: #4CAF50;
  color: white;
}

.closebtn {
  margin-left: 15px;
  color: white;
  font-weight: bold;
  float: right;
  font-size: 22px;
  line-height: 20px;
  cursor: pointer;
  transition: 0.3s;
}

.closebtn:hover {
  color: black;
}
</style>
</head>
<body>

<div class="alert">
  <span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span> 
<b></b><strong>Congratulations !</strong> You have successfully created your account  .<b></b>
</div>

<h2>Customer Login<hr></h2><br>

<form action="customerlog" method="get">
Enter username: <input type="text" name="uname" placeholder="Username"><br><br>
Enter password: <input type="password" name="pass" placeholder="Password"><br>
<br>
<input type="submit" value="login">

</form>

</body>

</html>