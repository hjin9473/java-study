package homework;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몸무게: ");
		double kg = sc.nextDouble();
		System.out.print("키: ");
		double m = sc.nextDouble();
		double bmi = kg / (m*m);
		System.out.println("BMI지수: " + bmi);
		System.out.printf("BMI지수: %.1f\n" , bmi);
		System.out.println("BMI지수: " +(int) (bmi * 10) / 10.0 );
		System.out.println("BMI지수: " + Math.floor(bmi * 10) / 10);
		
		
		
		
	}
}
