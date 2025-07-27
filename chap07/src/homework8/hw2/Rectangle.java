package homework8.hw2;

public class Rectangle {
	private int width = 1;
	private int height = 1;
	
	Rectangle() {
		
	}
	Rectangle(int width,int height) {
		this.width = width;
		this.height = height;
		
	}
	
	int calculateRound() {
		return (width * 2) + (height * 2);
		
	}
	int calculateArea() {
		return (width * height);
		
	}
	void printInfo() {
	System.out.println("=== 사각형 정보 ===\r\n"
			+ "1. 사각형의 둘레: " + calculateRound() + "cm");
	System.out.println("=== 사각형 정보 ===\r\n"
			+ "2. 사각형의 넓이: " + calculateArea() + "cm");
}
	
	
	
}
