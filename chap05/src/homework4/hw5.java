package homework4;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자(0을 입력하면 종료) :"); 
		int num = sc.nextInt();
		int total = 0;

		while (num>0) {
			total += num;
			System.out.print("숫자(0을 입력하면 종료) :"); 
			num = sc.nextInt();
			if (num<0) {
				System.out.print("숫자(0을 입력하면 종료) :"); 
				num = sc.nextInt();
			}
			if (num == 0) {
				System.out.println("양수의 합계 :" + total);
				break;
			}
			
		}
		
		
		
			
		
		
		
	}

}
