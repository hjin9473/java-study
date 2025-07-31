package homework11.hw3;

import java.util.Scanner;

public class CharacterMenu {
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();

        CharacterController controller = new CharacterController();

        try {
            int count = controller.countAlpha(input);
            System.out.println("영문자는 " + count + "개입니다.");
        } catch (CharCheckException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }
}
