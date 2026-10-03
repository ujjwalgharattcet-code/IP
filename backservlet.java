package backendservlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/hello")
public class backservlet extends HttpServlet {
	protected void doGet (HttpServletRequest req,jakarta.servlet.http.HttpServletResponse res) throws
	ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>Hello World</h1>");
		
	}
}