package com.atm;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AvailableBalance extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int account=Integer.parseInt(request.getParameter("accno"));
		try {
			String query="select * from balance where id="+account+" ";
			Connection con=ConnectionManager.jdbcConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			rs.next();
			int avail=rs.getInt("available");
		    int withdraw=rs.getInt("withdraw");
		    avail=avail-withdraw;
			PrintWriter out=response.getWriter();
			out.println("<h1><u> Bank Balance Information </u></h1><hr> ");
			out.println("<h3><br> Available Balance is "+avail);
			out.println("<br><hr><h2>-- Thanks For Using Our Banking Services --");
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}