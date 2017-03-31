package hack;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Servlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws Exception, Throwable {
		LinkedList<String> l = new LinkedList<>();
		
		l.add("Yasen");
		l.add("Kamen");
		
		req.getSession().setAttribute("message", "hello");
		req.getSession().setAttribute("title", "ToDo List");
		req.getSession().setAttribute("users", l);

		RequestDispatcher view = req.getRequestDispatcher("index.jsp");
		view.forward(req, res);
	}
}
