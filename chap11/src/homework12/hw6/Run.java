package homework12.hw6;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = "the quick brown fox jumps over the lazy dog";
		System.out.print("단어를 입력하세요: ");
		String quest = sc.next();
        
        int index = sentence.indexOf(quest);
        
        if (index != -1) {
            int start = index + quest.length();
            
            if (start < sentence.length()) {
                int next = sentence.indexOf(" ", start + 1);
                
                if (next != -1) {
                    System.out.println(sentence.substring(start, next));
                } else {
                    System.out.println(sentence.substring(start));
                }
            } else {
                System.out.println("마지막단어입니다.");
            }
        } else {
            System.out.println("없는단어입니다.");
        }

		
	}

}
