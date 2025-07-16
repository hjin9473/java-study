package homework;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	System.out.println("국어: " + a);
	System.out.println("영어: " + b);
	System.out.println("수학: " + c);
	System.out.println("총점: " + (a + b + c));
	System.out.println("평균: "+ (a + b + c) / 3);
	
	}
}
