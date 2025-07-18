package sec02.exam10;

public class ContinueExample {
	public static void main(String[] args) {
		//짝수만 출력
		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				continue; // 다음 반복을 계속해라(건너뜀)
			}
		System.out.println(i);
		}
	
		
		
		
	}
}
