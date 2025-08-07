package homework15;

import java.util.HashMap;
import java.util.Map;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id, Member m) {
		if (!map.containsKey(id)) {
			map.put(id, m);
			return true;
		}else {
			return false;
		}
		
	}
	
//	public String logIn(String id, String password) {
//		if (map.containsKey(id)) {
//			if (map.get(id).equals(password)) {
////				return member;							
//		}else {
//			return null;
//		}
//		}
//	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		return true;
	}
	
	public void changeName(String id, String newName) {
		
	}
	
	public Map<String, Member> sameName(Map<String, Member> name){
		return name;
	}
	
	
	
	
	
}

