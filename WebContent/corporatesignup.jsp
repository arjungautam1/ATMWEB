<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>SignUp</title>
</head>
<body bgcolor="#87CEEB";>

<h1><font color="white">WELCOME TO THE TEXAS e-BANKING</font></h1><br>
<h2>Corporate Login</h2><br>

<form action="corporatelogin" method="get">
Enter username: <input type="text" name="uname"placeholder="Username"><br><br>
Enter password: <input type="password" name="pass"placeholder="Password"><br><br>
<input type="submit" value="login">

</form>
<br>
<hr><br>

<h2>Corporate SignUp</h2>
<form action="corporatesignup"method="get">
Enter First name:<br><input type="text" placeholder="Username" name="firstname">
<br>Enter Last name:<br><input type="text" placeholder="Last Name" name="lastname">
<br>Enter your Post :<br><input type="text" placeholder="Post "name="post">
<br>Enter the BankID:<br><input type="number" name="id" placeholder="Bank Id "> 
<br>Create password:<br><input type="password" placeholder="password" name="pass">
<br>Enter gender :<br><input type="radio" name="gender" value="Male" checked>Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Other">Other<br>
<br><input type="submit" value="SignUp">
</form>


</body>
</html>