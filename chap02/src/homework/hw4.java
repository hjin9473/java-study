package homework;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요: ");
		
		char m = sc.nextLine().charAt(0);
		int k = m;
	
		System.out.println(m + "의 유니코드: " + k);
		
		
	}
}
