package homework12.hw5;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("생년월일: ");
		String birth = sc.next();
		
		String result = new String();
		
		result += name.substring(0,1);
		result += birth.substring(2, 4);
		result += birth.substring(6, 8);
		result += name.substring(1, 3);
		
		System.out.println("암호: " + result);
		
		
		
		
		
	}

}
