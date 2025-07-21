package homework3;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 :");
		int a = sc.nextInt();
		System.out.print("두 번째 정수 :");
		int b = sc.nextInt();
		System.out.print("세 번째 정수 :");
		int c = sc.nextInt();
		
		if (a<b && a<c) {
			System.out.println("세 수 중에서 가장 작은 수는 " + a + "입니다.");
		}
		if (b<a && b<c) {
			System.out.println("세 수 중에서 가장 작은 수는 " + b + "입니다.");
		}
		if (c<b && c<a) {
			System.out.println("세 수 중에서 가장 작은 수는 " + c + "입니다.");
		}
		
		
		
		
		
		
		
	}

}
