package homework9.Stu_Peo;

public abstract class Person {
	
	private int age;
	private double height;
	private double weight;
	
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	public abstract void Person();
	
	public abstract String toString();
	
	
	
	
	
}
