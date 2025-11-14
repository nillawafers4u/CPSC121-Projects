package CS121;

import java.util.Scanner;

public class ShowSpecialSalePriceCalc {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double piece = 0.0;
		double other = 0.0;
		double engravingPerSide = 0.0;
		double engraving2Discount = 0.0;
		double target = 0.0;
		double subtotal = 0.0;
		double salesTax = 0.0;
		double total = 0.0;
		
		//Credits
		System.out.println("Show Specials Calculator Program");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("You will be asked to enter all of the information and the target “Show Special” price.");
		System.out.println("The program will calculate and display, in table format, all of the needed information.");
		System.out.println("DRK Beads discounts the Side 2 engraving.");
		System.out.println();
		
		//user Inputs
		System.out.print("Enter the price for the piece: ");
		piece = scanner.nextDouble();
		System.out.println();
		System.out.print("Enter the price for the Other Fixed Cost: ");
		other = scanner.nextDouble();
		System.out.println();
		System.out.print("Enter the price for engraving per side: ");
		engravingPerSide = scanner.nextDouble();
		System.out.println();
		System.out.print("Enter the Target Sale Price for this show: ");
		target = scanner.nextDouble();
		System.out.println();
		
		
		//Calculations
		engraving2Discount = target / 1.06 - piece - other - engravingPerSide;
		subtotal = engraving2Discount + engravingPerSide + other + piece;
		total = subtotal * 1.06;
		salesTax = subtotal * 0.06;
		
		//Output
		System.out.printf("%52s", "Show Special Engraving Cost");
		System.out.println();
		System.out.println();
		System.out.printf("%33s", "Item");
		System.out.printf("%15s","Price");
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Engraving Piece");
		System.out.printf("%15.2f", piece);
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Other Fixed Price");
		System.out.printf("%15.2f", other);
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Engraving Side 1");
		System.out.printf("%15.2f", engravingPerSide);
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Engraving Side 2 discounted price");
		System.out.printf("%15.2f", engraving2Discount);
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Subtotal");
		System.out.printf("%15.2f", subtotal);
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Sales Tax");
		System.out.printf("%15.2f", salesTax);
		System.out.println();
		System.out.println();
		System.out.printf("%33s","Total");
		System.out.printf("%15.2f", total);
		System.out.println();
		System.out.println();
		System.out.print("Note: Engraving Price = ");
		System.out.printf("%.2f", (engravingPerSide + engraving2Discount));
		
		//Closing scanner
		scanner.close();

	}//end of main

}//end of file