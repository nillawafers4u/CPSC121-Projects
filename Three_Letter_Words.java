package CS121;

import java.util.Scanner;

public class Three_Letter_Words {

	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String input = "";
			char a = ' ';
			char b = ' ';
			char c = ' ';
			int i = 0;
			int j = 0;
			int k = 0;
			System.out.print("Press Enter and I will display all 3 letter combination (upper case only)");
			input = in.nextLine();
				for (i=65;i<90;i=i+1)
				{
					for (j=65;j<90;j=j+1)
					{
						for (k=65;k<90;k=k+1)
						{
						     a=(char) (i);
						     b=(char) (j);
						     c=(char) (k);
						     System.out.printf("%2s %2s %2s",a,b,c);
						     System.out.println();
						}//end of k loop
				}//end if j loop
			}//end of i loop

	}

}
