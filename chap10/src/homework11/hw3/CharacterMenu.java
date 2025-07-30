package homework11.hw3;

import java.util.Iterator;

public class CharacterMenu {
	public void menu(String a) {
		try {
			for (int i = 0; i < a.length(); i++) {
				char ch = a.charAt(i);
				if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
