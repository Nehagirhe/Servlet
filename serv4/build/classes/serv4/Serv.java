package serv4;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Serv extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  resp.setContentType("text/html");
  PrintWriter out= resp.getWriter();
  
  ServletConfig c=getServletConfig();
  String hrName=c.getInitParameter("hr");
	
  out.println("A paragraph is a unit of writing that consists of "
			+hrName+ "one or more sentences "+hrName+" that relate to the same "
			+ "topic. "+hrName+" Paragraphs are essential "+hrName+" for organizing"
			+ " long "
			+ "pieces of writing such as novels, papers, or even emails.");
	
	}
	

}
