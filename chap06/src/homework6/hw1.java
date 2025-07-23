package homework6;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n1 = sc.next();
		String n2 = sc.next();
		
		hwone hwone = new hwone();
		String result1 = hwone.addstr(n1, n2);
		System.out.println(result1);
		
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int result2 = hwone.mul(n3, n4);
		System.out.println(result2);
		
		String n5 = sc.next();
		String n6 = sc.next();
		String result3 = hwone.boo(n5, n6);
		System.out.println(result3);
		
		
	}

}
