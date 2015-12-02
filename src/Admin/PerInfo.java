package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PerInfo
 */
@WebServlet("/PerInfo")
public class PerInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PerInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
	
		out.println("<html>");
		out.println("<head><title>IIIT-Delhi PhD Admissions Filtered Result</title></head>");
        out.println("<body bgcolor=\"white\">");
    	out.println("<form action=\"EduInfo\" method=\"post\" >");
        out.println(
        		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
        		      +"<div 'id=menu'>"
        	          +"<a href=\"PerInfo\" >Personal Information</a> | <a href=\"EduInfo\">Education Information</a> | <a href=\"Submit2\">Submit</a><br><br></from>"
        	          +"<form action='Form2'>"
        	          +"<pre style='font-size: 120%'>                  Email    <input type='text'  name='t1' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>                   Name    <input type='text'  name='t2' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
          		      +"<pre style='font-size: 120%'>      Enrollment Number    <input type='text'  name='t3' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
          		      +"<pre style='font-size: 120%'>               Category    <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='General'>General</option></select><option value='first'>All</option> <option value='OBC'>OBC</option><option value='first'>All</option> <option value='SC'>SC</option><option value='first'>All</option> <option value='ST'>ST</option></pre>"
          		      +"<pre style='font-size: 120%'>                 Gender   <input type='radio'  name='gender' value='Male'>Male   <input type='radio'  name='gender' value='Female'>Female</pre>"
          		      +"<pre style='font-size: 120%'>    Physically Disabled   <input type='radio'  name='Physically Disabled' value='Yes'>Yes    <input type='radio'  name='Physically Disabled' value='No'>No</pre>"
          		      +"<pre style='font-size: 120%'>          Date Of Birth   <input type='radio'  name='Date Of Birth' value='Before'>Before <input type='radio'  name='Date Of Birth' value='On'>On   <input type='radio'  name='Date Of Birth' value='After'>After</pre>"
        		);   out.println("<br><br><input type=submit value=\"Save\">");
        out.println("</form>"+"</body>"+"</html>");
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		
		
		
		try
	    {	
	    	File f1=new File("D://100.txt");
	          BufferedReader br = new BufferedReader(new FileReader(f1));
	 		 BufferedWriter bw= new BufferedWriter(new FileWriter(f1,true));
	 		 String s;
	 		 
	 	s = br.readLine();
				 
				 
				  /* delimiter */
				  String d = ",";
				  /* given string will be split by the argument delimiter provided. */
					String[]  temp = s.split(";");
	 		 System.out.println(temp[0]);
			 System.out.println(request.getParameter("t1"));
	 		   bw.close();
	 	   		 br.close(); 
	 	        
	 	       
	 	       }
	 	       catch(Exception e)
	 	       {
	 	        System.out.println(e);	
	 	       }
	
		out.println("<html>");
		out.println("<head><title>IIIT-Delhi PhD Admissions Filtered Result</title></head>");
        out.println("<body bgcolor=\"white\">");
        out.println("<form action=\"PerInfo\" method=\"post\" >");
        out.println(
        		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
        		      +"<div 'id=menu'>"
        	          +"<a href=\"PerInfo\" >Personal Information</a> | <a href=\"EduInfo\">Education Information</a> | <a href=\"Submit2\">Submit</a><br><br></from>"
        	          +"<form action='Form2'>"
        	          +"<pre style='font-size: 120%'>                  Email    <input type='text'  name='t1' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>                   Name    <input type='text'  name='t2' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
          		      +"<pre style='font-size: 120%'>      Enrollment Number    <input type='text'  name='t3' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
          		      +"<pre style='font-size: 120%'>               Category    <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='General'>General</option></select><option value='first'>All</option> <option value='OBC'>OBC</option><option value='first'>All</option> <option value='SC'>SC</option><option value='first'>All</option> <option value='ST'>ST</option></pre>"
          		      +"<pre style='font-size: 120%'>                 Gender   <input type='radio'  name='gender' value='Male'>Male   <input type='radio'  name='gender' value='Female'>Female</pre>"
          		      +"<pre style='font-size: 120%'>    Physically Disabled   <input type='radio'  name='Physically Disabled' value='Yes'>Yes    <input type='radio'  name='Physically Disabled' value='No'>No</pre>"
          		      +"<pre style='font-size: 120%'>          Date Of Birth   <input type='radio'  name='Date Of Birth' value='Before'>Before <input type='radio'  name='Date Of Birth' value='On'>On   <input type='radio'  name='Date Of Birth' value='After'>After</pre>"
        		);
        out.println("</form>"+"</body>"+"</html>");
	}

}
