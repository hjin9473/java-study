package homework10.hw2;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		Menu[] arr = new Menu[5];
		
		arr[0] = new Dish("전");
		arr[1] = new Drink("전");
		arr[2] = new Dish("전");
		arr[3] = new Drink("전");
		arr[4] = new Dish("전");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].cook();
		}
		
	}

}
