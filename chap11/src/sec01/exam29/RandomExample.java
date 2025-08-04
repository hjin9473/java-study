package sec01.exam29;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		
	// Random 클래스
	// Math.random() 보다 더 다양한 기능과 제어를 제공
	// 정수, 실수, 논리값 등 다양한 타입의 난수 생성
	
	Random random = new Random();
	
	// 아래 주석 해제한 뒤 실행해 볼 것
//	random.setSeed(1234);
	// 시드(seed)란?
	// 난수 생성기의 "초기값"
	// 동일한 시드를 넣으면 항상 같은 난수 순서(시퀸스)가 생성됨
	// 시드를 지정하지 않으면 시스템의 현재 시각에 따라 자동으로 지정됨
	
	
	int ranInt1 = random.nextInt();
	int ranInt2 = random.nextInt();
	int ranInt3 = random.nextInt();
	// 범위 지정(이상, 미만)
	int ranInt4 = random.nextInt(0, 10); // 0~9
	int ranInt5 = random.nextInt(0, 10); 
	int ranInt6 = random.nextInt(0, 10); 
	
	
	System.out.println(ranInt1);
	System.out.println(ranInt2);
	System.out.println(ranInt3);
	System.out.println(ranInt4);
	System.out.println(ranInt5);
	System.out.println(ranInt6);
	
	double ranDouble1 = random.nextDouble();
	double ranDouble2 = random.nextDouble();
	// 범위 지정(이상,미만)
	double ranDouble3 = random.nextDouble(3.14, 5.67);
	double ranDouble4 = random.nextDouble(3.14, 5.67);
	
	System.out.println(ranDouble1);
	System.out.println(ranDouble2);
	System.out.println(ranDouble3);
	System.out.println(ranDouble4);
	
	boolean randBoolean1 = random.nextBoolean();
	boolean randBoolean2 = random.nextBoolean();
	
	System.out.println(randBoolean1);
	System.out.println(randBoolean2);
	
	
	
	
	
	
	
	
	}
}
