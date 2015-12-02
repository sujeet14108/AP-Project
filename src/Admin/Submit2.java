package Admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Submit2
 */
@WebServlet("/Submit2")
public class Submit2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Submit2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<form>");
		out.println("<html>");
		out.println("<head><title>IIIT-Delhi PhD Admissions Filtered Result</title></head>");
        out.println("<body bgcolor=\"white\">");
        out.println(
        		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
        		      +"<div 'id=menu'>"
        	          +"<a href=\"PerInfo\" >Personal Information</a> | <a href=\"EduInfo\">Education Information</a> | <a href=\"Submit2\">Submit</a><br><br></from>"
        	          +"<form action='Form2'>"
        	          
        	          );
        out.println("</form>"+"</body>"+"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<form>");
		out.println("<html>");
		out.println("<head><title>IIIT-Delhi PhD Admissions Filtered Result</title></head>");
        out.println("<body bgcolor=\"white\">");
        out.println(
        		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
        		      +"<div 'id=menu'>"
        	          +"<a href=\"PerInfo\" >Personal Information</a> | <a href=\"EduInfo\">Education Information</a> | <a href=\"Submit2\">Submit</a><br><br></from>"
        	          +"<form action='Form2'>"
        	          
        	          );
        out.println("</form>"+"</body>"+"</html>");
	}

	}


