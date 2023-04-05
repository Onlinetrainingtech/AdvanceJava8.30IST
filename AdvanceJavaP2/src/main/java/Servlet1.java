

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		String e1=req.getParameter("email");
		String p1=req.getParameter("pass");
		if(e1.equals("admin@gmail.com")&&p1.equals("admin"))
		{
			//RequestDispatcher rd=req.getRequestDispatcher("sucess.jsp");
			//rd.forward(req, resp);
			resp.sendRedirect("sucess.jsp");
			
		}
		else
		{
			RequestDispatcher rd=req.getRequestDispatcher("error.jsp");
			rd.include(req, resp);
		}
	}

}
