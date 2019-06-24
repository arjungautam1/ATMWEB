package com.atm;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
			String uname=request.getParameter("uname");
			String pass=request.getParameter("pass");
			if(uname.equals("laser")&&(pass.equals("arjun")))
			{
				response.sendRedirect("option.jsp");
			}
			else
			{
				response.sendRedirect("index.jsp");
				
			}
		
	
	}
}
