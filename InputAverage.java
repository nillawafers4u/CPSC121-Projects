package CS121;
import java.util.Scanner;
public class InputAverage {

	public static void main(String[] args) {
				
		
		// Giving myself credit
		Scanner scanner = new Scanner(System.in);
		//declare variables after scanner!
		//Dr. K says we always have to declare our variables ourselves and don't let the language.
		int first = 0;
		int second = 0;
		int third = 0;
		int fourth = 0;
		int fifth = 0;
		
		System.out.println("Inputs to Average Calculator");
		System.out.println("by");
		System.out.println("Jonah Layman");
		
		//Story line to explain the program and what will happen when run
		//extra println() in the code are to make clean line breaks
		System.out.println();
		System.out.println("This is a calculator that will find the average of the 5 numbers you enter."
				+ "You will be asked to enter the numbers one at a time.");
		System.out.println();
		
		//gathering the numbers from the user; one input at a time.
		System.out.print("Please enter the 1st number: ");
		first = scanner.nextInt();
		System.out.println();
		System.out.print("Please enter the 2nd number: ");
		second = scanner.nextInt();
		System.out.println();
		System.out.print("Please enter the 3rd number: ");
		third = scanner.nextInt();
		System.out.println();
		System.out.print("Please enter the 4th number: ");
		fourth = scanner.nextInt();
		System.out.println();
		System.out.print("Please enter the 5th number: ");
		fifth = scanner.nextInt();
		
		
		//closing the scanner since we will not use it past this point.
		scanner.close();
		
		double total = (first+second+third+fourth+fifth);
		double average = total/5;
		
		//displaying the results
		System.out.println();
		System.out.println("The 5 entered values were:  "+first+", "+second+", "+third+", "+fourth+" and "+fifth);
		System.out.println();
		System.out.println("The total is:  "+total+"");
		System.out.println();
		System.out.println("The average is:  "+average+"");
		System.out.println();
		
		
	}//end of main

}//end of file
