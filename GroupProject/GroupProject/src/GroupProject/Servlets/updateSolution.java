package GroupProject.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GroupProject.Model.Solution;
import GroupProject.Services.ISolution;
import GroupProject.Services.ISolutionImpl;

/**
 * Servlet implementation class updateSolution
 */
@WebServlet("/updateSolution")
public class updateSolution extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Solution solution = new Solution();
	ISolution is = new ISolutionImpl();
	
    public updateSolution() {
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
	
		solution.setSolution(request.getParameter("updatedSolution"));
		solution.setqId(request.getParameter("qid"));
		is.updateSolution(solution);
		
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<html><body>");
		out.println("Your solution was successfully updated");
		out.println("</body></html>");
	}

}
