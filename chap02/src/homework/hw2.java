package homework;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.println("가로: " + a);
		System.out.println("세로: " + b);
		System.out.println("면적: " + a * b);
		System.out.println("둘레: " + (a + b) * 2);
		
		
		
	}
}
