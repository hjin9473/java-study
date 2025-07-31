package homework11.hw4;

import java.util.Scanner;

public class NumberMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1: ");
		int a = sc.nextInt();
		System.out.print("정수2: ");
		int b = sc.nextInt();
		
		NumberController controller = new NumberController();
		
		try {
			boolean tf = controller.checkDouble(a, b);
			System.out.println(a + "은(는) " + b + "의 배수인가? " + tf);
		} catch (NumRangeException e) {
			System.out.println("오류발생: " + e.getMessage());
		}
		
		
		
	}

}
