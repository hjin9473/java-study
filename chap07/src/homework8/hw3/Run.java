package homework8.hw3;

public class Run {
	public static void main(String[] args) {
		Employee emp  = new Employee();
		
		emp.setEmpNo(100);
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJob("과장");
		emp.setAge(25);
		emp.setGender('남');
		emp.setSalary(3000000);
		emp.setBonus(0.05);
		emp.setPhone("010-123-4567");
		emp.setAddress("서울시 강남구");
		
		System.out.println("=== " + emp.getEmpName() + "의 정보 ===");
		System.out.println("사번 : " + emp.getEmpNo());
		System.out.println("부서 : " + emp.getDept());
		System.out.println("직급 : " + emp.getJob());
		System.out.println("나이 : " + emp.getAge());
		System.out.println("월급 : " + emp.getSalary());
		System.out.println("전화번호 : " + emp.getPhone());
		System.out.println("주소 : " + emp.getAddress());

		
		
	}

}
