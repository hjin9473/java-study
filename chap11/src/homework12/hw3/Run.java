package homework12.hw3;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mail = sc.next();
		
		
		if (mail.indexOf("goodee.co.kr") != -1) {
			System.out.println("아이디: " + mail.substring(0,mail.indexOf("@")));
		}else {
			System.out.println("유효하지 않은 이메일입니다.");
		}
		
		
		
		
	}

}
