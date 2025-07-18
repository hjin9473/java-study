package homework3;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("선택: ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.print("1. 스쿼트 ");
		}else if (num == 2) {
			System.out.print("2. 데드리프트");
		}else if (num == 3) {
			System.out.print("3. 벤치 프레스");
		}else if (num == 4) {
			System.out.print("4. 풀업");
		}else if (num == 5) {
			System.out.print("5. 종료");
		}else if (num <= 0) {
			System.out.print("양수만 입력해주세요.");
		}else
			System.out.print("목록에 있는 숫자만 입력해주세요.");
		}
		
		
		
	

}
