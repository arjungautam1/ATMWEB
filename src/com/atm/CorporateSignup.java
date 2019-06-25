package com.atm;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CorporateSignup extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String post=request.getParameter("post");
	int bankid=Integer.parseInt(request.getParameter("id"));
	String password=request.getParameter("pass");
	String gender=request.getParameter("gender");

	try {
		
		String query="insert into corporate values('"+name+"','"+lastname+"','"+post+"','"+password+"','"+gender+"',"+bankid+")";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		st.executeUpdate(query);
		
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	response.sendRedirect("corporatelogin.jsp");
	
	}
}