package com.rays.ios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class InputReader {
public static void main(String[] args ) throws Exception  {
	try(FileReader f = new FileReader("C:\\\\Users\\\\ACER\\\\Documents\\\\demo.txt")){
	
	 int ch= f.read();
	 while(ch!=-1) {

		System.out.println((char) ch);
ch=f.read();
	 
//f.close();
	 }
	}catch(IOException e) {
		 e.printStackTrace();
	 }

	
	
 	/*BufferedReader br = new BufferedReader(f);
	 String line  = br.readLine();
	 while(line != null) {
		 System.out.println(line);
		 line =br.readLine();
	 }*/
 }

}
