package CS121;

import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		double n = 0.0;
		int i = 0;
		
		System.out.print("Please enter the number of random numers: ");
		num = scanner.nextInt();
		for(i = 1; i<=num; i++)
		{
			n = Math.random();
			System.out.println(i + ".) " + n);
		}

	}

}
