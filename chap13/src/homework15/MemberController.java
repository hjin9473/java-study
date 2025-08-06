package homework15;

import java.util.HashMap;
import java.util.Map;

public class MemberController {
	Map<String, Member> map = new HashMap<String, Member>();
	
	public boolean joinMember(String id,Member m) {
		return true;
	}
	
	public String logIn(String id, String password) {
		return password ;
	}
	
	public boolean changePassword(String id, String oldPw, String newPw) {
		return true;
	}
	
	public void changeName(String id, String newName) {
		
	}
	
	public Map<String, Member> sameName(Map<String, Member> name){
		return name;
	}
	
	
	
	
	
}

