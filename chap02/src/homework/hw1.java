package homework;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double kg = sc.nextDouble();
		double m = sc.nextDouble();
		System.out.println("몸무게: " + kg);
		System.out.println("키: " + m);
		System.out.println("BMI지수: " + ((kg / m) * m));
		
		
		
		
	}
}
