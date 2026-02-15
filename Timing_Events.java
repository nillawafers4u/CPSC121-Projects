package CS121;

import java.util.Scanner;

public class Timing_Events {

	//This is a sample for timings
			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				double start = 0;
				double end = 0;
				double time = 0;
				String enter = "";
				System.out.println("This program will ask you to press enter and then to press enter a second time.");
				System.out.println("It will then tell you how many seconds between the presses.");
				System.out.println("Current time in milliseconds " + System.currentTimeMillis());
				System.out.println();
				System.out.println("Press enter when ready to start!");
				enter = input.nextLine();
				start = System.currentTimeMillis();
				System.out.println("Press enter when ready to end!");
				enter = input.nextLine();
				end = System.currentTimeMillis();
				time = (end-start)/1000;
				System.out.println("It took " + time +" seconds between presses.");
			}//end of main

}
