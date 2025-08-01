package homework12.hw1;


public class Run {
	public static void main(String[] args) {
	String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
	String[] a =  str.split("\n");
	Person[] p = new Person[a.length];	
	
	for (int i = 0; i < a.length; i++) {
		String[] fields = a[i].split(",");
		String name = fields[0];
		int age = Integer.parseInt(fields[1]);
		String address = fields[2];
		char gender = fields[3].charAt(0);

		p[i] = new Person(name, age, address, gender);
	}

	// 출력
	for (Person po : p) {
		System.out.println(po);
	}

	}
}
