package CS121;

import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {
		//Declaring scanner object
		Scanner scanner = new Scanner(System.in);
				
		//Creating and initializing variables
		double low = 0;
		double high = 0;
		double max = 0;
		double age = 0;
		String name = "";
		
		//Title and credits:
		System.out.println("Heart Rate Range Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//User instructions
		System.out.println("This is a progam that will allow you to calculate the heart rate ranges for a client.");
		System.out.println("You will be asked to enter the client's name, along with their age.");
		System.out.println("Afterwards, you will see their low, high, and max heart rate displayed.");
		System.out.println("You will also see range recommendations for training.");
		System.out.println();
		
		//User inputs
		System.out.println("Input");
		System.out.print("Client's Name: ");
		name = scanner.nextLine();
		System.out.print("Client's Age: ");
		age = scanner.nextDouble(); 

		//Calculation
		max = -age + 220;
		high = (-.85 * age) +187;
		low = (-.7 * age) + 154;
		
		//Output	
		System.out.println("Output");
		System.out.println(name + "'s max heart rate is: " + max + ".");
		System.out.println();
		System.out.println("Warning: Anything over " + max + " would be dangerous!");
		System.out.println();
		System.out.println("Your target Heart Rate for training should be between " + low + " and " + high +".");
		
		//Closing scanner
		scanner.close();
		
	}//end of main

}//end of file
