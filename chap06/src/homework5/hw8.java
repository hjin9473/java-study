package homework5;

import java.util.Arrays;

public class hw8 {
	public static void main(String[] args) {
		String[] menu = {"Burger", "Pizza", "Pasta"};
		String[] add = {"Salad","Soup"};
		String[] today = Arrays.copyOf(menu, menu.length + 2);


		for (int i = 0; i < add.length; i++) {
			String food = add[i];
			today[menu.length + i] = food;
		}
		System.out.println("어제 메뉴판:" + Arrays.toString(menu));
		System.out.println("오늘 메뉴판:" + Arrays.toString(today));
		
		
		
	}

}
