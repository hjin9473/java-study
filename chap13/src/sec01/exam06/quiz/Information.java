package sec01.exam06.quiz;

public class Information {
//	Information 클래스
//	1. 필드
//		- phone: String
//		- salary: int
//	2. 생성자
//		+ Information()
//		+ Information(phone: String, salary: int)
//	3. Getter/Setter
//	4. 메소드
//		출력 예시에 맞춰 toString() 재정의
	String phone;
	int salary;
	
	Information(){}

	public Information(String phone, int salary) {
		super();
		this.phone = phone;
		this.salary = salary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[전화번호=" + phone + ", 월급=" + salary + "]";
	}
	
}
