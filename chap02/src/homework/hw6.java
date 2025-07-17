package homework;

import java.util.Scanner;

public class hw6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한 자리 숫자를 입력하세요: ");
		char k = sc.nextLine().charAt(0);
		int l = k - '0';
		System.out.println("입력한 숫자의 제곱은 " + (l*l) + "입니다.");
		
	}

}
