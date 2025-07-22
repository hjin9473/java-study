package homework5;

import java.util.Random;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        String[] choices = {"가위", "바위", "보"};
        int win = 0, draw = 0, lose = 0, total = 0;

        while (true) {
            System.out.print("가위바위보: ");
            String mine = sc.next();

            if (mine.equals("stop")) {
                System.out.printf("%d전 %d승 %d무 %d패\n", total, win, draw, lose);
                break;
            }
 
            if (!(mine.equals("가위") || mine.equals("바위") || mine.equals("보"))) {
                System.out.println("잘못입력하였습니다");
                continue;
            }

            int num = ran.nextInt(3);
            String computer = choices[num];

            System.out.println("사용자: " + mine);
            System.out.println("컴퓨터: " + computer);

            if (mine.equals(computer)) {
                System.out.println("비겼습니다");
                draw++;
            } else if (
                (mine.equals("가위") && computer.equals("보")) ||
                (mine.equals("바위") && computer.equals("가위")) ||
                (mine.equals("보") && computer.equals("바위"))
            ) {
                System.out.println("이겼습니다");
                win++;
            } else {
                System.out.println("졌습니다");
                lose++;
            }
            total++;
            System.out.println();
        }
        sc.close();
    }
}
