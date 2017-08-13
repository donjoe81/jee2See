package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.ModelClient;

/**
 * Servlet implementation class login
 */
//@WebServlet("/login")
public class CreateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**CreateUser
     * @see HttpServlet#HttpServlet()
     */
    public CreateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		//this.getServletContext().getRequestDispatcher("/vues/dashboardClient.jsp").forward(request, response);
		//request.getRequestDispatcher("/vues/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom =(String)request.getParameter("nom");
		String prenom =(String)request.getParameter("prenom");
		String adresse =(String)request.getParameter("adresse");
		String tel =(String)request.getParameter("tel");
		String login =(String)request.getParameter("login");
		String password =(String)request.getParameter("password");
		String text = "false";
		ModelClient m_client = new ModelClient();
		if(m_client.createCli(nom, prenom, adresse, tel, login, password))
			text="true";
	    response.setContentType("text/plain");  
	    response.setCharacterEncoding("UTF-8"); 
	    response.getWriter().write(text); 
	}

}
