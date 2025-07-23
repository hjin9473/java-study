package sec04.exam05.quiz;

public class Rectangle {
	int width;
	int height;
	
//	area(): 직사각형의 넓이를 출력
	int area() {
		int result = (width * height);
		System.out.println("면적: " + result);
		return result;
	}
	
	
//	length(): 직사각형의 둘레를 출력
	int length() {
		int result = ((width + height) * 2);
		System.out.println("둘레: " + result);
		return result;
	}
	
	
	
	

}
