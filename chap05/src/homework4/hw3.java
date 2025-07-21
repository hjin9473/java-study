package homework4;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ans = "탈출";
		for (;;) {
			System.out.print("입력: ");
			String str1 = sc.nextLine();
			if(str1.equals(ans)) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println(str1);
			}
			
			
		}
		
		
		
		
	}

}
