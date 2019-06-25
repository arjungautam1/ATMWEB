package com.atm;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Deposit extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int account=Integer.parseInt(request.getParameter("accno"));
		int amount=Integer.parseInt(request.getParameter("deposit"));
		
		try {
			String query="select * from balance where id="+account+"";

		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
	    int  avail=rs.getInt("available");
	    Timestamp t = rs.getTimestamp("time");
	    
		avail=avail+amount;
		String qry="update balance set available="+avail+" where id="+account+"";
		st.executeUpdate(qry);
		PrintWriter out=response.getWriter();
		out.println("<h2>--   Receipt   --</h2><h3><hr><br>");
		out.println(amount+" has been deposited into the account number "+account+" .<br><br>");
		out.println("<u>Date / Time </u><br>");
		out.println(t);
		out.println("<br>"+"Account number :"+account);
		out.println("<br>"+"Available Bank Balance :"+avail);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
}
