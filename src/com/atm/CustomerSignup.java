package com.atm;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerSignup extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String address=request.getParameter("address");
	int bankid=Integer.parseInt(request.getParameter("id"));
	String password=request.getParameter("pass");
	String gender=request.getParameter("gender");
	String email=request.getParameter("email");
	try {
		String query="insert into customer values('"+name+"','"+lastname+"','"+address+"',"+bankid+",'"+password+"','"+gender+"','"+email+"')";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		st.executeUpdate(query);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	response.sendRedirect("customerlogin.jsp");
	}
	
	
}
