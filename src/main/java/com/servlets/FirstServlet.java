package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet {

	
	ServletConfig config;

	// Life cycle methods
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method called");
		
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("Service method for Logic Processing");
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		writer.println("Service method for Logic Processing");
	}


	@Override
	public void destroy() {
		
		System.out.println("Destory method called");
		
	}

	
	// Non Life cycle methods
	@Override
	public ServletConfig getServletConfig() {
		
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	}
