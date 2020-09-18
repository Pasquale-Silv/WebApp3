package it.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet1() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username = request.getParameter("username");
		String psw = request.getParameter("password");
		boolean loginFailed = false;
		request.getSession().setAttribute("loginFailed", loginFailed);
		request.getSession().setAttribute("a", "Prova");
		
		if(username.length() > 5 && psw.length() > 5) {
			request.getSession().setAttribute("username", username);
			loginFailed = false;
			request.getSession().setAttribute("loginFailed", loginFailed);
			response.sendRedirect(request.getContextPath() + "/jsp/autenticato.jsp");
		} else if(username.equalsIgnoreCase("google") && psw.equalsIgnoreCase("bigG")) {
			// Reindirizza a google
			response.sendRedirect("https://www.google.com");
		} else {
			// Nel caso di credenziali non conformi
			loginFailed = true;
			request.getSession().setAttribute("loginFailed", loginFailed);
			response.sendRedirect(request.getContextPath() + "/jsp/login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
