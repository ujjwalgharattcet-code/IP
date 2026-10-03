package backendservlet;

public class HelloServlet extends HttpServlet {
	protected void doGet (HttpServletRequest req,jakarta.servlet.http.HttpServletResponse res) throws
	ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		out.println("<h1>Hello World</h1>");
		
	}
}