package com.ihsanobed.server;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Home extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		
		String HTML = 
			"<!doctype html><html><head>" +
			" <title>LogIn Page</title>" + 
			"<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">" +
			"<meta name=\"gwt:property\" content=\"locale=de\">" +
			"<script type=\"text/javascript\" language=\"javascript\"" +
			" src=\"../home/home.nocache.js\"></script>" +
			"</head>" + 
			"<body></body>" + 
			"</html>";// end of the HTML String body 
		
		response.getWriter().print(HTML);
	}// end of the HttpServlet
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}// end of doPost
	
}// end of HttpServlet class
