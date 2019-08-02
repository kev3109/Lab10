package co.grandcircus;

import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {
		//Prompt user to enter radius 
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
		System.out.println("Please enter the Radius: ");
		
		//Display an error if the radius is invalid 
		
		
		//If radius is valid calculate the area and circumference and round to the nearest two decimal places 
		while (!scan.hasNextDouble()) {
			System.out.println("please enter a valid number: ");
			scan.nextLine();
		}
		
		double radius = scan.nextDouble();
		Circle circ = new Circle(radius);		
	
	      System.out.println("The area of circle is: " + circ.getFormattedArea()); 
	      
	      System.out.println( "The circumference of the circle is: "+circ.getFormattedCircumference());
		
		//Ask user if they want to continue 
	      System.out.println("Do you want to continue? y/n");
	      String cont = scan.next();
	      if (!cont.equalsIgnoreCase("Y")) {
	    	  break;
	      }
		}
		
		//if not say goodbye 
		
		System.out.println("Goodbye!");
	}

}
