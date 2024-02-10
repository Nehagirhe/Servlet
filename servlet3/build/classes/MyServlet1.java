

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serv1")
public class MyServlet1 extends HttpServlet {
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String name=request.getParameter("uname");
		String pass=request.getParameter("upass");
		
	
		if(name.equals("") || pass.equals(""))
		{
			out.println("<p style='color:red'>Please Enter Somthing!</p>");
			request.getRequestDispatcher("index.html").include(request, response);	
		}
		else
		{
			out.println("Welcome myserv"+name);
			out.println("<a href='profile'>Go</a>");
			
			RequestDispatcher d=request.getRequestDispatcher("profile");
			d.forward(request, response);
			
//			response.sendRedirect("https://www.google.com/search?q="+name);
			
		}
		
		
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("this is doPost Method");
		doGet(request, response);
	}

}
