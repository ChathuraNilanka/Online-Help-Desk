package GroupProject.Servlets;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

import GroupProject.Util.DBconnect;

/**
 * Servlet implementation class QuestionParameterized
 */
@WebServlet("/QuestionParameterized")
public class QuestionParameterized extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QuestionParameterized() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
		Connection conn = DBconnect.getConnection();
	
		
	    String user_id =request.getParameter("UserId");
		
		JasperReport jasperReport = null;
		JasperDesign jasperDesign = null;
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("parameter1", user_id);
		String path = getServletContext().getRealPath("/Report/");
		jasperDesign = JRXmlLoader.load(path + "/Question_Parameterized.jrxml");
		jasperReport = JasperCompileManager.compileReport(jasperDesign);
		byte[] byteStream = JasperRunManager.runReportToPdf(jasperReport, parameters, conn);
		OutputStream outStream = response.getOutputStream();
		response.setContentType("application/pdf");
		response.setContentLength(byteStream.length);
		outStream.write(byteStream, 0, byteStream.length);
		//this.command = null;
		return;
		
	} catch (SQLException e) {
		
		e.printStackTrace();
		
	} catch (JRException e) {
	
		e.printStackTrace();
		
	} catch (IOException e) {
	
		e.printStackTrace();
		
	}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
