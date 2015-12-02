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
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		  PrintWriter out = response.getWriter();
		     
	       String id=new String("1");
	       String docType =   "<!doctype html public \"-//w3c//dtd html 4.0 " +
	    	       "transitional//en\">\n";
	    	       out.println(docType+"<html>"  );
	    	    		   out.println("<head><title>IIIT-Delhi PhD Admissions Filtered Result</title>"+
		
		   "<link type=text/css rel=stylesheet href=http://onlinehtmltools.com/tab-generator/skins/skin6/top.css></script>"+



	    	   "<div class=tabs_holder>\n"+
	    	   "<ul>"+ 
	    	     "<li><a href=#your-tab-id-12><font face = Verdana>Personal Information</font></a></li>\n"+
	    	     "<li><a href=#your-tab-id-13><font face = Verdana>Educational Information</font></a></li>\n"+
	    	    
	    	     

	    
	    	    "</ul><div class=content_holder>\n"+
	    	 
	    	     "<div id=your-tab-id-12>\n");
	    	    			out.println("<form action=\"Filter\" method=\"post\" >");
	    	    	        out.println(
	    	    	        		       "<pre style='font-size: 150%;font-weight:bold;margin:center'>                                           Filter Entries    </pre>"
	    	    	        		      
	    	    	        	          +"<form action='Filter'>"
	    	    	        	          +"<pre style='font-size: 120%'>                  Email    <input type='text'  name='t1' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
	    	    	          		      +"<pre style='font-size: 120%'>                   Name    <input type='text'  name='t2' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
	    	    	          		      +"<pre style='font-size: 120%'>      Enrollment Number    <input type='text'  name='t3' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
	    	    	          		      +"<pre style='font-size: 120%'>               Category    <select name='pap1'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;' value='All'><option value='All'>All</option> <option value='General'>General</option> <option value='OBC'>OBC</option><option value='first'>All</option> <option value='SC'>SC</option><option value='ST'>ST</option></pre>"
	    	    	          		      +"<pre style='font-size: 120%'>                 Gender   <input type='radio'  name='gender' value='Male'>Male   <input type='radio'  name='gender' value='Female'>Female</pre>"
	    	    	          		      +"<pre style='font-size: 120%'>    Physically Disabled   <input type='radio'  name='PhysicallyDisabled' value='Yes'>Yes    <input type='radio'  name='PhysicallyDisabled' value='No'>No</pre>"
	    	    	          		      +"<pre style='font-size: 120%'>          Date Of Birth   <input type='radio'  name='DateOfBirth' value='Before'>Before <input type='radio'  name='DateOfBirth' value='On'>On   <input type='radio'  name='Date Of Birth' value='After'>After</pre>"
	    	    	        		);   out.println("<br><br><input type=submit value=\"Save\"></div></form>");
	    	    	        out.println("</div>"
	    	    	        		+"<div id=your-tab-id-13>\n"+
	    	    	        	"<form action='Filter2' method ='post'>"
        	          +"<pre style='font-size: 120%'>               PhD Stream                <select name='pap10'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value=Computer Science>Computer Science</option>\n"+
	    	      "<option value=Electronics and Communications>Electronics and Communications</option>\n"+
	    	      "<option value=Computational Biology>Computational Biology</option></select></pre>"
        	          +"<pre style='font-size: 120%'>            Graduation Degree            <select name='pap11'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='btech'>B.Tech</option></select></pre>"
        	          +"<pre style='font-size: 120%'>         Post Graduation Degree          <select name='pap12'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='M.TECH'>M.Tech</option></select></pre>"
        	          +"<pre style='font-size: 120%'>              Class X Board              <select name='pap13'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='CBSE'>CBSE</option></select></pre>"
        	          +"<pre style='font-size: 120%'>             Class XII Board             <select name='pap14'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='CBSE'>CBSE</option></select></pre>"
        	          +"<pre style='font-size: 120%'>          Department(Graduation)         <select name='pap15'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='CSE'>CSE</option> <option value='ECE'>ECE</option></select></pre>"
        	          +"<pre style='font-size: 120%'>        Department(Post Graduation)      <select name='pap16'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='ECE'>ECE</option></select></pre>"
        	          +"<pre style='font-size: 120%'>            University(Graduation)       <input type='text'  name='text1' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>         University(Post Graduation)     <input type='text'  name='text2' style='width:600; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;' ></pre>"
          		      +"<pre style='font-size: 120%'>           State(Graduation From)        <select name='pap17'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='Delhi'>Delhi</option></select></pre>"
          		      +"<pre style='font-size: 120%'>         State(Post Graduation From)     <select name='pap18'  style='width:300; height:30;border-radius: 5px;border-color:#D2D2FF;border-style: solid;'><option value='All'>All</option> <option value='Delhi'>Delhi</option></select></pre>"
          		      +"<pre style='font-size: 120%'>          Class X Board Percentage      <input type='radio'  name='c10' value='Greater than'>Greater than <input type='radio'  name='c15' value='Equals'>Equals <input type='radio'  name='c21' value='Lesser than'>Lesser than  <input type='text'  name='t1a' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>         Class XII Board Percentage     <input type='radio'  name='c11' value='Greater than'>Greater than <input type='radio'  name='c16' value='Equals'>Equals <input type='radio'  name='c22' value='Lesser than'>Lesser than  <input type='text'  name='t1b' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>        Graduation Marks Percentage     <input type='radio'  name='c12' value='Greater than'>Greater than <input type='radio'  name='c17' value='Equals'>Equals <input type='radio'  name='c23' value='Lesser than'>Lesser than  <input type='text'  name='t1c' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>      Post Graduation Marks Percentage  <input type='radio'  name='c13' value='Greater than'>Greater than <input type='radio'  name='c18' value='Equals'>Equals <input type='radio'  name='c24' value='Lesser than'>Lesser than  <input type='text'  name='t1d' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
          		      +"<pre style='font-size: 120%'>                 GATE Score             <input type='radio'  name='c14' value='Greater than'>Greater than <input type='radio'  name='c19' value='Equals'>Equals <input type='radio'  name='c25' value='Lesser than'>Lesser than  <input type='text'  name='t1e' style='width:200; height:25;border-radius: 5px;background-color:#D2D2FF;border-style: hidden;'></pre>"
        		
        		);
        out.println("<input type='submit' value='Save'>" +
        		"</form></div>"
        		
        				+ "</div></div>"
    +
	    	   "<script type=text/javascript src=http://code.jquery.com/jquery-1.6.min.js></script>\n"+
	    	   "<script type=text/javascript src=https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.10/jquery-ui.min.js></script>"+
	    	   "<script type=text/javascript src=http://onlinehtmltools.com/tab-generator/skinable_tabs.min.js></script>\n"+
	    	   "<script type=text/javascript>\n"+
	    	    " $('.tabs_holder').skinableTabs({"+
	    	      " effect: 'basic_display',"+
	    	      " skin: 'skin6',"+
	    	       "position: 'top'"+
	    	    " });"+
	    	   "</script></body>"+
  "</html>");
	    	    		   
	    	    		   
	    	    		   
	    	    		   
	    	    		   
	    	    		   
	    	    		   
	    	    	
	    	    
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
