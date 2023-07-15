package LearnRequestResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationForm")
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myname = req.getParameter("name1");  // ye browser pr html ki value bhj raha hai
		String myemail = req.getParameter("email1");
		
		PrintWriter out = resp.getWriter();
		out.println("Name : "+myname);  // print krra hai submit krne k baad server browser pr he
		out.println("email : "+myemail);
	}
	

}
