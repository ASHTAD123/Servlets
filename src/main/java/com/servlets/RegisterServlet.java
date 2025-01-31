package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

public class RegisterServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest request ,HttpServletResponse response) throws ServletException,IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		writer.println(" <h1> WELCOME TO REGISTER SERVLET </h1>");
		
		String name = request.getParameter("user_name");
		String pass = request.getParameter("password");
		String email = request.getParameter("email");
		String gender = request.getParameter("user_gender");
		String course = request.getParameter("user_course");
		
		String condition = request.getParameter("condition");
		
		if(condition.equals("checked")) {
			
			writer.println(" <h2> Name : " + name +"</h2>");
			writer.println(" <h2> Password : " + pass +"</h2>");
			writer.println(" <h2> Email : " + email +"</h2>");
			writer.println(" <h2> Course : " + course +"</h2>");
			
		}else {
			writer.println(" <h2> Please accept terms & conditions before proceeding </h2>");
		}
	}
}