
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public index() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/text; charset=utf-8");
		PrintWriter out = response.getWriter();
		String uesrName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (uesrName == "" || uesrName == null || password == "" || password == null) {
			System.out.println("Input Empty");
			out.write("Input Empty");
		} else {
			System.out.println("User [" + uesrName + "] login request");
			out.write(uesrName);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/text; charset=utf-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.write(name);
		System.out.println("Post");
	}
}
