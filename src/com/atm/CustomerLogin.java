package com.atm;
import java.sql.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username=request.getParameter("uname");
	String password=request.getParameter("pass");
	try {
		String query="select * from customer";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String uname=rs.getString("firstname");
		String pass=rs.getString("password");
		if(pass.equals(password)&&uname.contentEquals(username))
{
	response.sendRedirect("customerweb.jsp");
}
		else {
			response.sendRedirect("customersignup.jsp");
			
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}

}
