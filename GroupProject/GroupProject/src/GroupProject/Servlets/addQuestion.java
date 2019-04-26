package GroupProject.Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import GroupProject.Model.Question;
import GroupProject.Model.Users;
import GroupProject.Services.*;
/**
 * Servlet implementation class addQuery
 */
@WebServlet("/addQuery")
public class addQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	IQuestion iq = new IQuestionImpl();
	Question question = new Question();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Users user=(Users) session.getAttribute("currentUser");

		question.generateQid();
		question.setUserId(user.getUid());
		question.setQuery(request.getParameter("question"));
		
		iq.addQuery(question);
		
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<html><body>");
		out.println("Your question was successfully added to the database");
		out.println("</body></html>");
	}

}