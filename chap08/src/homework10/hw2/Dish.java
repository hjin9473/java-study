package homework10.hw2;

public class Dish extends Menu{
	String ingredients;
	
	
	public Dish(String ingredients) {
		super("오", 5);
		this.ingredients = ingredients;
	}

	@Override
	public void cook() {
		System.out.println("재료는" + ingredients+"입니다.");
	}
	

}
