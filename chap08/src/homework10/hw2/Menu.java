package homework10.hw2;

public abstract class Menu {
	private String name;
	private int price;
	
	void menu() {}
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	

	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	
	public String toString() {
		return "메뉴명은 " + name + "이고, 가격은 " + price + "원입니다.";
	}
	
	public abstract void cook();
	
	
	

}
