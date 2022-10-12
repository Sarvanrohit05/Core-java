package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Testmarkshit {
public static void main(String[] args) {
	

	Markshit m1= new Markshit();
		
		m1.setRollno("12");
		m1.setFname("radha");
		m1.setLname("sinha");
		m1.setPhycics(87);
		m1.setChemistry(75);
		m1.setMath(56);
		
		Markshit m2 = new Markshit();
		m2.setRollno("15");
		m2.setFname("rahul");
		m2.setLname("tripathi");
		m2.setPhycics(67);
		m2.setChemistry(84);
		m2.setMath(45);
		
		Markshit m3= new Markshit();
		m3.setRollno("67");
		m3.setFname("sanjiv");
		m3.setLname("kumar");
		m3.setPhycics(89);
		m3.setChemistry(56);
		m3.setMath(54);
	
	ArrayList s= new ArrayList<>();
	   s.add(m1);
	   s.add(m2);
	   s.add(m3);
	   
	  Collections.sort(s);
	   Iterator it=s.iterator();
	   
	   while(it.hasNext()) {
		   Markshit r=(Markshit)it.next();
		   System.out.println(r.getRollno()+" "+r.getFname()+" "+r.getLname()+" "+r.getPhycics()+" "+r.getChemistry()+" "+r.getMath());
	   }
	   
	} 

	
	
}

