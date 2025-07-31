package sec01.quiz;

import java.util.Scanner;

public class Quiz1 {
//	Quiz
//	문자열을 입력 받아 입력된 문자열 중 숫자들의 합계를 출력하시오.
//
//	[입력]
//	1) 1,2,3,4,5
//	2) 1-2-3-4-5
//	3) a1b2c3de45
//
//	[출력]
//	1) 15
//	2) 15
//	3) 15

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		
		System.out.println("1) " + numColect(str1));
		System.out.println("2) " + numColect(str2));
		System.out.println("3) " + numColect(str3));

		// 자바에서 제공하는 메소드를 사용한 방법
		int sum2 = 0;
		// 문자열을 char 배열로 변환하는 메소드
		for (char ch : str1.toCharArray()) {
			// 문자가 숫자인지 판별하는 메소드
			if(Character.isDigit(ch)) {
				sum2 = Character.getNumericValue(ch);
			}
			
		}
		System.out.println("합계: " + sum2);
		
		
		
	}
	public static int numColect(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (ch >= '0' && ch <= '9') {  
	            sum += ch - '0';
	        }
	    }
		return sum;
	}
	
	
	
	
	
	
	
	

}
