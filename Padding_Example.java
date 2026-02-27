package CS121;

import java.util.Scanner;

public class Padding_Example {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String pad = ".............................."; //30 periods for padding
		String padn = "0000";
		int len = 0;
		int s = 0;
		String enter = "";
		String name = "";
		String fn = "";
		String ln = "";
		String strength = "";
		String gamechar = "";
		do
		{
			// method one for concatenating to a length
			System.out.print("Enter First Name: ");
			enter = input.nextLine();
			System.out.println();
			if(enter.equals("/"))
			{
				break;
			}
			len = enter.length();
			while(len<10)
			{
				enter = enter + ".";
				len = enter.length();
			}
			System.out.println(enter + " the lenght of the name is " + len);
			fn = enter;
			// method two for concatenating to a length			
			System.out.print("Enter Last Name: ");
			enter = input.nextLine();
			System.out.println();
			if(enter.equals("/"))
			{
				break;
			}
			len = enter.length();
			enter = enter + pad.substring(0,15-len);
			len = enter.length();
			System.out.println(enter + " the lenght of the name is " + len);
			ln = enter;
			System.out.println("Press Enter and I will create your game character health");
			enter = input.nextLine();
			s = (int)(Math.random()*100 + 1);
			//strength = Integer.toString(s);
			strength = s + "";
			len = strength.length();
			strength = "000".substring(0,3-len)+strength;
			name = fn+ln+strength;
			len = name.length();
			System.out.println(name + " the length is " + len);
			System.out.println("The player strength is " + Integer.parseInt(name.substring(len-3,len)));
		}while(true);//end of do
		System.out.println("That's All Folks");
	}//end of main

}
