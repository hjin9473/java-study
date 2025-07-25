package sec01.exam02;

public class StudentExample {
	public static void main(String[] args) {
		Student student = new Student("홍길동", "123456-12345567", 1);
		// 생성자 호출 순서: Student() -> People() -> Student()
		// 즉, 부모 객체가 먼저 생성되고 자식객체가 생성됨
	}
}
