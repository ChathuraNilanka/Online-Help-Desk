package GroupProject.Servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import GroupProject.Model.Solution;
import GroupProject.Model.Users;
import GroupProject.Services.ISolution;
import GroupProject.Services.ISolutionImpl;

/**
 * Servlet implementation class addSolution
 */
@WebServlet("/addSolution")
public class addSolution extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Solution solution = new Solution();
    ISolution is = new ISolutionImpl();
    public addSolution() {
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
		HttpSession session = request.getSession();
		Users user=(Users) session.getAttribute("currentUser");
		
		solution.generateSid();
		solution.setTechId(user.getUid());
		solution.setqId(request.getParameter("qId"));
		solution.setSolution(request.getParameter("solution"));
		
		is.addSolution(solution);
		
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<html><body>");
		out.println("Your solution was successfully added to the database");
		out.println(solution.getqId());
		out.println("</body></html>");
	}

}
