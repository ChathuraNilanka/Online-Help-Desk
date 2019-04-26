package GroupProject.Servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import GroupProject.Model.Users;
import GroupProject.Services.IUserImpl;
import GroupProject.Services.IUsers;

/**
 * Servlet implementation class viewUser
 */
@WebServlet("/viewUser")
public class viewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IUsers iu = new IUserImpl();
		Users user;
		HttpSession session=request.getSession();
		String id=request.getParameter("uid");
		
		response.setContentType("text/html");
		if(id!=null) {
			user= iu.viewUser(id);
			session.setAttribute("UserS", user);
		}

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewUserforAdmin.jsp");
		dispatcher.forward(request, response);

		
		
	}

}
