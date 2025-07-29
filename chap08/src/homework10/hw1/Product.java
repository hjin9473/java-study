package homework10.hw1;

public abstract class Product {
	private String name;
	private int price;
	
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	abstract int calculatePrice();
	
	
	

}
