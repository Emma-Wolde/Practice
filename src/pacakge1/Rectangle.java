package pacakge1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
	    Scanner userin =new Scanner(System.in);
	      System.out.println("Enter # of rows");
	      int rows =userin.nextInt();
	      System.out.println("Enter # of columns");
	      int columns =userin.nextInt();
	      System.out.println("Enter your symbol!");
	      String sym = userin.next();
	      
	      for (int r =0; r < rows; r++) {
	    	  
	    	  	for (int c =0; c < columns; c++) {
	    	  		System.out.print(sym);
	    	        
	    	   }
	    	  System.out.println();
	      }
	
	
	
	
	
	
	
	    
	    
	    
	    userin.close();
	}
}
