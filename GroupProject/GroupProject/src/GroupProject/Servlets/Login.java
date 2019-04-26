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
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
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
		Users user = new Users();
		IUsers iu = new IUserImpl();
		
		if(request.getParameter("uid").isEmpty()) {
			user.setUid(null);
		} else {
			user.setUid(request.getParameter("uid"));
		}
		
		if(request.getParameter("password").isEmpty())
		{
			user.setPassword(null);
		} else {
			user.setPassword(request.getParameter("password"));
		}


		Users userT = iu.viewUser(request.getParameter("uid"));
		response.setContentType("text/html");
		//System.out.println(iu.Login(user));
		if(iu.Login(user)==true) {
			HttpSession session=request.getSession();
			session.setAttribute("currentUser", userT);
/*			
		if(user.getType().equals("Tech")) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("technician page");
				dispatcher.forward(request, response); 
			} else if ( user.getType().equals("Admin")) {
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("admin page");
				dispatcher.forward(request, response);
			} else {
				
			}*/
			
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/viewUser.jsp");
				dispatcher.forward(request, response);
		} else {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/login.html");
			dispatcher.forward(request, response);
		}
	}

}
