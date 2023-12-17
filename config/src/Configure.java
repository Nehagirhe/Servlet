

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Configure extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		ServletConfig c=getServletConfig();
		String hrName=c.getInitParameter("hr");
		
		out.println("A paragraph is a unit of writing that consists of "
				+hrName+ "one or more sentences "+hrName+" that relate to the same "
				+ "topic. "+hrName+" Paragraphs are essential "+hrName+" for organizing"
				+ " long "
				+ "pieces of writing such as novels, papers, or even emails.");
	}

}
