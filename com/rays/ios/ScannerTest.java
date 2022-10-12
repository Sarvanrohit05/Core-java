package com.rays.ios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class ScannerTest {
public static void main(String[] args) throws Exception  {
	FileReader f = new FileReader("c:/rohit.txt");
      Scanner sc = new  Scanner(f);
      while(sc.hasNext()) {
    	  String line=sc.nextLine();
    	  System.out.println(line);
      }
    	  

}
}
