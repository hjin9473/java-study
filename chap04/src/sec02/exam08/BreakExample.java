package sec02.exam08;

public class BreakExample {
	public static void main(String[] args) {
		while (true) {
			// 1~6까지 임의의 정수값
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			
			if (num == 6) {
				break; // 반복문을 멈추고 빠져나감
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
