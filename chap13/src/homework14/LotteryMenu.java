package homework14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 로또 번호 추첨 =====");
			System.out.println("원하시는 메뉴의 번호를 입력하세요.");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 추첨 대상 목록 조회");
			System.out.println("4. 당첨 대상 구성");
			System.out.println("5. 정렬된 당첨 대상 확인");
			System.out.println("6. 당첨 대상 검색");
			System.out.println("9. 종료");
	   	
		   	System.out.print("메뉴 번호: ");
		   	int num = sc.nextInt();
		   	
		   	switch (num) {
	        case 1: insertObject(); break;
	        case 2: deleteObject(); break;
	        case 3: searchObject(); break;
	        case 4: winObject(); break;
	        case 5: sortedWinObject(); break;
	        case 6: searchWinner(); break;
	        case 9:
	            System.out.println("프로그램을 종료합니다.");
	            return;
        default:
            System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
		   	}
		}
	}
	
	public void insertObject() {
		System.out.println("===== 1. 추첨 대상 추가 =====");
		System.out.print("추가할 추첨 대상 수 :");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("휴대폰 번호(-빼고) : ");
			String pn = sc.next();
			
			Lottery lottery = new Lottery(name, pn);
			boolean result = lc.insertObject(lottery);
			if (!result) {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
				continue;
			}
		}
			System.out.println(num + "명 추가 완료했습니다.");

	}
	
	public void deleteObject() {
		System.out.println("===== 2. 추첨 대상 삭제 =====");
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("휴대폰 번호(-빼고) : ");
		String pn = sc.next();
		Lottery lottery = new Lottery(name, pn);
		boolean result = lc.deleteObject(lottery);
		if (result == true) {
			System.out.println("삭제 완료되었습니다.");
		}else {
			System.out.println("존재하지 않는 대상입니다.");
		}
	}
	
	public void searchObject() {
		System.out.println("===== 3. 추첨 대상 목록 조회 =====");
		Set<Lottery> list = lc.searchObject();
		for (Lottery l : list) {
            System.out.println(l);
		}
	}
	
	public void winObject() {
		System.out.println("===== 4. 당첨 대상 구성 =====");
		Set<Lottery> win = lc.winObject();
		if (win != null) {
			System.out.println("당첨자 목록:");
	        for (Lottery l : win) {
	            System.out.println(" - " + l);
	        }
		}else {
			System.out.println("추첨 대상이 4명이상이어야 당첨 대상을 구성할 수 있습니다.");
		}
	}
	
	public void sortedWinObject() {
		System.out.println("===== 5. 정렬된 당첨 대상 확인 =====");
		Set<Lottery> sorted = lc.sortedWinObject();
	    if (sorted == null || sorted.isEmpty()) {
	        System.out.println("당첨자가 없습니다.");
	        return;
	    }

	    Iterator<Lottery> it = sorted.iterator();
	    System.out.println("=== 정렬된 당첨자 목록 ===");
	    while (it.hasNext()) {
	        System.out.println(it.next());
	    }
	}
	
	public void searchWinner() {
		System.out.println("===== 6. 당첨 대상 검색 =====");
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름");
		String name = sc.next();
		System.out.print("휴대폰 번호(-빼고) : ");
		String pn = sc.next();
		Lottery lottery = new Lottery(name, pn);
		boolean result = lc.searchWinner(lottery);
		if (result == true) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("다음 기회에!");
		}
		
	}
	
	
}
