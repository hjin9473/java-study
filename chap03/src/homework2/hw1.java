package homework2;

import java.util.Scanner;

public class hw1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("말해보세요: ");
		String str1 = sc.next();
		
		String b =str1.equals("간다") ? "온다" : "간다" ;
		System.out.println("앵무새: " + b);
		
		
	
		
	}
}
