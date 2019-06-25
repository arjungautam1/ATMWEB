<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Login /Sign up </title>
</head>
<body bgcolor="#87CEEB";>

<h1><font color="white">WELCOME TO THE TEXAS e-BANKING</font></h1><br>
<h2>Customer Login</h2><br>

<form action="customerlogin" method="get">
Enter username: <input type="text" name="uname"placeholder="Username"><br><br>
Enter password: <input type="password" name="pass"placeholder="Password"><br>
<input type="submit" value="login">
</form>
<br>
<hr><br>

<h2>Customer SignUp</h2>
<form action="customersignup"method="get">
Enter First name:<br><input type="text" name="firstname"placeholder="First Name ">
<br>Enter Last name:<br><input type="text" name="lastname"placeholder="Last Name">
<br>Enter your address :<br><input type="text" name="address"placeholder="Address ">
<br>Enter the Account No:<br><input type="text" name="id"placeholder="Account Number">
<br>Enter your e-mail :<br><input type="email" name="email" placeholder="e-mail">
<br>Create password:<br><input type="password" name="pass"placeholder="Password">
<br>Enter gender :<br><input type="radio" name="gender" value="Male" checked>Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Other">Other
<br><input type="submit" value="SignUp">
</form>

</body>
</html>