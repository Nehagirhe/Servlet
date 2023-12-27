
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myerv1")
public class Servlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		out.println("Welcome To Servlet1 <br><br><h3>"+uname+"</h3><br><br>");	
		
		Cookie c=new Cookie("name", uname);
		Cookie c1=new Cookie("pass", upass);
		
		response.addCookie(c);
		response.addCookie(c1);
		out.println("Welcome to Servlet1");
		out.println("<a href='myserv2'>Go To Servlet2</a>");		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	
	}

}
