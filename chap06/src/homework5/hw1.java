package homework5;

import java.util.Arrays;
import java.util.Iterator;

public class hw1 {
	public static void main(String[] args) {
		int [] hi =new int[] {152, 180, 165, 158, 171};
		int temp = 0;
		
		for (int i = 0; i < hi.length - 1; i++) {
			for (int j = 0; j < hi.length -1 -i; j++) {
			if (hi[j] > hi[j+1]) {
				temp = hi[j];
				hi[j] = hi[j+1];
				hi[j+1] = temp;
			}
			}
		}
		System.out.println(Arrays.toString(hi));
		
		
	}

}
