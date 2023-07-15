package Sesssions;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Login")
public class Login extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
	
		
		if(myemail.equals("Saksham0190@gmail.com") && mypass.equals("12345"))
		{
			//req.setAttribute("name_key", "Saksham");
			
			HttpSession session = req.getSession();
			session.setAttribute("name_key", "Saksham");
			
			
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req,resp);
		}
		else
		{
			resp.setContentType("text/html");
			out.print("<h2 style = 'color:red'>Email id and Password is Incorrect</h2>");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req,resp);
		}
			
	}
	

}
