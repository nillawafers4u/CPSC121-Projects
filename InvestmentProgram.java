package CS121;

import java.util.Scanner;

public class InvestmentProgram {

	public static void main(String[] args) {
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double moneyStart = 0.0;
		double interestRate = 0.0;
		double target = 0.0;
		double interestEarned = 0.0;
		int year = 0;
		
		//Credits
		System.out.println("Investment Calculator");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This simple inventment calculator will ask you for:");
		System.out.println("You initial investment, interest rate, and your target goal for you account.");
		System.out.println("It will then display the interest over the years to show you how long it will take to hit your target.");
		System.out.println();
		
		//user Inputs
		System.out.print("How much money are you investing?: ");
		moneyStart = scanner.nextDouble();
		System.out.print("What is your interest rate per year?: ");
		interestRate = scanner.nextDouble();
		System.out.print("What is you target?: ");
		target = scanner.nextDouble();
		System.out.println();
		
		//Clearing screen
		for(int i = 0; i <= 60; i++) {
			System.out.println();
		}
		
		//making a neat line to section off the output
		for(int i = 0; i <= 150; i++) {
			System.out.print("-");
		}
		System.out.println();
		
		//creating table
		System.out.printf("%13s", "Year");
		System.out.printf("%13s", "Interest");
		System.out.printf("%13s", "Balance");
		System.out.println();
		
		//Calculations and output
		while(moneyStart - interestEarned < target) {
			System.out.printf("%13d", year);
			System.out.printf("%13.2f", interestEarned);
			System.out.printf("%13.2f", moneyStart);
			System.out.println();
			year++;
			interestEarned = interestRate * moneyStart;
			moneyStart = moneyStart + interestEarned;
		}
			
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file
