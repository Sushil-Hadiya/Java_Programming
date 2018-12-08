package org.btm.lifeannotaionApp;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/first")
public class FirstServlet extends GenericServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public FirstServlet() {
		System.out.println(this.getClass().getSimpleName()+" Object is created !!!");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println(this.getClass().getSimpleName()+" Object is Initialized!!!");
	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("nm");
		String place = req.getParameter("pl");
		PrintWriter out = resp.getWriter();
		out.println("<html><body bgcolor = 'blue'>"
				+ "<h1>"+name+" Belongs to "+place+"</h1>"
						+ "</body></html>");
		out.flush();
	}
	@Override
	public void destroy() {
		try {
			System.out.println("All costly resorces are destroyed!!!!");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}
	}

}
