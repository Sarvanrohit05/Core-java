package com.rays.ios;

import java.io.FileWriter;
import java.io.PrintWriter;
//import java.io.IOException;
import java.io.FileNotFoundException;


public class FileWriteS {
public static void main(String[] args) throws Exception  {
	//FileWriter fw = new FileWriter("C:/rohit.txt");
	PrintWriter pw = new PrintWriter("C:\\Users\\ACER\\Documents\\demo.txt");
	
	pw.write("RohitRajput"); 
	pw.close();
	System.out.println("done");
    
	}
}

