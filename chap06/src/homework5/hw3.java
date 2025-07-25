package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		while (num % 2 == 0) {
		System.out.println("다시 입력하세요.");
		System.out.print("정수: ");
		num = sc.nextInt();
		
		if (num % 2 != 0) {
			break;			
		}
		}
		int[] updw = new int[num];
		int h = updw.length / 2;
		
		int k = 1;
		for (int i = 0; i <= h; i++) {
			updw[i] = k;
			k++;
		}
		for (int j = h+1; j < updw.length; j++) {
			updw[j] = h;
			h--;
		}
		System.out.println(Arrays.toString(updw));
		
		
	}



		
		
		
		
		

}
