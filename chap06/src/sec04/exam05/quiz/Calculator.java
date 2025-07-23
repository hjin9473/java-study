package sec04.exam05.quiz;

public class Calculator {
	int getEvenTotal(int begin, int end) {
		int total = 0;
		for (int i = begin; i <= end; i++) {
			if (i % 2 == 0) {
				total += i;
			}
		}
		return total;
		
	
	}
}

