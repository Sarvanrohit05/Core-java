package com.rays.ios;
import java.io.FileWriter;
//import java.io.IOException;
import java.io.FileNotFoundException;

public class practise {
	

	



	public static void main(String[] args) throws Exception  {
		FileWriter fw = new FileWriter("C:/rohit.txt");
		//PrintWriter pw = new PrintWriter(fw);
		
		fw.write("RohitRajput"); 
		fw.close();
		System.out.println("done");
	    
		}
	}




