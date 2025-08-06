package sec01.exam06.quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz1_2 {
//	Quiz1
//	직장인의 정보를 담고 있는 Information 클래스와 실행 클래스를 작성하세요.
//	실행 클래스에 HashMap 객체를 생성하세요.
//	아래 사용 데이터를 참고하여 HashMap에 직원들의 정보를 추가합니다.
//	직원들의 정보 중 이름은 Key값으로 사용되고, 
//	전화번호와 월급은 Information 클래스의 필드로써 Value에 사용됩니다.
//	초기 데이터를 추가하고 HashMap을 출력하세요.
//	John의 월급을 410만원으로 바꾸어 HashMap의 값을 바꾼다음 다시 출력하세요.
	
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
	
//	[사용 데이터]
//	이름  |     전화번호      | 월급
//	-----------------------------------
//	John |  123-456-7890  | 3800000
//	Emma |  987-654-3210  | 2300000
//	 Tom |	555-123-4567  | 4600000
	
//	[출력]
//	변경전: {Tom=[전화번호=555-123-4567, 월급=4600000], John=[전화번호=123-456-7890, 월급=3800000], Emma=[전화번호=987-654-3210, 월급=2300000]}
//	변경후: {Tom=[전화번호=555-123-4567, 월급=4600000], John=[전화번호=123-456-7890, 월급=4100000], Emma=[전화번호=987-654-3210, 월급=2300000]}
	
	public static void main(String[] args) {
		Information in1 = new Information("123-456-7890", 3800000);
		Information in2 = new Information("987-654-3210", 2300000);
		Information in3 = new Information("555-123-4567", 46000000);
				
		Map<String, Information> map = new HashMap<>();
		map.put("john", in1);
		map.put("Emma", in2);
		map.put("Tom", in3);
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> keyIterator = keySet.iterator();
		for (String key : keySet) {
			Information value = map.get(key);
			System.out.println("\t" + key + "="  + value);
		}
		
		in1.salary = 4100000;
		
		for (String key : keySet) {
			Information value = map.get(key);
			System.out.println("\t" + key + "="  + value);
		}
		
		
	}

}
