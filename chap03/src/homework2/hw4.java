package homework2;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int l = sc.nextInt();
		System.out.print("수학: ");
		int m = sc.nextInt();
		System.out.print("영어: ");
		int e = sc.nextInt();
		
		System.out.println("합계: " + (l + m + e));
		System.out.println("평균: " + (l + m + e) / 3);
		
		String k = (l>=60 && m>=60 && e>=60 && ((l + m + e) / 3) >= 90) ? "휴대폰을 바꿀 수 있습니다." : "휴대폰을 바꿀 수 없습니다.";
		System.out.println(k);
		
		
		
		
		
		
	}
}
