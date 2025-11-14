package CS121;

import java.util.Scanner;

public class StatsProgram {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Declaring scanner and variables
		
		int selection = 0;

		
		//Credits
		System.out.println("Statistics Solver");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This is a program I made for myself to solve statistic problems for my exam.");
		System.out.println("The program will ask yo to enter the corresponding number for the action you wish to perform.");
		System.out.println("Depending on what function you choose, you will have to enter a varying number of inputs.");
		System.out.println("After displaying you answer, you will go back to the menu screen.");
		System.out.println();
		
		//main run loop
		while(true) {
			System.out.println("Please enter your Seletion:");
			System.out.print(
					  "1 for Binomial Problem\n"
					+ "2 for blank\n"
					+ "3 for blank\n"
					+ "4 for blank\n"
					+ "5 for blank\n"
					+ "Your selection: ");
			selection = scanner.nextInt();
			switch(selection) {
			
			case 1:
				binomialSolver();
				break;
			
			case 2:
				break;
			
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
			
			
			}
			
			
			
			break;
		}
				
		//Output
	
		
		//Closing scanner
		

	}//end of main
	
	//Calculation methods
	private static void binomialSolver() {
		int numberOfTrials = 0;
		double probability = 0.0;
		System.out.print("How many trials do you have?: ");
		numberOfTrials = scanner.nextInt();
		scanner.close();
	}
	
	


}//end of file
