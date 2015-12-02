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
 * Servlet implementation class Form2
 */
@WebServlet("/Form2")
public class Form2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Form2() {
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
		
		try
	    {
			System.out.println("gggggggggggggg");
	    	File f1=new File("D://100.txt");
	         BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
		
		
		StringBuffer jb = new StringBuffer();
		  String line = null;
		  
		  
		  
	
		  
		//obj.put("name", request.getParameter("t2"));
		  HttpSession s=request.getSession(true);
			
			s.setAttribute("id",request.getParameter("t"));

	bw.write(request.getParameter("t1")+";");
	bw.write(request.getParameter("t2")+";");
	//bw.write(request.getParamete3r("t")+";");
	bw.write(request.getParameter("t4")+";");
	bw.write(request.getParameter("t5")+";");
	bw.write(request.getParameter("stream")+";");
	bw.write(request.getParameter("opt1")+";");
	bw.write(request.getParameter("opt2")+";");
	bw.write(request.getParameter("opt3")+";");
	bw.write(request.getParameter("sex")+";");
	bw.write(request.getParameter("ct")+";");
	
	bw.write(request.getParameter("disable")+";");
	bw.write(request.getParameter("date")+";");
	bw.write(request.getParameter("war")+";");
	bw.write(request.getParameter("t6")+";");
	bw.write(request.getParameter("opt4")+";");
	bw.write(request.getParameter("t7")+";");
	bw.write(request.getParameter("t8")+";");
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


