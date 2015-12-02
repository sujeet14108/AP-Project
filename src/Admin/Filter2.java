package Admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Filter2
 */
@WebServlet("/Filter2")
public class Filter2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Filter2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    String t1,t2,t3,pap1,gender,PhysicallyDisabled,DateOfBirth,pap10,pap11,pap12,pap13,pap14,pap15,pap16,pap17,text1,text2,pap18,c10,c11,c12,c13,c14,
    c16,c22,c19,c25,c20,c24,c18,c17,c23,t1e;
    String t1a,c15,c21,t1b,t1c,t1d;
	private int check(String line) throws ParseException
    {
    	System.out.println("mjjjjjjjjjjjjjjjjjjjjjjjjjjjjjuu");
    	String[] c = line.split(",");
    	System.out.println(c[1]);
    	System.out.println("muuhh");
    	if(!t1.isEmpty())							//email
    	{System.out.println("muu0000000000000000000000000000000000000000000000000"+             c[0]);
    	System.out.println(t1);
    		if(!c[0].equals(t1))
    			return 0;
    	}
    	
    	System.out.println("duu");
    	
    	if(!t2.isEmpty())							//name
    	{	System.out.println(t2+",");
    	System.out.println(c[1]+",");
    		if(!c[1].equals(t2))
    			return 0;
    	}
    	System.out.println("ppduu");
    	
    	
    	if(!t3.isEmpty())							//enrollment number
    	{	
    		if(!c[2].equals(t3))
    			return 0;
    	}
    	
    	System.out.println("luu");
    	if(!pap1.equals("All"))							//category
    	{System.out.println(pap1);
    	System.out.println(c[10]);
    		if(!c[10].equals(pap1))
    			return 0;
    	}
    	
    	System.out.println("oooduu");
    	
    	
    	if(gender!=null)							//Gender
    	{	//RadioButton chk = (RadioButton)gender.getSelectedToggle();
    	
    		if(!c[9].equals(gender))
    			return 0;
    	}
    	System.out.println("iioooduu");
    	
    	if(PhysicallyDisabled!=null)							//Physically disabled
    	{	//RadioButton chk = (RadioButton)p_disable.getSelectedToggle();
    	
    		if(!c[11].equals(PhysicallyDisabled))
    			return 0;
    	}
    	System.out.println("suu");
    	
    	
    	
  /*  
    if(DateOfBirth!=null)									//DOB
    	{	//RadioButton chk = (RadioButton)dob.getSelectedToggle();
    	
    	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    	//String formattedValue = (DateOfBirth).format(formatter);
    		DateFormat format3 = new SimpleDateFormat("MM/dd/yyyy");
    	Date dat2 = format3.parse(DateOfBirth);
    		
    	DateFormat format2 = new SimpleDateFormat("yyyy/MM/dd");
    		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    		Date dat = format.parse(c[12]);
    	
    		System.out.println("nnn");/*
    		
    /*		dat2=new SimpleDateFormat("yyyy/MM/dd").format(dat2);	
    		
    		Date date = format2.parse(formattedValue);
    		
    		
    		
    		System.out.println("nnn"+chk.getText());
        	    
    		if(chk.getText().equals("On"))
    			if(!dat.equals(date)){
            		System.out.println("Date1 is equal Date2");
            		return 0;
            	}
    		
    		if(chk.getText().equals("Before"))
    			if(!dat.before(date)){
            		System.out.println("Date1 is before Date2");
            		return 0;
            	}
    		if(chk.getText().equals("After"))
    		{	System.out.println("inside"+dat+" fffff "+date);
        			if(!dat.after(date)){
                		System.out.println("Date1 is before Date2");
                		return 0;
                	}
    		}		
    		
    	}
    	*/
    	System.out.println("nuu");
    	if(!pap10.equals("All"))									//Phd Stream
    	{ //System.out.println(pap10);
    		if(!c[5].equals(pap10))
    			return 0;
    	}
    	
    	System.out.println("kkone");
    	if(!pap11.equals("All")	)						//graduation Degree
    	{
    		if(!c[24].equals(pap11))
    			return 0;
    	}
    	
    	System.out.println("pppne");
    	if(!pap12.equals("All")	)						//PG Degree
    	{
    		String[] d = c[33].split(";");
    		if(!d[4].equals(pap12))
    			return 0;
    				
    	}
    	
    	System.out.println("lllle");
    	if(!pap13.equals("All"))							//Xth board
    	{
    		if(!c[18].equals(pap13))
    			return 0;
    	}
    	System.out.println("lllle");
    	if(!pap14.equals("All"))							//XIIth Board
    	{
    		if(!c[21].equals(pap14))
    			return 0;
    	}
    	System.out.println("aaaalle");
    	if(!pap15.equals("All")	)						//Department
    	{
    		if(!c[25].equals(pap15))
    			return 0;
    	}
    	System.out.println("quu"+pap16+" "+c[33]);
    	
    	if(!pap16.equals("All"))							//PG Department
    	{
    		String[] d = c[33].split(";");
    		if(!d[3].equals(pap16))
    			return 0;
    				
    	}
    	System.out.println("nouu");
    	
    	if(!text1.isEmpty())							//graduation university
    	{
    		if(!c[27].equals(text1))
    			return 0;
    	}
    	System.out.println("ouu");
    	System.out.println("llouu");
    	System.out.println(text2+"i"+"i");
    	
    	
    	if(!text2.isEmpty())							//PG university
    	{	if(text2!="All")	{
    		String[] d = c[33].split(";");
    		if(!d[0].equals(text2))
    			return 0;
    				}
    	}
    	System.out.println("kooouu");
    	
    	if(!pap17.equals("All"))							//State
    	{
    		if(!c[29].equals(pap17))
    			return 0;
    	}
    	
    	if(!pap18.equals("All")	)						//PG State
    	{String[] d = c[33].split(";");
    		if(!d[3].equals(pap18))
    			return 0;
    	}
    	///System.out.println("c10"+c10.length()+"heyS");
    	System.out.println("ouu");
    	
    	
    	System.out.println("gouu"+ c[18] );
    	int tem=0;

    	if((c10!=null&& (Integer.parseInt(t1a) < Integer.parseInt(c[18]))))
    	{System.out.println("1ouu");
    		 		tem= 1;
    			   		
    	}
    	System.out.println("gouuiii" );
    	//System.out.println("gouu"+ c[18] );
    	//System.out.println("gouu"+ c[19] );
    	//System.out.println("gouu"+ Integer.parseInt(t1a)+Integer.parseInt(c[18]) );
    	if(c15!=null && (Integer.parseInt(t1a) ==Integer.parseInt(c[18])))
    	{System.out.println("2ouu");
    		tem= 1;			   		
    	}
    	System.out.println("gggouu");
    	if(c21!=null && (Integer.parseInt(t1a) >Integer.parseInt(c[18])))
    	{System.out.println("3ouu");
    		tem= 1;
    			   		
    	}
    	System.out.println("pppppppppppppppppp");
    	
    	
    	if(tem==0 && (c10!=null || c15!=null || c21!=null))
    		{System.out.println("uu"+c21.equals("Lesser than") +c15.equals("Equals")+c10.equals("Greater than"));
    		return 0;
    		}
    	System.out.println("cxznnmnxznmzxcnmxzn");
    	//System.out.println("juu"+L_1.isSelected()+E_1.isSelected()+G_1.isSelected());

    	
    	
    	
    	tem=0;
    	System.out.println("gouu"+ c[21] );
    	System.out.println("gouu"+ c[22] );
    	if(c11!=null && Integer.parseInt(t1b) <Integer.parseInt(c[21]))
    	{
    		 		tem= 1;
    			   		
    	}
    	if(c16!=null && Integer.parseInt(t1b) ==Integer.parseInt(c[21]))
    	{
    		tem= 1;			   		
    	}
    	if(c22!=null && Integer.parseInt(t1b) >Integer.parseInt(c[21]))
    	{
    		tem= 1;
    			   		
    	}
    	if(tem==0 &&( c11!=null || c16!=null || c22!=null))
    		return 0;
    	
    	

    	System.out.println("pouu"+ c[30] );
    	System.out.println("pouu"+ c[31] );
    	
    	String s;
    	  if(c[44]!=""){
    	    	s="0";
    	    	
    	    }else{
    	if(c[30].charAt(0)=='C'){
    		
    		s=c[30].substring(5,6)+"0";
    	}
    	else{
    		
    		s=c[30].substring(6);
    	}}
    	
    	System.out.println("myyyyy"+s );
    	
    	tem=0;
    	if(c12!=null && Integer.parseInt(t1c) <Integer.parseInt(s))
    	{
    		 		tem= 1;
    			   		
    	}
    	if(c17!=null && Integer.parseInt(t1c) ==Integer.parseInt(s))
    	{
    		tem= 1;			   		
    	}
    	if(c23!=null && Integer.parseInt(t1c) >Integer.parseInt(s))
    	{
    		tem= 1;
    			   		
    	}
    	if(tem==0 && (c12!=null || c17!=null || c23!=null))
    		return 0;
    	
    	
    	System.out.println("juu");
    	//System.out.println("juu"+c[44]);
    if(c[44]!=""){
    	s="0";
    	
    }else{
    	if(c[44].charAt(0)=='C'){
    		
    		s=c[30].substring(5,6)+"0";
    	}
    	else{
    		
    		s=c[30].substring(6);
    	}}
    	
    	tem=0;
    	
    	if(c13!=null && Integer.parseInt(t1d) <Integer.parseInt(s))
    	{
    		 		tem= 1;
    			   		
    	}
    	if(c18!=null && Integer.parseInt(t1d) ==Integer.parseInt(s))
    	{
    		tem= 1;			   		
    	}
    	if(c24!=null && Integer.parseInt(t1d) >Integer.parseInt(s))
    	{
    		tem= 1;
    			   		
    	}
    	if(tem==0 && (c13!=null || c18!=null || c24!=null))
    		return 0;
    	
    	
    	System.out.println("juu");
    	
    	System.out.println("kuuuuuuuuu"+c[55]);
    	//String[] d = c[33].split(";");
    	tem=0;
    	if(c14!=null && Integer.parseInt(t1e) <Integer.parseInt(c[55]))
    	{
    		 		tem= 1;
    			   		
    	}
    	if(c19!=null && Integer.parseInt(t1e) ==Integer.parseInt(c[55]))
    	{
    		tem= 1;			   		
    	}
    	if(c25!=null && Integer.parseInt(t1e) >Integer.parseInt(c[55]))
    	{
    		tem= 1;
    			   		
    	}
    	if(tem==0 && (c14!=null || c19!=null || c25!=null))
    		return 0;
    	
    	
    	
    	/*
    	
    	//System.out.println("ppppouu  "+c[38] +" "+app_date_from.getValue());
    	
    	if(app_date_from.getValue()!=null)
    	{
    		System.out.println("oo");
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        	String formattedValue = (app_date_from.getValue()).format(formatter);
        	System.out.println("oo");
        
        	
        	DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        		System.out.println("oo");
        		System.out.println(c[38]);
        		Date dat = format.parse(c[38]);
        		System.out.println("oo");		
        	       		
        	
        		
        		
        		Date date = format.parse(formattedValue);
        		System.out.println("oo"+dat+"  "+date);
        		if(!dat.after(date)){
            		//System.out.println("Date1 is before Date2");
            		return 0;
    	}
    	}
    	System.out.println("ppppouu"+c[38]);
    	if(app_date_upto.getValue()!=null)
    	{
    		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        	String formattedValue = (app_date_upto.getValue()).format(formatter);
        		
        		DateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        		Date dat = format.parse(c[38]);
        	       		
        		Date date = format.parse(formattedValue);
    		
        		if(!dat.before(date)){
            		
            		return 0;
    	}
    	}
    	
    	
    	//System.out.println("done");
    		*/
    	//data.add(new table_record(c[2],c[1]));
    	System.out.println("Ccccccccccccccccccc");
    	System.out.println("done");
    	return 1;
    
    }
	


    
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
		

			//	br = new BufferedReader(new FileReader("D://100.txt"));
				HttpSession s=request.getSession(true);
				
			t1=(String) s.getAttribute("t1");
				 t2=(String) s.getAttribute("t2");
			 t3=(String) s.getAttribute("t3");
			pap1=(String) s.getAttribute("pap1");
				gender=(String) s.getAttribute("gender");		
				PhysicallyDisabled	=(String) s.getAttribute("PhysicallyDisabled");
				DateOfBirth=(String) s.getAttribute("DateOfBirth");
						pap10=request.getParameter("pap10");
						pap11=request.getParameter("pap11");
						pap12=request.getParameter("pap12");
						pap13=request.getParameter("pap13");
						pap14=request.getParameter("pap14");
						pap15=request.getParameter("pap15");
						pap16=request.getParameter("pap16");
						pap17=request.getParameter("pap17");
						pap18=request.getParameter("pap18");
						text1=request.getParameter("text1");
						text2=request.getParameter("text2");c10=request.getParameter("c10");
						
						c11=request.getParameter("c11");
						c12=request.getParameter("c13");
						c14=request.getParameter("c14");
						
						c13=request.getParameter("c13");
						c17=request.getParameter("c17");
						c18=request.getParameter("c18");
						c19=request.getParameter("c19");
						c20=request.getParameter("c20");
						c23=request.getParameter("c23");
						
						c24=request.getParameter("c24");
						c25=request.getParameter("c25");
						
						
						c16=request.getParameter("c16");
						c22=request.getParameter("c22");
						
						c15=request.getParameter("c15");
						c21=request.getParameter("c21");
						t1a=request.getParameter("t1a");
						t1b=request.getParameter("t1b");
						t1c=request.getParameter("t1c");
						t1d=request.getParameter("t1d");
						t1e=request.getParameter("t1e");
	
						 
					
					
						  //  /	System.out.println("suu");
						    	
						    	
						       
						        BufferedReader br = null;
						        BufferedWriter bw =null;
						    	File f = new File("D:/q.txt");
						    	File f1 = new File("D:/101.txt");

						    	try  
						    	 {
						    		
						    		br = new BufferedReader(new FileReader(f));
						    	  
						    	
						             bw = new BufferedWriter(new FileWriter(f1));

						    		String line;
						       	   while ((line = br.readLine()) != null) 
						    	   {System.out.println(line);
						    		   
						    	  		
						    	   		
						    	   	if(check(line)==1)
						    	   	{
						    	   		System.out.println(line);
						    	   		line=line+"\n";
						    	   		bw.write(line);
						    	   	
						    	   	}
						    	   	
						    	   } 
						    	   br.close();
						    	   bw.close();
						    	   System.out.println("pone");
						    	  // record.setContent(record());
						    	   System.out.println("done");
						    	/*   Parent parent=FXMLLoader.load(getClass().getResource("/admin/FilteredResult.fxml"));
						   		Scene scene =new Scene(parent);
						   		Stage stage=(Stage)((Node)e.getSource()).getScene().getWindow();
						   		stage.setScene(scene);
						   		stage.show();
						   		*/
						    	 }
						    	catch(IOException e1)
						    	{System.out.println("error");
						    		e1.printStackTrace();
						    	} catch (ParseException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						
						    	System.out.println(t1);
								System.out.println(t2);
						   
	
						    
						
		  
				
			
			
		}
}
	
