package CS121;

import java.util.Scanner;

public class For_Loop_Numbers {

	public static void main(String[] args) {
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		int num1 = 0;
		int num2= 0;
		
		//Credits
		System.out.println("Number Brief Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This program will ask you for a range of numbers.");
		System.out.println("You will then see the Number, Square, Cube, and SQ root of all the numbers in the specified range.");
		System.out.println();
		
		//user Inputs
		System.out.print("Please enter your starting number: ");
		num1 = scanner.nextInt();
		System.out.print("Please enter your ending number: ");
		num2 = scanner.nextInt();
		System.out.println();
		
		//setting up the table
		System.out.printf("%10s", "Number");
		System.out.printf("%10s", "Square");
		System.out.printf("%10s", "Cubed");
		System.out.printf("%10s", "SQ Root");
		System.out.println();
		
		//for loop that runs our calculations and prints output
		for(int i = num1; i <= num2; i++) {
			
			System.out.printf("%10d", i);
			System.out.printf("%10d", i*i);
			System.out.printf("%10d", i*i*i);
			System.out.printf("%10.4f", Math.sqrt(i));
			System.out.println();
		}
			
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file
