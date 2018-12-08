package org.jee.cookieApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c[] = req.getCookies();
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='blue'>"
				+ "<h1>Coockie Object value "+c[0].getValue()+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close();
	}

}
