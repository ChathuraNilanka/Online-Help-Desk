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
 * Servlet implementation class editUser
 */
@WebServlet("/editUser")
public class editUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editUser() {
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
		Users user = new Users();
		IUsers iu = new IUserImpl();
		HttpSession session=request.getSession();
		Users userT=(Users) session.getAttribute("currentUser");
		
		if(request.getParameter("firstname").isEmpty()) {
			user.setFirstName(userT.getFirstName());
		} else {
			user.setFirstName(request.getParameter("firstname"));
		}
		if(request.getParameter("lastname").isEmpty()) {
			user.setLastName(userT.getLastName());
		} else {
			user.setLastName(request.getParameter("lastname"));
		}
		if(request.getParameter("email").isEmpty()){
			user.setEmail(userT.getEmail());
		} else {
			user.setEmail(request.getParameter("email"));
		}
		if(request.getParameter("password").isEmpty()) {
			user.setPassword(userT.getPassword());
		} else {
			user.setPassword(request.getParameter("password"));
		}
		if(request.getParameter("hometown").isEmpty()) {
			user.setHometown(userT.getHometown());
		} else {
			user.setHometown(request.getParameter("hometown"));
		}

		if(!userT.getUid().isEmpty()) {
			String id=userT.getUid();
			iu.editUser(id,user);
		}	

/*		if(!request.getParameter("uid").isEmpty()) {
			iu.editUser(request.getParameter("uid"),user);
			session.setAttribute("userE", iu.viewUser(request.getParameter("uid")));
		}
*/		
		response.setContentType("text/html");
		Users EUser=iu.viewUser(userT.getUid());
		session.removeAttribute("currentUser");
		session.setAttribute("currentUser", EUser);
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/viewUser.jsp");
		
		dispatcher.forward(request, response);

	}

}