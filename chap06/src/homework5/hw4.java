package homework5;

import java.util.Arrays;
import java.util.Random;

public class hw4 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random ran = new Random();
		
		for (int k = 0; k < lotto.length; k++) {
			lotto[k] = ran.nextInt(45) + 1;
			for (int m = 0; m < k; m++) {
				if (lotto[m] == lotto[k]) {
					lotto[k] = ran.nextInt(45) + 1;
				}
			}
		}
		int temp = 0;
		for (int i = 0; i < lotto.length - 1; i++) {
			for (int j = 0; j < lotto.length -1 -i; j++) {
			if (lotto[j] > lotto[j+1]) {
				temp = lotto[j];
				lotto[j] = lotto[j+1];
				lotto[j+1] = temp;
			}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
		
	}
}
