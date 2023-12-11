import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();

		out.print("This is doGET method<br>");
		String name=req.getParameter("uname");
		String mail=req.getParameter("uemail");
		int pass=Integer.parseInt(req.getParameter("pass"));
		
		
		out.print("Welcome <b>"+name+"</b><br>");
		out.print("Email : "+mail+"<br>");
		out.print("Password : "+pass+"<br>");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");		
		PrintWriter out=resp.getWriter();
		out.print("This is doPOSt method<br>");	
		doGet(req, resp);
	}

}
