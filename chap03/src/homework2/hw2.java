package homework2;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구슬의 개수: ");
		int a = sc.nextInt();
				
		String b = a%2==1 ? "홀수입니다" : "짝수입니다" ;
		System.out.println("구슬의 개수는 " + b);
	}
}
