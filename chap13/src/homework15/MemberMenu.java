package homework15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== (주)가남에 오신것을 환영합니다. =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");
		
			System.out.print("메뉴 번호: ");
			int num = sc.nextInt();
	   	
	   	switch (num) {
	   		case 1: joinMember(); break;
	   		case 2: logIn(); break;
	   		case 3: sameName(); break;
	   		case 9:
	   			System.out.println("프로그램을 종료합니다.");
	   			return;
	   		default:
	   			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
	   		}
		}	
	}
	
	public void memberMenu() {
		while(true) {
			System.out.println("***** 회원 메뉴 *****");
			System.out.println("회원 메뉴는 회원만 접근할 수 있습니다.");
			System.out.println("먼저 회원가입, 로그인을 해주세요.");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");
			
			System.out.print("메뉴 번호: ");
		   	int num = sc.nextInt();
		   	
		   	switch (num) {
		   		case 1: changePassword(); break;
		   		case 2: changeName(); break;
		   		case 3:
		   			System.out.println("로그아웃 되었습니다.");
		   			return;
		   		default:
		   			System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		   		}
			}
	}
	
	public void joinMember() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		
//		Map<String, Member> map = mc.joinMember(password, name);
		
		
		
		
	}
	
	public void logIn() {
		
	}
	
	public void changePassword() {
		
	}
	
	public void changeName() {
		
	}
	
	public void sameName() {
		
	}
	
	

}
