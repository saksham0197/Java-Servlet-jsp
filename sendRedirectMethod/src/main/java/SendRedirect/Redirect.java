package SendRedirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Submit For Serach")
public class Redirect extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {
		String mySearch = req.getParameter("Search");
		rep.sendRedirect("https://www.google.com/search?q=" +mySearch);
		
		//rep.sendRedirect("https://www.youtube.com/channel/UCtPqFAFq7CmQNCwnTpvY-Sg");
	}

}
