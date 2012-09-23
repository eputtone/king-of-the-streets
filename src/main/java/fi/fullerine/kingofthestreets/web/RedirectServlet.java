package fi.fullerine.kingofthestreets.web;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			System.out.println("********");
			resp.sendRedirect("evaluations?form");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
