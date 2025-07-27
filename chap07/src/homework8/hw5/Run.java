package homework8.hw5;

public class Run {
	public static void main(String[] args) {
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
	
		st1.setName("김철수");
		st1.setCname("A");
		st2.setName("홍길동");
		st2.setCname("F");
		st3.setName("이영희");
		st3.setCname("B");
	
		System.out.println(st1.getStudentId() + " " + st1.getName() + " " + st1.getCname());
		System.out.println(st2.getStudentId() + " " + st2.getName() + " " + st2.getCname());
		System.out.println(st3.getStudentId() + " " + st3.getName() + " " + st3.getCname());
	
	
	}
}
