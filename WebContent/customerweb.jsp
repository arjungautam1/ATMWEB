<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CustomerControlPage</title>
</head>
<body bgcolor="#87CEEB";>

<h1><font color="white"> -- TEXAS e-BANKING --</font></h1><br>
<hr><h2>Personal Information </h2>
<form action="accinfo" method="get">
Enter your Account Number: <input type="number" name="accno" placeholder="Account Number">
<br>Click here to know your general account information :<input type="submit" value="My general information"><hr> 
</form>
<h2>Available Bank Balance </h2>
<form action="available" method="get">
Enter your Account Number :<input type="number" name="accno" placeholder="Account Number">
<br>Click here to know your available balance information:<input type="submit" value="Available Bank Balance"><hr>
</form>
<h2>WithDraw Balance </h2>
<form action="withdraw" method="get">
Enter your Account Number :<input type="number" name="accno" placeholder="Account Number">
<br>Click here to withdraw Balance from specified A/C Number:<input type="submit" value="Withdraw Amount"><hr>
</form>
</form>
<h2>Deposit Balance </h2>
<form action="deposit" method="get">
Enter your Account Number :<input type="number" name="accno" placeholder="Account Number">
<br>Click here to Deposit Balance to the specified A/C Number:<input type="submit" value="deposit Amount"><hr>
</form>
</body>
</html>