package CS121;
import java.util.Scanner;
public class Speed_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Speed Calculator \nby Jonah Layman");
		System.out.println("\nThis program will request you enter the time you recorded in seconds, and the miles you went in that time.\nIt will then calculate the speed in MPH\n");
		Scanner scanner = new Scanner(System.in);
		
		int time = 0;
		double miles = 0.0;
		double speed = 0.0;
		
		//gathering the variables from the user
		System.out.print("How many seconds? ");
		time = scanner.nextInt();
		System.out.print("How many miles? ");
		miles = scanner.nextDouble();
		
		//Calculating the speed
		speed = miles/time*60*60;
		
		System.out.println("Your current speed is " + speed + "mph");
		
		scanner.close();
	}

}
