package CS121;

import java.util.Scanner;

public class PaintCalculator {

	public static void main(String[] args) {
		
		//create and initialize the scanner as well as all the variables I will use
		Scanner scanner = new Scanner(System.in);
		int length = 0;
		int width = 0;
		int height = 0;
		double paintRequired = 0.0;
		int totalSq = 0;
		String name = "";
		
		//title and credits:
		System.out.println("Paint Calculator Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line for my program
		System.out.println("This program will calculate the number of gallons of paint required to paint a room.");
		System.out.println("You will enter the length, width, and height of the room in feet (as integers) and then the Customer's Name.");
		System.out.println();
		
		//getting all the inputs from the user
		System.out.print("Enter the length of the room in feet: ");
		length = scanner.nextInt();
		System.out.print("Enter the width of the room in feet: ");
		width = scanner.nextInt();
		System.out.print("Enter the height of the room in feet: ");
		height = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the Customer's Name: ");
		name = scanner.nextLine();
		System.out.println();
				
		//calculation for the square footage
		totalSq = ((length * height)*2) + ((width * height)*2);
		
		
		//calculating the gallons of paint
		paintRequired = totalSq/400.0;
		
		//printing all the outputs
		System.out.println("Output");
		System.out.println("Customer's name: " + name);
		System.out.println("Length of the room in feet: " + length + " ft");
		System.out.println("Width of the room in feet: " + width + " ft");
		System.out.println("Height of the room in feet: " + height + " ft");
		System.out.println("The square footage is: " + totalSq + " sq ft");
		System.out.println("The number of gals paint required is: " + paintRequired);
		System.out.println();
		System.out.println("Note: 1 gallon of paint will cover 400 sq ft");
		
		//closing scanner
		scanner.close();
		

	}//end of main

}//end of file
