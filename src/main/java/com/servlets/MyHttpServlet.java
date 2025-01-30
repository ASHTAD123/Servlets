package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHttpServlet extends HttpServlet{

	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		
		writer.println(" <h1> HTTP SERVLET </h2>");
		writer.println(" <h1> doGet() of print writer </h2>");
	}
}
