package org.btm.annotaion;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/fs")
public class FirstServlet extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='blue'>"
				+ "<h1> "+ name +" Using Annotaion " +place+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close();
	}

}
