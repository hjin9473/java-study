package homework10.hw1;

public class Food extends Product{
	int day;

	public Food(int day) {
		super("치킨", 20000);
		this.day = day;
	}
	public int getDay() {
		return day;
	}
	
	public int calculateDiscountRate() {
		if (day <= 3) return 30;
        else if (day <= 7) return 10;
        else return 0;
	}
	
	@Override
	int calculatePrice() {
		return (((getPrice()/100)* 100-calculateDiscountRate())/(100)) * 90;
	}

}
