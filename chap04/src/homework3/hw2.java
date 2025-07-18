package homework3;

import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월:");
		int mon = sc.nextInt();
		System.out.print("기온:");
		int tem = sc.nextInt();
		
		if (mon == 3 || mon == 4 || mon == 5) {
			System.out.print("봄 ");
		}else if (mon == 6 || mon == 7 || mon == 8) {
			System.out.print("여름 ");
			if (33<tem && tem<35) 
				System.out.println("폭염주의보");
			if (35<tem) 
				System.out.println("폭염경보");
			
		}else if (mon == 9 || mon == 10 || mon == 11) {
			System.out.print("가을 ");
		}else if (mon == 12 || mon == 1 || mon == 2) {
			System.out.print("겨울 ");
			if (tem<-15) 
				System.out.println("한파경보");
			if (-15<tem && tem<-12) 
				System.out.println("한파주의보");
			
		}else {
			System.out.print("해당 계절 없음");
		}
				
		
			
		
		
		
		
		
	}
}
