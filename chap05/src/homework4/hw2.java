package homework4;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if (num == 0) {
				break;
			}
			
			if (num < 0) {
				System.out.println("양수만 입력해주세요.");
				continue;
			}
			if (9 < num) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			}
			if(0<=num && num<=9) {
			System.out.println("=== "+ num + "단 ===");
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " * " + i + " = " + (num*i));
				}
				continue;
			}
		}
		
		}
		
		
	}


