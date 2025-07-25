package homework8.hw1;

public class Run {
	public static void main(String[] args) {
		Member mem = new Member();
		mem.memberId = "qwerty";
		mem.memberPwd = "qwer123";
		mem.memberName = "이춘수";
		mem.age = 30;
		mem.gender = '남';
		mem.phone = "010-1234-5678";
		mem.email = "qwer1234@gmail.com";
		
		mem.changeName("이");
		mem.printName();
		
		
		
	}

	
}
