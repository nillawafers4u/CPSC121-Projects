package CS121;

import java.util.Scanner;

public class PointToLineDistance {

	public static void main(String[] args) {
		//Declaring scanner object
		Scanner scanner = new Scanner(System.in);
		
		//Creating and initializing variables
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double x = 0.0;
		double y = 0.0;
		double result = 0.0;
				
		//Title and credits:
		System.out.println("Point to Line Calculator Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
				
		//Instructions for the user
		System.out.println("This program will find the distance from a point to a line.");
		System.out.println("You will enter a point in the form (x,y)");
		System.out.println("You will be asked for the values of A, B, C from the equation in the form:");
		System.out.println("Ax + By + C = 0");
		System.out.println();
		
		//User input
		System.out.print("Enter the Value for A: ");
		a = scanner.nextDouble();
		System.out.print("Enter the Value for B: ");
		b = scanner.nextDouble();
		System.out.print("Enter the Value for C: ");
		c = scanner.nextDouble();
		System.out.print("Enter the Value for X: ");
		x = scanner.nextDouble();
		System.out.print("Enter the Value for Y: ");
		y = scanner.nextDouble();
		System.out.println();
		
		//Calculations
		// |Ax + By + C| / Sqrt Asq + Bsq
		result = ((a*x) + (b*y) + c) / (Math.sqrt((a*a) + (b*b)));
		
		
		//Output
		System.out.println("The line that you entered was: " + a + "x" + " + " + b + "y" + " + " + c + " = 0");
		System.out.println("and the point was: (" + x + ", " + y + ")");
		System.out.println();
		System.out.println("The distance from the point to the line is: " + result + " Units");
		
		//close scanner
		scanner.close();
	}//end of main

}//end of file
