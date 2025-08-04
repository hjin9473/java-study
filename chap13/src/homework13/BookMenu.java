package homework13;

import java.util.Scanner;

public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	public void mainMenu() { //→ 전체 메뉴 루프
		System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
		System.out.print("원하시는 업무의 번호를 선택하세요.");
		System.out.println("1. 새 도서 추가 -> insertBook() 호출");
		System.out.println("2. 도서 전체 조회 -> selectList() 호출");
		System.out.println("3. 도서 검색 조회 -> searchBook() 호출");
		System.out.println("4. 도서 삭제 -> deleteBook() 호출");
		System.out.println("5. 도서 오름차순 정렬 -> ascBook() 호출");
		System.out.println("9. 종료 -> 프로그램을 종료합니다. 출력 후 종료");
		int num = sc.nextInt();
		
		
    // 숫자 입력 받아서 기능 수행하기
    // 만일 1,2,3,4,5,9 외의 숫자 입력하면 -> "잘못 입력하였습니다. 다시 입력해주세요." 출력
	}
	public void insertBook() {//→ 사용자 입력 받아 Book 생성 & 컨트롤러에 전달

	}
	public void selectList() {//→ 전체 목록 출력

	}
	public void searchBook() {//→ 키워드 기반 검색

	}
	public void deleteBook() {//→ 제목+저자로 삭제

	}
	public void ascBook() {//→ 가격 오름차순 정렬
	
	}
	
	
	

}
