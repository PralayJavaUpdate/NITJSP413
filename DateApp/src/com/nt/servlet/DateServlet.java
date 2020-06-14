package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class DateServlet extends GenericServlet {
	
	Date d=null;
	PrintWriter pw=null;
    @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		//get PrintWriter stream from res object having response as destination
    	pw=res.getWriter();
    	//set response contentType to browser through ServletContainer and WebServer
    	res.setContentType("text/html");
    	//get System date and time
    	d=new Date();
    	//write generated o/p to the res object through PrintWriter stream
    	pw.println("<h1>Date and Time: "+d.toString()+"<h1>");
    	//close the stream
    	pw.close();
	}

}
