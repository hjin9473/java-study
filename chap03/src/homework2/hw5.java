package homework2;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호(-): ");
		String min = sc.nextLine();
				
		char i = min.charAt(7);
		
		String bg = (i == '1' || i=='3') ? "입력하신 주민번호는 남자입니다." : (i == '2' || i=='4') ? "입력하신 주민번호는 여자입니다." :"입력하신 주민번호는 잘못된 값입니다." ;
		System.out.println(bg);
		
	}

}
