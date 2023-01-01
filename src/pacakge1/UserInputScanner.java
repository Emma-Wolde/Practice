package pacakge1;

import java.util.Scanner;

public class UserInputScanner {
	String temp;
	public static void main(String[] args) {
		
		//Exercise 1: Swap Variables

		String aw = "water";
		String bg = "gas";
		System.out.println(" aw :"+aw+ " and bg : "+bg);
		String temp = aw;
		aw =bg;
		bg =temp;
		System.out.println(); // for  new line
		System.out.println(" After the Swap \n"); // \n is for new line println()
		
		
		System.out.println(" aw is  :"+aw+" and bg is : "+bg);
		System.out.println("\n"); // skip two line 
		 
		// Exercise 2: User Input using Scanner Class
		
		// TODO Auto-generated method stub
		Scanner sca =new Scanner(System.in);
		System.out.println("What Is your name?");
		String name = sca.nextLine();
		System.out.println("How old are you?");
		int age=sca.nextInt();
		sca.nextLine();
		System.out.println("What is your fav food?");
		String food = sca.nextLine();
		
		System.out.println("Hello, "+name);
		System.out.println("You are "+age+" years old.");
		System.out.println("Your Favourite foodo is "+food+" .");
		sca.close();
		
		
	}
	

}
