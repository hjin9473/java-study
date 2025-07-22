package homework4;

import java.util.Scanner;

public class hw8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean repeat = true;
		
		while (repeat) {
			
		System.out.print("문자열: ");
		String str1 = sc.nextLine();
		System.out.print("문자: ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		for (int i = 0; i < str1.length(); i++) {
			if (ch == str1.charAt(i)) {
			count++;
			} 
				
		}
		System.out.println("포함된 개수: " + count);
		
		while (true) {
            System.out.print("다시 하시겠습니까? (Y/N): ");
            String answer = sc.nextLine();
            
            if (answer.equals("Y")||answer.equals("y")) {
                break;  
            } else if (answer.equals("N")||answer.equals("n")) {
                repeat = false;  
                break;
            } else {
                System.out.println("잘못된 대답입니다. 다시 입력해주세요.");
            }
		}
		
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
