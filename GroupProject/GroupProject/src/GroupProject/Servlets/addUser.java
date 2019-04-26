package GroupProject.Servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GroupProject.Model.Users;
import GroupProject.Services.IUserImpl;
import GroupProject.Services.IUsers;

/**
 * Servlet implementation class addUser
 */
@WebServlet("/addUser")
public class addUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	IUsers iu = new IUserImpl();
	Users user = new Users();
	/**
     * @see HttpServlet#HttpServlet()
     */
    public addUser() {
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
		
		if(request.getParameter("type").equals("Tech")) {
			user.generateTechID();
		} else if(request.getParameter("type").equals("User")){
			user.generateUid();
		}
		user.setFirstName(request.getParameter("firstname"));
		user.setLastName(request.getParameter("lastname"));
		user.setPassword(request.getParameter("password"));
		user.setEmail(request.getParameter("email"));
		user.setGender(request.getParameter("gender"));
		user.setHometown(request.getParameter("hometown"));
		user.setType(request.getParameter("type"));
					
		iu.addUser(user);
		response.setContentType("text/html");
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("login.html");
		
		dispatcher.forward(request, response);
	}

}
