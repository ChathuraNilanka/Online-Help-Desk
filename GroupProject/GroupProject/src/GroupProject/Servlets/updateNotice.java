package GroupProject.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import GroupProject.Model.Notice;
import GroupProject.Services.INoticeService;
import GroupProject.Services.NoticeServiceImpl;

/**
 * Servlet implementation class updateNotice
 */
@WebServlet("/updateNotice")
public class updateNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	INoticeService ins = new NoticeServiceImpl();
	Notice notice = new Notice();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateNotice() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		notice.setNoticeContent(request.getParameter("updatedNotice"));
		notice.setNoticeID(request.getParameter("noticeID"));
		ins.updateNotice(notice);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("Your notice was successfully updated.");
		out.println("</body></html>");
	}
}
