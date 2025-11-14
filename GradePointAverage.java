package CS121;

import java.util.Scanner;

public class GradePointAverage {

	public static void main(String[] args) {
		
		//Declaring scanner and variables
		Scanner scanner = new Scanner(System.in);
		double weightedCredits = 0.0;
		double weightedGPA = 0.0;
		double normalCredits = 0.0;
		double normalGPA = 0.0;
		double gpa = 0.0;
		double normalQP = 0.0;
		double weightedQP = 0.0;
		
		
		
		//Credits
		System.out.println("Grade Point Calculator");
		System.out.println("By: Jonah Layman");
		System.out.println();
		
		//Story Line
		System.out.println("This Program will calculate your total GPA based on your weighted and non-weighted classes.");
		System.out.println("You will be asked to enter the number of weighted and non-weighted credits you took,");
		System.out.println("as well as the GPA for both.");
		System.out.println("You will then see an output of the results.");
		System.out.println();
		
		//user Inputs
		System.out.print("What is the number of non-weighted credits?: ");
		normalCredits = scanner.nextDouble();
		System.out.print("What is the non-weighted GPA?: ");
		normalGPA = scanner.nextDouble();
		System.out.print("What is the number of weighted credits?: ");
		weightedCredits = scanner.nextDouble();
		System.out.print("What is the weighted GPA?: ");
		weightedGPA = scanner.nextDouble();
		System.out.println();
		
		
		
		//Calculations
		normalQP = normalCredits * normalGPA;
		weightedQP = weightedCredits * weightedGPA;
		gpa = (normalQP + weightedQP) / (weightedCredits + normalCredits);
		
		
		//Output
		System.out.printf("%30s","Num of Non-Weighted Credits");
		System.out.printf("%30s","Non-Weighted GPA");
		System.out.printf("%30s","Number of Weighted Credits");
		System.out.printf("%30s","Weighted GPA");
		System.out.println();
		System.out.printf("%30.2f",normalCredits);
		System.out.printf("%30.4f",normalGPA);
		System.out.printf("%30.2f",weightedCredits);
		System.out.printf("%30.4f",weightedGPA);
		System.out.println();
		System.out.println();
		System.out.print("Calculated Overall Quality Points: ");
		System.out.printf("%.4f",(normalQP + weightedQP));
		System.out.println();
		System.out.println();
		System.out.print("Calculated Overall Credits: ");
		System.out.printf("%.4f",(normalCredits + weightedCredits));
		System.out.println();
		System.out.println();
		System.out.print("Overall GPA: ");
		System.out.printf("%.4f",gpa);
		System.out.println();
		
		
		
		//Closing scanner
		scanner.close();

	}

}
