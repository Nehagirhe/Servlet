
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/serv1")
public class MyFilter1 implements Filter {

    
	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String uname =request.getParameter("uname");
		String upass =request.getParameter("upass");

		
		if(uname.equals(""))
		{
			out.print("<p style='color:red'>Please Enter Uname</p><br>");
		request.getRequestDispatcher("index.html").include(request, response);
		}
		else if(uname.length()<3)
		{
			out.print("<p style='color:red'>Uname must be more then 3 char</p><br>");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else{
		chain.doFilter(request, response); // servlet pe jayega 
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
