package homework5;

import java.util.Arrays;

public class hw7 {
	public static void main(String[] args) {
		String[] report = {"Introduction", "Research", "Conclusion"};
		System.out.println("원본 보고서:" + Arrays.toString(report));
		
		String[] cp = Arrays.copyOf(report, report.length);
		cp[0] ="Team Feedback"; 
		System.out.println("복사된 보고서" + Arrays.toString(cp));
		
		
	}

}
