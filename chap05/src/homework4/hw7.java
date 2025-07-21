package homework4;

import java.util.Scanner;

public class hw7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 :"); 
		int num = sc.nextInt();
		
		while (true) {
			if (num>0) {
				
			for (int i = 0; i < num; i++) {
				if (i%2==0) {
					System.out.print("박");
				}
				if (i%2==1) {
					System.out.print("수");
				}
			}
			}
			if (num<=0) {
				System.out.println("양수가 아닙니다."); 
				System.out.print("정수 :"); 
			}
			num = sc.nextInt();

		
		}
		
	}

}
