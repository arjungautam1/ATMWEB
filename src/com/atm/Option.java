package com.atm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Option extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String staff=request.getParameter("staff");
		String customer=request.getParameter("customer");
		
	 if(staff.contentEquals("Coporate SignUp/ Login"))
		{
			response.sendRedirect("corporatesignup.jsp");
		}
	}


}
