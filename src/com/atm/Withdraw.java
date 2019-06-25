package com.atm;
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Withdraw extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int account=Integer.parseInt(request.getParameter("accno"));
	int amount=Integer.parseInt(request.getParameter("withdraw"));

	try {
		String qry="select * from balance where id="+account+"";

		
		Connection con=ConnectionManager.jdbcConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(qry);
		rs.next();
		int amt=rs.getInt("withdraw");
		int avail=rs.getInt("available");
	    Timestamp t = rs.getTimestamp("time");
	    if(amount<avail)
	    {
		amt=amt+amount;
		String query="update balance set withdraw="+amt+" where id="+account+"";
		st.executeUpdate(query);
		PrintWriter out=response.getWriter();
		out.println("<h2>--   Receipt   --</h2><h3><shr><br>");
		out.println(amount+" has been deducted from  account no " +account+".<br><br>");
		out.println("<u>Date / Time </u><br>");
		out.println(t);
		out.println("<br>"+"Account number :"+account);
	    }
	    else 
	    {
	    	PrintWriter out=response.getWriter();
	    	out.println("<h1> Your requirement exceeds your Bank balance .</h1>");
	    }
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
