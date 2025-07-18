package homework3;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		if (3<=age && age<=12) {
			System.out.println("당신의 놀이동산 요금은 10000원입니다.");
		} else if (13<=age && age<=18) {
			System.out.println("당신의 놀이동산 요금은 20000원입니다.");
		} else if (19<=age && age<=64) {
			System.out.println("당신의 놀이동산 요금은 30000원입니다.");
		}else {
			System.out.println("당신의 놀이동산 요금은 무료입니다.");
		}
		
		
	}

}
