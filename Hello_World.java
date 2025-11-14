package CS121;

public class Hello_World {

	public static void main(String[] args) {
		
		
		int first = 7;
		int second = 8;
		int total = 0;
		double sr = 0.0;
		total = first + second;
		System.out.println("Hello World");
		
		System.out.println("Did you know that 7 + 8 = " +total + "?");
		total = first - second;
		System.out.println("7 - 8 = " + total);
		total = first * second;
		System.out.println("7 * 8 = " + total);
		total = 7/8;
		System.out.println("7 / 8 = " + total);
		total = first % second;
		System.out.println("7 % 8 = " + total);
		sr = Math.sqrt(total);
		System.out.println("sq root if "+total+" is "+sr);
		System.out.println("Did you know that 7 + 8 = " + (7 + 8));
				
	}//end of main

}//end of class
