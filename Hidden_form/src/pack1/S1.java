package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S1
 */
@WebServlet("/S1")
public class S1 extends HttpServlet
{
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String v1=request.getParameter("n1");
			String v2=request.getParameter("n2");
			out.println("<h2> id is "+v1+" pwd is "+v2+"</h2>");
			String rt="<form action='S2'>";
			rt=rt+"<input type='hidden' name='n11' value='"+v1+"'>";
			rt=rt+"<input type='hidden' name='n12' value='"+v2+"'>";
			rt=rt+"<input type='submit' >";
			rt=rt+"</form>";
			out.println(rt);
		}

}
