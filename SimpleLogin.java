package CS121;

import java.util.Scanner;

public class SimpleLogin {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		int pin = 0;
		int correct_pin = 1234;
		String name = "Jonah";

		
		//Credits
		System.out.println("Pin Login Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println();
		
		//user Inputs
		System.out.print("Please enter your 4 digit pin: ");
		pin = scanner.nextInt();
		
		//Calculations
		if(pin == 123456) {
			System.out.println("Welcome Mr. Spock");
			System.exit(0);
		}
		
		if(pin == correct_pin) {
			System.out.println("Welcome Back " + name);
		}
		
		if(pin != correct_pin) {
			System.out.println("Danger Danger Will Robertson");
		}
		
		if(pin >= 0 && pin < 5000) {
			System.out.println("Value is less than 5000");
		}
		
		if(pin < 7500 && pin >= 5000) {
			System.out.println("Value is less than 7500");
		}
		
		//Output
	
		
		//Closing scanner
		scanner.close();

	}//end of main
	
}//end of file

