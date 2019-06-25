package com.atm;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PersonalInformation extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int account=Integer.parseInt(request.getParameter("accno"));
	
		try {
			
			String query="select * from customer";
			Connection con=ConnectionManager.jdbcConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			rs.next();
			int bankid=rs.getInt("id");
			String firstname=rs.getString("firstname");
			String lastname=rs.getString("lastname");
			String address=rs.getString("address");
			String gender=rs.getString("gender");
			String email=rs.getString("email");
			if(account==bankid)
			{
				PrintWriter out=response.getWriter();
				out.println("<h1> <u> Personal Information</u></h1><hr>");
				out.println("<h3><br>Account Number:"+bankid);
				out.println("<br><hr>Name :"+firstname+" "+lastname);
				out.println("<br><hr>Address :"+address);
				out.println("<br><hr>Gender :"+gender);
				out.println("<br><hr>e-mail :"+email);
				out.println("<br><hr><h2>-- Thanks For Using Our Banking Services --");
				
			}
			else
			{
				response.sendRedirect("customerweb.jsp");
			}
			String query1="insert into balance(id)values("+account+")";
			st.executeUpdate(query1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
				
	}
}
