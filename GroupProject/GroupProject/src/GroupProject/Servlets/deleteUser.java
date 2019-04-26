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
 * Servlet implementation class deleteUser
 */
@WebServlet("/deleteUser")
public class deleteUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteUser() {
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
		IUsers iu = new IUserImpl();
		HttpSession session=request.getSession();
		Users user=(Users) session.getAttribute("currentUser");
		
		response.setContentType("text/html");
		
		if(request.getParameter("button").equals("Yes")) {
			if(user.getType().equals("User")){
				if(!user.getUid().isEmpty()) {					
					String id=user.getUid();
					iu.removeUser(id);
					session.invalidate();
				}
			}	
			
			if(!request.getParameter("uid").isEmpty()) {
				iu.removeUser(request.getParameter("uid"));
			}	
		} 
		
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("Index.jsp");
		
		dispatcher.forward(request, response);
	}
}
