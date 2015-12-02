package Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Form3
 */
@WebServlet("/Form3")
public class Form3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form3() {
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
	//	doGet(request, response);
		try
	    {	
	    	File f1=new File("D://100.txt");
	          BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
	 		 System.out.println(request.getParameter("t10")+"sdfasdfdfdfsfdss");
	 		 
	 		 
	bw.write(request.getParameter("t10")+";");
	bw.write(request.getParameter("t11")+";");
	bw.write(request.getParameter("opt5")+";");
	bw.write(request.getParameter("t12")+";");
	bw.write(request.getParameter("t13")+";");
	bw.write(request.getParameter("opt6")+";");
	bw.write(request.getParameter("t14")+";");
	bw.write(request.getParameter("t15")+";");
	bw.write(request.getParameter("t16")+";");
	bw.write(request.getParameter("t17")+";");
	bw.write(request.getParameter("t18")+";");
	bw.write(request.getParameter("opt7")+";");
	bw.write(request.getParameter("opt8")+";");
	if(request.getParameter("mc").equals("CGPA"))
	bw.write(request.getParameter("t20")+";");
	else
	bw.write(request.getParameter("t21")+";");
	bw.write(request.getParameter("aecephd")+";");
	bw.write(request.getParameter("e1")+";");
	bw.write(request.getParameter("e2")+";");
	bw.write(request.getParameter("e3")+";");
	bw.write(request.getParameter("e4")+";");
	bw.write(request.getParameter("completedpg")+";");
	bw.write(request.getParameter("e9")+";");
	bw.write(request.getParameter("e8")+";");
	bw.write(request.getParameter("e5")+";");
	bw.write(request.getParameter("thesis")+";");
	bw.write(request.getParameter("e6")+";");
	bw.write(request.getParameter("e7")+";");

	
	bw.write(request.getParameter("e10")+";");
	if(request.getParameter("mm").equals("CGPA"))
	bw.write(request.getParameter("e11")+";");
	else
	bw.write(request.getParameter("e12")+";");
	bw.write(request.getParameter("otherdegree")+";");
	bw.write(request.getParameter("e13")+";");
	bw.write(request.getParameter("e14")+";");
	bw.write(request.getParameter("e15")+";");
	bw.write(request.getParameter("e16")+";");
	bw.write(request.getParameter("e17")+";");
	bw.write(request.getParameter("gate")+";");
	bw.write(request.getParameter("e18")+";");
	bw.write(request.getParameter("e19")+";");
	bw.write(request.getParameter("e20")+";");
	bw.write(request.getParameter("e21")+";");
	bw.write(request.getParameter("e22"));
	bw.write(request.getParameter("t22")+";");
	 HttpSession s=request.getSession(true);
	 String g=(String) s.getAttribute("id");
	bw.write(g+";");
	bw.newLine();
	 bw.close();
		 br.close(); 	
		 response.sendRedirect("Form");
	    }
      catch(Exception e)
      {
       System.out.println(e);	
      }
		
		   
	}
	
	

}
