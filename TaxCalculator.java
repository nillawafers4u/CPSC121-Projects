package CS121;

import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double income = 0.0;
		double tax = 0.0;
		double totalIncome = 0.0;
		double total = 0.0;
		
		//Credits
		System.out.println("Tax Calculator");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This tax calculator will ask you to enter your total income.");
		System.out.println("It will then calculate you income taxes and display all the tax brackets for you.");
		System.out.println();
		
		//user Inputs
		System.out.print("Please enter the amount you made this year: ");
		income = scanner.nextDouble();
		System.out.println();
		
		//setting up the start of my table
		System.out.printf("%25s", "Tax Rate");
		System.out.printf("%25s", "Tax Due for the Range");
		System.out.printf("%25s", "Amount in Dollars");
		System.out.println();
		
		//Calculations
		//10%
		totalIncome = income;
		if(income <= 11600) {
			tax = income * .1;
			total = total + tax;
			income = 0;
		} else {
			tax = 11600 * .1;
			total = total + tax;
			income = income - 11600;
		}
		System.out.printf("%25s", "10%");
		System.out.printf("%25s", "$11,600 or less");
		System.out.printf("%25.2f", tax);
		System.out.println();
		//12%
		if(income <= 35550) {
			tax = income * .12;
			total = total + tax;
			income = 0;
		} else {
			tax = 35550 * .12;
			total = total + tax;
			income = income - 35550;
		}
		System.out.printf("%25s", "12%");
		System.out.printf("%25s", "$11,601 to $47,151");
		System.out.printf("%25.2f", tax);
		System.out.println();
		//22%
		if(income <= 53375) {
			tax = income * .22;
			total = total + tax;
			income = 0;
		} else {
			tax = 53375 * .22;
			total = total + tax;
			income = income - 53375;
		}
		System.out.printf("%25s", "22%");
		System.out.printf("%25s", "$47,151 to $100,526");
		System.out.printf("%25.2f", tax);
		System.out.println();
		//24%
		if(income <= 91425) {
			tax = income * .24;
			total = total + tax;
			income = 0;
		} else {
			tax = 91425 * .24;
			total = total + tax;
			income = income - 91425;
		}
		System.out.printf("%25s", "24%");
		System.out.printf("%25s", "$100,526 to $191,950");
		System.out.printf("%25.2f", tax);
		System.out.println();
		//32%
		if(income <= 51775) {
			tax = income * .32;
			total = total + tax;
			income = 0;
		} else {
			tax = 51775 * .32;
			total = total + tax;
			income = income - 51775;
		}
		System.out.printf("%25s", "32%");
		System.out.printf("%25s", "$191,951 to $243,725");
		System.out.printf("%25.2f", tax);
		System.out.println();
		//35%
		if(income <= 325625) {
			tax = income * .35;
			total = total + tax;
			income = 0;
		} else {
			tax = 365625 * .35;
			total = total + tax;
			income = income - 365625;
		}
		System.out.printf("%25s", "35%");
		System.out.printf("%25s", "$243,726 to $609,350");
		System.out.printf("%25.2f", tax);
		System.out.println();
		//37%
		if(income > 0) {
			tax = income * .37;
			total = total + tax;
			income = 0;
		}
		System.out.printf("%25s", "37%");
		System.out.printf("%25s", "609,351 or more");
		System.out.printf("%25.2f", tax);
		System.out.println();
		System.out.println();
		
		
		System.out.print("The amount of tax due is: $");
		System.out.printf("%.2f", total);
		System.out.println();
		System.out.print("The overall tax rate is: ");
		System.out.printf("%.4f", (total / totalIncome) * 100);
		System.out.print("%");
		
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file
