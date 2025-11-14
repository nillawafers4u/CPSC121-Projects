package CS121;

import java.util.Scanner;

public class PayCalculator {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double regularHours = 0;
		double hourlyWage = 0;
		double hoursWorked = 0;
		double overtimeHours = 0;
		double normalPay = 0;
		double overtimePay = 0;
		double grossPay = 0;
		double netPay = 0;
		double federalTax = 0;
		double stateTax = 0;
		double localTax = 0;
		double fica = 0;
		

		
		//Credits
		System.out.println("A Handy Pay Calculator");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This simple program will ask you for your worked hours, and your hourly wage.");
		System.out.println("It will then calculate your gross and net pay, while displaying deductions.");
		System.out.println();
		
		//user Inputs
		System.out.print("How many hours did you work?: ");
		hoursWorked = scanner.nextDouble();
		System.out.println();
		System.out.print("What is your hourly wage?: ");
		hourlyWage = scanner.nextDouble();
		System.out.println();
		
		//Calculations
		if(hoursWorked > 40) {
			overtimeHours = hoursWorked - 40;
			regularHours = 40;	
		}
		
		if(hoursWorked <= 40) {
			regularHours = hoursWorked;
			overtimeHours = 0;
		}
		
		normalPay = regularHours * hourlyWage;
		overtimePay = overtimeHours * (hourlyWage * 1.5);
		grossPay = normalPay + overtimePay;
		federalTax = 0.12;
		stateTax = 0.03;
		localTax = 0.01;
		fica = 0.08;
		netPay = grossPay - (grossPay * (federalTax + stateTax + localTax + fica));

		
		//Output
		System.out.printf("%15s", "Regular Hours");
		System.out.printf("%15s", "Overtime Hours");
		System.out.printf("%15s", "Regular Pay");
		System.out.printf("%15s", "Overtime Pay");
		System.out.printf("%15s", "Gross pay");
		System.out.printf("%15s", "Net Pay");
		System.out.println();
		System.out.printf("%15.2f", regularHours);
		System.out.printf("%15.2f", overtimeHours);
		System.out.printf("%15.2f", normalPay);
		System.out.printf("%15.2f", overtimePay);
		System.out.printf("%15.2f", grossPay);
		System.out.printf("%15.2f", netPay);
		System.out.println();
		System.out.println();
		System.out.print("Gross Pay: $");
		System.out.printf("%.2f", grossPay);
		System.out.println();
		System.out.print("Federal Tax 12%: $");
		System.out.printf("%.2f", grossPay * federalTax);
		System.out.println();
		System.out.print("State Tax 3%: $");
		System.out.printf("%.2f", grossPay * stateTax);
		System.out.println();
		System.out.print("Local Tax 1%: $");
		System.out.printf("%.2f", grossPay * localTax);
		System.out.println();
		System.out.print("FICA 8%: $");
		System.out.printf("%.2f", grossPay * fica);
		System.out.println();
		System.out.print("Total Deducitons: $");
		System.out.printf("%.2f", grossPay * (federalTax + stateTax + localTax + fica));
		System.out.println();
		System.out.print("Net Pay: $");
		System.out.printf("%.2f", netPay);
		
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file
