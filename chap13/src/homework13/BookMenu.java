package homework13;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {
    Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();

    public void mainMenu() {
        while (true) {
            System.out.println("=== 가남 도서관에 오신걸 환영합니다 ===");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            sc.nextLine(); 

            switch (num) {
                case 1: insertBook(); break;
                case 2: selectList(); break;
                case 3: searchBook(); break;
                case 4: deleteBook(); break;
                case 5: ascBook(); break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
            }
        }
    }

    public void insertBook() {
        System.out.print("도서명: ");
        String title = sc.nextLine();
        System.out.print("저자명: ");
        String author = sc.nextLine();
        System.out.print("장르: ");
        int catNum = sc.nextInt(); sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt(); sc.nextLine();

        String category;
        switch (catNum) {
            case 1: category = "인문"; break;
            case 2: category = "자연과학"; break;
            case 3: category = "어린이"; break;
            default: category = "기타"; break;
        }

        Book bk = new Book(title, author, category, price);
        bc.insertBook(bk);
        System.out.println("도서가 성공적으로 추가되었습니다.");
    }

    public void selectList() {
        List<String> book = new LinkedList<String>();
        for (String str : book) {
        	System.out.println(str);
		}
        
    }

    public void searchBook() {
        System.out.print("검색할 키워드를 입력하세요: ");
        String keyword = sc.nextLine();
        List<Book> searchList = bc.searchBook(keyword);
        if (searchList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
        } else {
            for (Book b : searchList) {
                System.out.println(b);
            }
        }
    }

    public void deleteBook() {
        System.out.print("삭제할 도서 제목 입력: ");
        String title = sc.nextLine();
        System.out.print("삭제할 도서 저자 입력: ");
        String author = sc.nextLine();
        Book removed = bc.deleteBook(title, author);
        if (removed != null) {
            System.out.println("성공적으로 삭제되었습니다: " + removed);
        } else {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }

    public void ascBook() {
        int result = bc.ascBook();
        if (result == 1) {
            System.out.println("정렬에 성공하였습니다.");
            selectList();
        } else {
            System.out.println("정렬에 실패하였습니다.");
        }
    }
}
