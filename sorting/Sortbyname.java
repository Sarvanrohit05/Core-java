package sorting;

import java.util.Comparator;



public class Sortbyname implements Comparator<Markshit>{

	@Override
	public int compare(Markshit o1, Markshit o2 ) {
	
 return(o2.getFname().compareTo(o1.getFname()));
			
		
		
	}

	}
		
    	 
     

