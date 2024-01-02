

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv1")
public class MyServ1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname =request.getParameter("uname");
		String upass =request.getParameter("upass");
		String off =request.getParameter("off");
		out.print("Welcome to : Serv 1 Page<br><h2>"+uname+"</h2><br>");
		out.print("<br>You Get <h2>"+off+"</h2><br>");
		
		out.print("<form action='serv2'>");
		out.print("<input type='hidden' name='uname' value ='"+uname+"'> <br>");
		out.print("<input type='hidden' name='upass' value ='"+upass+"'> <br>");
		out.print("<input type='submit' value='Go Next Serv2'>  ");
		out.print("</form>");
		
		out.print("<a href='serv2?uname="+uname+"&upass="+upass+"'>Go Next Serv2</a>");
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			doGet(request, response);
	}

}
