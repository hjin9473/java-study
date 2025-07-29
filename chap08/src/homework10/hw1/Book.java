package homework10.hw1;

public class Book extends Product{

	public Book() {
		super("자바의정석", 15000);
	}
	
	
	
	
	
	
	
	@Override
	int calculatePrice() {
		return (getPrice()/100) * 90;
	}

}
