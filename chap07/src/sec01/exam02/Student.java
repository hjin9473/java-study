package sec01.exam02;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 클래스가 책임지는 초기화는 부모 생성자에게 맡기는게 원칙적이고 안전함
		this.studentNo = studentNo;
	}
	
	
}

	
