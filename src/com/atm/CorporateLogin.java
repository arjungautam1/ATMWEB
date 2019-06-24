package com.atm;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CorporateLogin extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		try {
		String query="select * from corporate";
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String password=rs.getString("password");
		String username=rs.getString("first_name");
		if(pass.equals(password)&&uname.equalsIgnoreCase(username))
		{
			response.sendRedirect("corporateweb.jsp");
		}
		else
		{
			response.sendRedirect("corporatesignup.jsp");
			
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
