package homework4;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임을 실행합니다.");
		String answer = sc.nextLine();
		
		do {if(answer.equals("no")) {
				System.out.println("게임을 종료합니다");
			break;
			}
					} while (answer.equals("yes"));
			System.out.println("게임을 다시 플레이하시겠습니까?(yes/no)");
		
			
			
		
		
		
	}

}
