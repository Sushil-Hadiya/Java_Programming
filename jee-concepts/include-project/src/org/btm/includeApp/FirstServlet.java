package org.btm.includeApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String pname = req.getParameter("nm");
		String pqty = req.getParameter("pq");

		// ADD REQUEST OBJECT TO SCOPE//
		req.setAttribute("prnm", pname);
		req.setAttribute("prqty", pqty);

		RequestDispatcher rd = req.getRequestDispatcher("ss");
		rd.include(req, resp);
		double totalSum = (Double)req.getAttribute("sum");
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor='blue'>"
				+ "<h1>Product Details Are "+pname+" Price is "+totalSum+"</h1>"
						+ "</body></html>");
		out.flush();
		out.close(); //PRESENTATION LOGIC
	}
}
