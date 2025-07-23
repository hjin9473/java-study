package homework6;

public class hwone {
	String addstr(String a, String b) {
		String result = a + b;
		return result;
	}
	
	int mul(int a, int b) {
		int result = a * b;
		if (a<b) {
			System.out.println("계산할 수 없음");
			result = 0;
		}
		return result;
	}
	
	String boo(String a, String b) {
		if (a.equals(b)) {
			return "true";
			
		}else {
			return "false";
		}
	}
	

}
