package homework12.hw4;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = new String(); 
		
		while (true) {
			
		System.out.print("문자열: ");
		String st = sc.next();
		char ch = st.charAt(0);
		
		if (ch == 'n' || ch == 'N') {
			System.out.println("종료합니다.");
			break;
		}
		result += st ;
		}
		System.out.println("최종 문자열: " + result);
	}

}
