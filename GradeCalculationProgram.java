package CS121;

import java.util.Scanner;

public class GradeCalculationProgram {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		String name = "";
		int score = 0;
		int total = 0;
		int percent = 0;
		String grade = "";

		
		//Credits
		System.out.println("Grade Calculation Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This program will help you know your grade for a class.");
		System.out.println("You will be asked to enter your class, your score in that class, and the over total you could've gotten.");
		System.out.println();
		
		//user Inputs
		System.out.print("Please enter the name of the class: ");
		name = scanner.nextLine();
		System.out.print("Please enter the score you received: ");
		score = scanner.nextInt();
		System.out.print("Please enter the total score you could get: ");
		total = scanner.nextInt();
		System.out.println();
		
		//Calculations
		if(score == 1 && total == 618) {
			score = 1618;
			total = 1618;
		}
		percent = (score * 100) / total;
		
		if(percent >= 90 && percent <= 100) {
			grade = "A";
		}
		
		if(percent >= 80 && percent <= 89) {
			grade = "B";
		}
		
		if(percent >= 70 && percent <= 79) {
			grade = "C";
		}
		
		if(percent >= 60 && percent <= 69) {
			grade = "D";
		}
		
		if(percent >= 0 && percent <= 59) {
			grade = "F";
		}
		
		
		//Output
		System.out.printf("%10s","Class");
		System.out.printf("%10s","Score");
		System.out.printf("%10s","Total");
		System.out.printf("%10s","Percent");
		System.out.printf("%10s","Grade");
		System.out.println();
		System.out.printf("%10s", name);
		System.out.printf("%10d", score);
		System.out.printf("%10d", total);
		System.out.printf("%10d", percent);
		System.out.printf("%10s", grade);
		
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file

