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
 * Servlet implementation class EduInfo
 */
@WebServlet("/EduInfo")
public class EduInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EduInfo() {
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
    	out.println("<form>");
        out.println(
        		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
        		      +"<div 'id=menu'>"
        	          +"<a href=\"PerInfo\" >Personal Information</a> | <a href=\"EduInfo\">Education Information</a> | <a href=\"Submit2\">Submit</a><br><br></from>"
        	          +"<form action='Form2'>"
        	          +"<pre style='font-size: 120%'>               PhD Stream                <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>            Graduation Degree            <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>         Post Graduation Degree          <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>              Class X Board              <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>             Class XII Board             <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>          Department(Graduation)         <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>        Department(Post Graduation)      <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
        	          +"<pre style='font-size: 120%'>            University(Graduation)       <input type='text'  name='t1' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>         University(Post Graduation)     <input type='text'  name='t2' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
          		      +"<pre style='font-size: 120%'>           State(Graduation From)        <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
          		      +"<pre style='font-size: 120%'>         State(Post Graduation From)     <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
          		      +"<pre style='font-size: 120%'>          Class X Board Percentage      <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>         Class XII Board Percentage     <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>        Graduation Marks Percentage     <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>      Post Graduation Marks Percentage  <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>                 GATE Score             <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
        		
        		);
        out.println("<input type='button' value='ddddd'>" +
        		"</form>"+"</body>"+"</html>");
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
	out.println("<form action='Submit2' method='post'>");
    out.println(
    		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
    		      +"<div 'id=menu'>"
    	          +"<a href=\"PerInfo\" >Personal Information</a> | <a href=\"EduInfo\">Education Information</a> | <a href=\"Submit2\">Submit</a><br><br></from>"
    	          +"<form action='Form2'>"
    	          +"<pre style='font-size: 120%'>               PhD Stream                <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>            Graduation Degree            <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>         Post Graduation Degree          <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>              Class X Board              <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>             Class XII Board             <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>          Department(Graduation)         <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>        Department(Post Graduation)      <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
    	          +"<pre style='font-size: 120%'>            University(Graduation)       <input type='text'  name='t1' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
      		      +"<pre style='font-size: 120%'>         University(Post Graduation)     <input type='text'  name='t2' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
      		      +"<pre style='font-size: 120%'>           State(Graduation From)        <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
      		      +"<pre style='font-size: 120%'>         State(Post Graduation From)     <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='first'>All</option> <option value='audi'>Audi</option></select></pre>"
      		      +"<pre style='font-size: 120%'>          Class X Board Percentage      <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
      		      +"<pre style='font-size: 120%'>         Class XII Board Percentage     <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
      		      +"<pre style='font-size: 120%'>        Graduation Marks Percentage     <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
      		      +"<pre style='font-size: 120%'>      Post Graduation Marks Percentage  <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
      		      +"<pre style='font-size: 120%'>                 GATE Score             <input type='radio'  name='c1' value='Greater than'>Greater than <input type='radio'  name='c1' value='Equals'>Equals <input type='radio'  name='c1' value='Lesser than'>Lesser than  <input type='text'  name='t1' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
    		
    		);
    out.println("<input type='submit' value='Save'>" +
    		"</form>"+"</body>"+"</html>");

}
}
