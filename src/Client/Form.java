package Client;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.stream.*;
import java.util.Map;

@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 int i=100;
     
   
    public Form() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 response.setContentType("text/html");
	
	       PrintWriter out = response.getWriter();
	     
	       String id=new String("1");
	       String docType =   "<!doctype html public \"-//w3c//dtd html 4.0 " +
	    	       "transitional//en\">\n";
	    	       out.println(docType+"<html>"  );
	    	    		   out.println("<head>" +"<style type='text/css'>"+
	    	    			        ".box{"+
	    	    			            "padding: 20px;"+
	    	    			           " display: none;"+
	    	    			            "margin-top: 20px;"+
	    	    			           "border: 1px solid #000;"+
	    	    			       " }"+
	    	    			        ".red{ background: #ff0000; }"+
	    	    			        ".green{ background: #00ff00; }"+
	    	    			        ".blue{ background: #0000ff; }"+
	    	    			   " </style>"+
	    	    			        		" <script type='text/javascript'>"+
	    	    			       " function ShowHideDiv2(chkPassport2) {"+
	    	    			            "var dv2 = document.getElementById('dv2');"+
	    	    			            "dv2.style.display = chkPassport2.checked ? 'block' : 'none';"+
	    	    			       " }"+
	    	    			       "</script>"+
	    	    			            " <script type='text/javascript'>"+
	    	    			       " function ShowHideDiv3(chkPassport3) {"+
	    	    			            "var dv3= document.getElementById('dv3');"+
	    	    			            "dv3.style.display = chkPassport3.checked ? 'block' : 'none';"+
	    	    			       " }"+
	    	    			       "</script>" +
	    	    			            " <script type='text/javascript'>"+
	    	    			       " function ShowHideDiv4(chkPassport4) {"+
	    	    			            "var dv4 = document.getElementById('dv4');"+
	    	    			            "dv4.style.display = chkPassport4.checked ? 'block' : 'none';"+
	    	    			       " }"+

	    	    			    "</script>"+
	    	    			    
	    	    			        		"    <script type='text/javascript'>"+
	    	    			       " function ShowHideDiv1(chkPassport) {"+
	    	    			            "var dv1 = document.getElementById('dv1');"+
	    	    			            "dv1.style.display = chkPassport.checked ? 'block' : 'none';"+
	    	    			       " }"+
	    	    			    "</script>"
	    	    			    + " <link rel='stylesheet' href='http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css' />"+
    
    "<!-- Load jQuery JS -->"+
    "<script src='http://code.jquery.com/jquery-1.9.1.js'></script>"+
   
    "<script src='http://code.jquery.com/ui/1.10.3/jquery-ui.js'></script>"+
    
   
    "<script type='text/javascript'>"+
	"$(document).ready("+
  
  /* This is the function that will get executed after the DOM is fully loaded */
  "function () {"+
    "$( '#datepicker' ).datepicker({"+
      "changeMonth: true,"+
      "changeYear: true"+
    "});"+
  "}"+

");</script>"+
 "</head>"
 + "<body>\n" +


	    	   "<link type=text/css rel=stylesheet href=http://onlinehtmltools.com/tab-generator/skins/skin1/top.css></script>"+



	    	   "<div class=tabs_holder>\n"+
	    	   "<ul>"+ 
	    	     "<li><a href=#your-tab-id-1><font face = Verdana>Personal Information</font></a></li>\n"+
	    	     "<li><a href=#your-tab-id-2><font face = Verdana>Educational Information</font></a></li>\n"+
	    	     "<li><a href=#your-tab-id-3><font face = Verdana>Payment Information</font></a></li>\n"+
	    	     "<li><a href=#your-tab-id-4><font face = Verdana>Feedback</font></a></li>\n"+
	    	     "<li><a href=#your-tab-id-5><font face = Verdana>Submit</font></a></li>\n"+

	    
	    	    "</ul><div class=content_holder>\n"+
	    	 
	    	     "<div id=your-tab-id-1>\n");
	    	    
	    	     

	    	     out.println("<form action =\"Form2\" method = 'post'>\n"
	    	     

	    +"<pre>                  Email*    <input type='email' name='t1' style width='50' height='200'></pre>"
	    +"<pre>                   Name*    <input type='text' name='t2' style width='50' height='200' ></pre>"
	    +"<pre>      Enrollment Number*    <input type='number' name='t3' style width='50' height='200' value="+i+"  readonly></pre>"
	    +"<pre> Add. Of Correspondance*    <input type='text' name='t4' style width='48' height='300'></pre>"
	    +"<pre>                 Mobile*    <input type='number' name='t5'  style Width='50' height='200'></pre>"
	    +"<pre>             PhD Stream*    <input type='radio'name='stream' value='Computer Science'>Computer Science</pre>"
	    +"<pre>                            <input type='radio'name='stream' value='Electronics and Communication'>Electronics and Communication</pre>"
	    +"<pre>                            <input type='radio'name='stream' value='Computational Biology'/>Computational Biology </pre>"
	    +"<pre>  PhD Area Preference 1*    <select name='opt1' width='50'><option value='null'>--------------</option> <option value='Computer Science'>Computer Science</option>\n"+
	    	      "<option value='Electronics and Communications'>Electronics and Communications</option>\n"+
	    	      "<option value='Computational Biology'>Computational Biology</option></select></pre>"
	    +"<pre>  PhD Area Preference 2*    <select name='opt2' width='50'><option value='null'>--------------</option><option value=Computer Science>Computer Science</option>\n"+
	    	      "<option value=Electronics and Communications>Electronics and Communications</option>\n"+
	    	      "<option value=Computational Biology>Computational Biology</option></select></pre>"
	    +"<pre>  PhD Area Preference 3*    <select name='opt3' width='50'><option value='null'>--------------</option> <option value=Computer Science>Computer Science</option>\n"+
	    	      "<option value=Electronics and Communications>Electronics and Communications</option>\n"+
	    	      "<option value=Computational Biology>Computational Biology</option></select></pre>"
	    +"<pre>                 Gender*    <input type='radio'name='sex' value='Male'>Male</pre>"
	    +"<pre>                            <input type='radio'name='sex' value='Female'>Female</pre>"
	    +"<pre>               Category*    <input type='radio'name='ct' value='General'>General</pre>"
	    +"<pre>                            <input type='radio'name='ct' value='OBC'>OBC    <input type='radio'name='ct' value='SC'>SC    <input type='radio'name='ct' value='ST'>ST</pre>"
	    +"<pre>    Physically Disabled*    <input type='radio'name='disable' value='Yes'>Yes    <input type='radio'name='disable' value='No'>No</pre>"
	    +"<pre>                  D.O.B      <input type='text' id='datepicker' name='date' />"
	    +"<pre>     Children/War Widows    <input type='radio'name='war' value='Yes'>Yes    <input type='radio'name='war' value='No'>No<br>"
	    +"    of Defence Personnel<br>"
	    +"         killed/Disabled<br>"
	    +"               in Action</pre>"
	    +"<pre>          Father's Name*    <input type='text' name='t6' style width='50' height='200'></pre>"
	    +"<pre>            Nationality*    <select name='opt4' width='50'><option value=''>--------------</option> <option value='Indian'>INDIA</option><option value='audi'>ITALY</option><option value='audi'>ENGLAND</option><option value='audi'>U.S.A</option></select></pre>"
	    +"<pre>      Permanent Address*    <input type='text' name='t7' style width='50' height='200'></pre>"
	    +"<pre>                Pin Code    <input type='text' name='t8' style width='50' height='200'></pre>");
//out.println("method=get>");
out.println("<input type=submit value=\"Save\">");
	
out.println("</form>"+
	    	   

	    	      "</div>\n"+
	    	   
	    	      
	    	      
	    	      
	    	      
	    	      
	    	      
	    	      
	    	      
	    	      
	    	   "<div id=your-tab-id-2>\n"+
	    	 
	    	   
	    	      "<form action =\"Form3\" method = post>\n"+
	    	      "<pre><h3> <ins>Schooling Information </ins></h3><pre>"
      		    +"<pre>                Xth Board*     <input type='text' name='t10' style width='50' height='200' required></pre>"
      		    +"<pre>            Xth Marks (%)*     <input type='text' name='t11' style width='50' height='200'required></pre>"
      		    +"<pre>      Year of Passing Xth*     <select name='opt5' width='50'><option value='null'>2015</option><option value='null'>2014</option> <option value='2015'>2015</option></select></pre>"
      		    +"<pre>              XIIth Board*     <input type='text' name='t12' style width='50' height='200' required></pre>"
      		    +"<pre>              XIIth Board*     <input type='text' name='t13' style width='50' height='200' required></pre>"
      		    +"<pre>    Year of Passing XIIth*     <select name='opt6' width='50'><option value='null'>2015</option> <option value='2015'>2015</option></select></pre>"
      		    +"<pre><h3> <ins>Graduation Information </ins></h3><pre>"
      		    +"<pre>                   Degree*     <input type='text' name='t14' style width='50' height='200' required></pre>"
      		    +"<pre>    Department/Discipline*     <input type='text' name='t15' style width='50' height='200' required></pre>"
      		    +"<pre>          Name of College*     <input type='text' name='t16' style width='50' height='200' required></pre>"
      		    +"<pre>       Name of University*     <input type='text' name='t17' style width='50' height='200' required></pre>"
      		    +"<pre>                     City*     <input type='text' name='t18' style width='50' height='200' required ></pre>"
      		    +"<pre>                    State*     <select name='opt7' width='50'><option value='Delhi'>Delhi</option> <option value='Bihar'>Bihar</option></select></pre>"
      		    +"<pre>       Year of Graduation*     <select name='opt8' width='50'><option value='2015'>2015</option> <option value='2015'>2015</option><option value=2013>2013</option><option value=2012>2012</option><option value=2011>2011</option><option value=2010>2010</option></select></pre>"
      		    +"<pre>            CGPA OR MARKS?    <input type='radio' name='mc' value='CGPA'>CGPA<br>"
      		    +"                               <input type='text' name='t20' style width='50' height='200'> / <select name='opt9' width='50'><option value='null'>------</option> <option value='2015'>4</option></select><br>"
      		    +"                              <input type='radio' name='mc' value='MARKS'>MARKS(%)<br>"
      		    +"                               <input type='text' name='t21' style width='50' height='200'></pre>"
      		    +"<pre>                    <input type='checkbox' id='chkPassport' name='aecephd' onclick='ShowHideDiv1(this)' />Are you applying for ECE PhD? </pre>"
      		    +"      <div id='dv1' style='display: none'>ECE PhD Subject Preference<hr><br><b>" +
      		    "You are required to select 4 subjects if you are an under-graduate otherwise you need to fill 3." +
      		    "<pre>  Preference 1*         <select name='e1' width='50'><option value='null'>-----</option> <option value='Advanced Signal Processing'>Advanced Signal Processing</option></select></pre>" +
      		    "<pre>  Preference 2*         <select name='e2' width='50'><option value='null'>-----</option> <option value='Advanced Signal Processing'>Advanced Signal Processing</option></select></pre>" +
      		    "<pre>  Preference 3*         <select name='e3' width='50'><option value='null'>-----</option> <option value='Advanced Signal Processing'>Advanced Signal Processing</option></select></pre>" +
      		    "<pre>  Preference 4*         <select name='e4' width='50'><option value='null'>-----</option> <option value='Advanced Signal Processing'>Advanced Signal Processing</option></select></pre>" +
      		    "</b></div><pre>                 <input type='checkbox' name='completedpg' id='chkPassport2' onclick='ShowHideDiv2(this)' />Have you completed your Post Graduation?  </pre>"
      		   
      		    +"      <div id='dv2' style='display: none'>Post - Graduation Information<hr><br><b>" +
      		    "<pre>	    Name of College          <input type='text' name='e5' style width='50' height='200' ></pre>" +
      		    "<pre>	               City          <input type='text' name='e6' style width='50' height='200'></pre>" +
      		    "<pre>	              State          <select name='e7' width='50'><option value='null'>----------</option> <option value='delhi'>Delhi</option></select></pre>" +
      		    "<pre>      Department/Discipline          <input type='text' name='e8' style width='50' height='200'></pre>" +
      		    "<pre>	             Degree          <input type='text' name='e9' style width='50' height='200'></pre>" +
      		    "<pre>	       Thesis Title          <input type='text' name='thesis' style width='50' height='200'></pre>" +
      		    "<pre>  Year of Post-Graduation*       <select name='e10' width='50'><option value='null'>2015</option> <option value='2015'>2015</option><option value=2013>2013</option><option value=2012>2012</option><option value=2011>2011</option><option value=2010>2010</option></select></pre>" 
      		    +"<pre>              CGPA OR MARKS?    <input type='radio' name='mm' value='CGPA'>CGPA<br>"
      		    +"                               <input type='text' name='e11' style width='50' height='200'> / <select name='opt9' width='50'><option value='null'>------</option> <option value='2015'>4</option></select><br>"
      		    +"                              <input type='radio' name='mm' value='MARKS'>MARKS(%)<br>"
      		    +"                               <input type='text' name='e12' style width='50' height='200'></pre>"
      		    +"</b></div>" +
      		    " <pre><h4>                                <input type='checkbox' id='chkPassport3' name='otherdegree' onclick='ShowHideDiv3(this)' />Other Academic Degrees? </h4></pre>" +
      		    " <div id='dv3' style='display: none'>Other Academic Degrees<hr><br><b>" +
      		    "<pre>	    Exam Name          <input type='text' name='e13' style width='50' height='200' ></pre>" +
      		    "<pre>	    Subject          <input type='text' name='e14' style width='50' height='200' ></pre>" +
      		    "<pre>  Year*       <select name='e15' width='50'><option value='2015'>2015</option> <option value='2014'>2014</option><option value=2013>2013</option><option value=2012>2012</option><option value=2011>2011</option><option value=2010>2010</option></select></pre>" +
      		    "<pre>	    Score          <input type='text' name='e16' style width='50' height='200' ></pre>" +
      		    "<pre>	    Rank          <input type='text' name='e17' style width='50' height='200' ></pre>" +
      		    "</div>" 
      		    +"                  <input type='checkbox' id='chkPassport4' name='gate' onclick='ShowHideDiv4(this)' />Taken GATE Exam?  </h4></pre><br>"+
      		    " <div id='dv4' style='display: none'>Other Academic Degrees<hr><br><b>" +
      		    "<pre>	    Area         <input type='text' name='e18' style width='50' height='200' ></pre>" +
      		    "<pre>  Year of Graduation*       <select name='e19' width='50'><option value='null'>2015</option> <option value='2015'>2015</option><option value=2013>2013</option><option value=2012>2012</option><option value=2011>2011</option><option value=2010>2010</option></select></pre>" +
      		    "<pre>	    Marks(out 0f 100)          <input type='text' name='e20' style width='50' height='200' ></pre>" +
      		    "<pre>	    Score          <input type='text' name='e21' style width='50' height='200' ></pre>" +
      		    "<pre>	    Rank          <input type='text' name='e22' style width='50' height='200' ></pre>" +
      		    "</div>" 
      		    
      		    +"<pre><h3> <ins>Achievements, CV and Statement of Purpose </ins></h3></pre>"
      		    +"<pre><h5>       Achievements (Other   <input type='text' name='t22' style width='50' height='200'><br>"
      		    +"       information like<br>"
      		    +"       ranks,medals etc.)</h5></pre>"
      		    
      		    );
              	     

             		 out.println("Select RESUME File:<input type='file' name='fname'/> <input type='submit' value='upload'/>");
                      out.println("<br>");
                   out.println("Select SOP File:   <input type='file' name='fname'/> <input type='submit' value='upload'/>");
                      out.println("<br>");
                      out.println("<br><br><input type=submit value=\"Save\">"+
                      

   	
"</form>"+
"</div>"+















	    	     "<div id=your-tab-id-3>\n"+

   
    "<form action='Form1' method='post'>"
    +" <textarea name='message' rows='1' cols='100' readonly> You can pay the application fee of INR 350 online using Credit/Debit card or NetBanking.</textarea><br><br>"
    +"<input type=submit value=\"Pay Using Debit/Credit Card or Net Banking\"></div><div id=your-tab-id-4>\n"  
   
    +"<form action='Submitinfo' method='post'>"
    +"<fieldset>"
    +"<pre><h3>Please complete and save all the fields before you click the submit button.<br>"
    +"Once you have submitted you will not be able to edit any field.<br></h3><br>");
                      i++;
    out.println("<input type=submit value=\"Submit\"></pre>"
    +"</fieldset></div>"
    +
	    	   "<script type=text/javascript src=http://code.jquery.com/jquery-1.6.min.js></script>\n"+
	    	   "<script type=text/javascript src=https://ajax.googleapis.com/ajax/libs/jqueryui/1.8.10/jquery-ui.min.js></script>"+
	    	   "<script type=text/javascript src=http://onlinehtmltools.com/tab-generator/skinable_tabs.min.js></script>\n"+
	    	   "<script type=text/javascript>\n"+
	    	    " $('.tabs_holder').skinableTabs({"+
	    	      " effect: 'basic_display',"+
	    	      " skin: 'skin1',"+
	    	       "position: 'top'"+
	    	    " });"+
	    	   "</script></body>"+
  "</html>");
	    	      
	    	     
	}

	
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
	}*/

}