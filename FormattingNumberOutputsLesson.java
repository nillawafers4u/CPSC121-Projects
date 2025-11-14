package CS121;

import java.util.Scanner;

public class FormattingNumberOutputsLesson {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num = 0.0;
		System.out.print("please enter a value: ");
		num = input.nextDouble();
		System.out.println();
		System.out.printf("%-20s","Engraving Piece");
		System.out.println();
		System.out.printf("%-20s","Other Fixed Price");
		System.out.println();
		System.out.printf("%-20s","Engraving Side 1");
		System.out.println();
		System.out.printf("%-20s","Engraving Side 2");
		System.out.println();
		System.out.printf("%-20s","Subtotal");
		System.out.println();
		System.out.printf("%-20s","Sales Tax");
		System.out.println();
		System.out.printf("%-20s","Total");
		
		System.out.printf("%30s","number * Pi");
		System.out.println();
		System.out.printf("%20.2f",num);
		num = num*3.14159;
		System.out.printf("%30.2f",num);
		System.out.println();
		input.close();
		

	}

}
