package CS121;

import java.util.Scanner;

public class QuadraticSolver {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double x1 = 0.0;
		double x2= 0.0;

		
		//Credits
		System.out.println("Quadratic Equation Solving Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This program will solve a quadtratic equation using the quadratic formula.");
		System.out.println("You will enter the values for a, b, and c from the equation in the form of:");
		System.out.println("ax^2 + bx + c = 0");
		System.out.println();
		
		//user Inputs
		System.out.print("Please enter a: ");
		a = scanner.nextDouble();
		System.out.print("Please enter b: ");
		b = scanner.nextDouble();
		System.out.print("Please enter c: ");
		c = scanner.nextDouble();
		System.out.println();
		System.out.println("Solution: ");
		
		//Calculations and output
		
		if((b*b-4*a*c) > 0) {
			//do both calculations
			x1 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a);
			x2 = (-b - Math.sqrt(b*b-4*a*c)) / (2*a);
			//print results
			System.out.println("X = " + x1);
			System.out.println("OR");
			System.out.println("X = " + x2);
		}
		
		if((b*b-4*a*c) == 0) {
			//do one calculation
			x1 = (-b + Math.sqrt(b*b-4*a*c)) / (2*a);
			
			//print result
			System.out.println("X = " + x1);
		}
		 
		if((b*b-4*a*c) < 0) {
			//not real, no calculation
			System.out.println("There is no real solution to this problem!");
		}

	
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file

