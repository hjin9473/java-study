package homework5;

import java.util.Arrays;
import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int num = sc.nextInt();
		
		int[] arr1 = new int[num];
		int sum = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			int k = 0;
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값: ");
			k = sc.nextInt();
			arr1[i] = k;
			sum += k;
		}
		
		System.out.println(Arrays.toString(arr1));
		System.out.println("총합: " + sum);
		
		
		
		
	}

}
