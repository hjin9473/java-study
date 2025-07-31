package sec01.exam02;

import java.lang.foreign.ValueLayout.OfBoolean;

public class Member {
	public String id;
	
	public Member(String id) {
		this.id = id;
		
		
	}
	@Override
	public boolean equals(Object obj) {
		// 매개 변수의 타입이 Object 타입으로 모든 객체가 대입 가능하므로
		// 제일 먼저 매개값이 Member 타입인지 확인이 필요
		if (obj instanceof Member) {
			// id 필드에 접근하기 위해 Member 타입으로 강제 타입 변환하고
			Member member = (Member) obj;
			// id 필드값이 동일한지 검사
			if (id.equals(member.id)) { // 여기서의 equals()는 String에 재정의 된 메소드로 문자열을 비교
				return true;
			}
		}
		// 매개값이 Member가 아니거나
		// id 필드값이 다른경우 flase 리턴
		return false;
	}
}
