package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Filter
 */
@WebServlet("/Filter")
public class Filter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Filter() {
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
		// TODO Auto-generated method stub
		doGet(request, response);
		ArrayList<String> list = new ArrayList<String>();
		list.add(request.getParameter("t1"));
		list.add(request.getParameter("t2"));
		list.add(request.getParameter("t3"));
		list.add(request.getParameter("pap1"));
		list.add(request.getParameter("gender"));
		
		list.add(request.getParameter("Physically Disabled"));
		list.add(request.getParameter("Date Of Birth"));
		  HttpSession s=request.getSession(true);
			
			s.setAttribute("t1",request.getParameter("t1"));
			s.setAttribute("t2",request.getParameter("t2"));
			s.setAttribute("t3",request.getParameter("t3"));
			s.setAttribute("pap1",request.getParameter("pap1"));
			s.setAttribute("Phisically Disabled",request.getParameter("Phisically Disabled"));
			s.setAttribute("Date Of Birth",request.getParameter("Date Of Birth"));
			
			
		
			response.sendRedirect("Admin");
			
	}

}
