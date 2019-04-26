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
 * Servlet implementation class deleteNotice
 */
@WebServlet("/deleteNotice")
public class deleteNotice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	INoticeService ins = new NoticeServiceImpl();
	Notice notice = new Notice();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteNotice() {
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
		
		notice.setNoticeID(request.getParameter("noticeID"));
		ins.removeNotice(notice);
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("Notice was successfully deleted.");
		out.println("</body></html>");
	}
}
