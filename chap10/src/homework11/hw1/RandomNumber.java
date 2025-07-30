package homework11.hw1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int num = rand.nextInt(50) + 1;
		int count = 0;
		while(true) {
			try {
				int ans = sc.nextInt();
				count++;

                if (ans < 1 || ans > 50) {
                    System.out.println("1부터 50 사이의 숫자만 입력해주세요.");
                    continue;
                }

                if (ans < num) {
                    System.out.println("Up!");
                } else if (ans > num) {
                    System.out.println("Down!");
                } else {
                    System.out.println("축하합니다~ 정답이에요");
                    System.out.println("총 시도 횟수: " + count + "번");
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("잘못된 값입니다. 숫자를 입력해주세요.");
                sc.nextLine();
            }
			
			
			
			
			
			
		}
		
		
		
		
	}

}
