package homework6;
//- 전달된 메세지를 출력하는 메소드 구현
//- 1~100까지 합을 반환하는 메소드구현
//- 전달된 정수가 홀수인지 짝수인지 반환하는 메소드구현
//- 전달된 문자열에 영문자가 있는지 확인하는 결과를 반환하는 메소드 구현
//- 문자열, 문자를 전달받아 문자열에 문자가 몇개있는지 출력하는 메소드구현
//- 전달된 정수의 구구단을 출력하는 메소드 구현
public class Controller {

	
	
	
	
	String msg(String a) {
		return a;
	}
	
	int plus() {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result += i;
		}
		return result;
	}
	void zeroone (int a) {
		if (a % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	void ifeng(String a) {
		int result =0;
		for (int i = 0; i < a.length(); i++) {
			if((char) 65 <= a.charAt(i) && a.charAt(i) <= (char)90 ||
					(char) 97 <= a.charAt(i) && a.charAt(i) <= (char)122) {
				result = 1;
			}
		}
		if (result == 1) {
			System.out.println("알파벳 존재");
		}
	}
	
	void count(String a) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			count++;
		}
		System.out.println(count);
	}
	void gugu(int a) {
		int total = 0;
		for (int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + (a * i)); 		
			
		}
	}
	
	
	
	

}
