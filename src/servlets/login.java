package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ModelClient;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**CreateUser
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.doPost(request, response);
		//this.getServletContext().getRequestDispatcher("/vues/dashboardClient.jsp").forward(request, response);
		//request.getRequestDispatcher("/vues/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login =(String)request.getParameter("txtlogin");
		String password =(String)request.getParameter("txtpassword");
		String text = "echec login";
		ModelClient m_client = new ModelClient();
		if(m_client.log(login, password)) {
			request.setAttribute("model", m_client);
			this.getServletContext().getRequestDispatcher("/vues/dashboardClient.jsp").forward(request, response);
		}
		else {
			request.setAttribute("rsp", text);
			this.getServletContext().getRequestDispatcher("/vues/login.jsp").forward(request, response);
		}
	}

}
