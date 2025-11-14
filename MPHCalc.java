package CS121;
import java.util.Scanner;

public class MPHCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int seconds=0;
		double miles=0;
		double mph=0;
		
		System.out.println("how many seconds did you time?");
		seconds = scanner.nextInt();
		
		System.out.println("how many miles did you go in that time?");
		miles = scanner.nextDouble();
		
		mph = (miles/seconds)*60*60;
		
		System.out.println(mph);
		scanner.close();

	}

}
