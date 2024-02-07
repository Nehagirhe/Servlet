import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Myserv extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("This is doGet Method <br>");
		String name=req.getParameter("uname");
		String email=req.getParameter("umail");
		String pass=req.getParameter("upass");
	
		out.println("<br><b> Welcome </b> "+name+"<br>" );
		out.println("Email :"+email+"<br>");
		out.println("Pass :"+pass+"<br>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.print("This is doPost Method <br>");
		doGet(req, resp);	
	}

	
	
}
