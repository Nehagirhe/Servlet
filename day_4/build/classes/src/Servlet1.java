

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serv04")
//@WebServlet(name="me",urlPatterns={"/Serv04"},initParams=@WebInitParam(name="hr", value="Ram")
public class Serv04 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletConfig c=getServletConfig();
		String hrName=c.getInitParameter("hr");
		
		out.println("Welcome Serv04<br><br>"+
	 "A paragraph is a series of sentences that are "
	 +hrName+ "  organized and coherent, " +hrName+" and are all related"
	 + " to a single topic. "+hrName+"  Almost every piece of writing"
	 + " you do that is longer than a few sentences "
	 + "should be  "+hrName+" organized into paragraphs.");
		
	}

}
