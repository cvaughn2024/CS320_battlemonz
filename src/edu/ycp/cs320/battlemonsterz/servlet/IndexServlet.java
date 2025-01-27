package edu.ycp.cs320.battlemonsterz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doGet");
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doPost");
	        
	        // check which button the user pressed
	        if (req.getParameter("account") != null) {
	            // call addNumbers JSP
	            req.getRequestDispatcher("/_view/account.jsp").forward(req, resp);
	        }
	        
	        else if (req.getParameter("play") != null) {
	            // call addNumbers JSP
	            req.getRequestDispatcher("/_view/play.jsp").forward(req, resp);
	        }
	        
	        else if (req.getParameter("login") != null) {
	            // call addNumbers JSP
	            req.getRequestDispatcher("/_view/login.jsp").forward(req, resp);
	        }
	        
	        else if (req.getParameter("carddatabase") != null) {
	            // call addNumbers JSP
	            req.getRequestDispatcher("/_view/carddatabase.jsp").forward(req, resp);
	        }

	        
	        else {
	        	throw new ServletException("Unknown command");
	        }
	        
	}}