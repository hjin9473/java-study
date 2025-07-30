package homework10.hw2;

public class Drink extends Menu{
String recipe;
	public Drink(String recipe) {
		super("오", 5);
		this.recipe = recipe;
	}
	@Override
	public void cook() {
		System.out.println("레시피는" + recipe+"입니다.");
		
	}
	

}
