package CS121;

import java.util.Scanner;

public class KilobyteDaySaleCalculator {

	public static void main(String[] args) {
		
		//Declaring scanner
		Scanner scanner = new Scanner(System.in);
		//Variables
		double ori_Price = 0.0;
		double dis_Price = 0.0;
		double dis_Rate= 0.0;
		double tax_Rate = 0.06;
		double tax = 0.0;
		double total = 0.0;
		double saved = 0.0;
		
		//Title, credit, and story
		System.out.println("Kilobyte Day - 10/24/25");
		System.out.println("By: Jonah Layman");
		System.out.println();
		System.out.println("You're going to enter the original price of the item.");
		System.out.println("The program will then display the sale information to you.");
		System.out.println();
		
		//Ask for input
		System.out.print("Enter the original price of the item: ");
		ori_Price = scanner.nextDouble();
		System.out.println();
		
		//Calculations
		//determining the discount % based on the amount purchased
		if(ori_Price < 128) {
			dis_Rate = 0.08;
		}
		
		if(ori_Price >= 128) {
			dis_Rate = 0.16;
		}
		//Calculating the rest of the variables
		dis_Price = ori_Price * (1 - dis_Rate);
		tax = dis_Price * tax_Rate;
		total = dis_Price + tax;
		saved = ori_Price - dis_Price;
		
		//Display results
		System.out.printf("%20s", "Original Price");
		System.out.printf("%20s", "Discounted Price");
		System.out.printf("%20s", "Sales Tax (6%)");
		System.out.printf("%20s", "Total Price");
		System.out.printf("%20s", "Amount Saved");
		System.out.println();
		System.out.printf("%20.2f", ori_Price);
		System.out.printf("%20.2f", dis_Price);
		System.out.printf("%20.2f", tax);
		System.out.printf("%20.2f", total);
		System.out.printf("%20.2f", saved);
		System.out.println();
		System.out.println();
		System.out.println("Thank you for shopping at our store");
		
		//closing scanner
		scanner.close();

	}//end of main

}//end of file

