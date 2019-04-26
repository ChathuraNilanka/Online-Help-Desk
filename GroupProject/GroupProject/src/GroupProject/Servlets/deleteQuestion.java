package GroupProject.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GroupProject.Model.Question;
import GroupProject.Services.IQuestion;
import GroupProject.Services.IQuestionImpl;

/**
 * Servlet implementation class deleteQuestion
 */
@WebServlet("/deleteQuestion")
public class deleteQuestion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Question question = new Question();
	IQuestion iq = new IQuestionImpl();
	
    public deleteQuestion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		question.setQid(request.getParameter("qid"));
		iq.deleteQuery(question);
		
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<html><body>");
		out.println("Your question was successfully deleted");
		out.println("</body></html>");
	}

}
