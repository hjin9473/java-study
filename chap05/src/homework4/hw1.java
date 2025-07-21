package homework4;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수(1~50) : ");
		int num = sc.nextInt();
		int out = 0;
		
		if (0 < num && num <= 50) {
			for (int i = 0; i < num; i++) {
				if (i % 2 == 0) {
					out += i;
					
				}
			}
			System.out.println("합계: " + out);
		}else if (50 < num || num < 0) {
			System.out.println("1~50 사이의 정수를 입력하세요.");
		}
		
		
	
	}

}
