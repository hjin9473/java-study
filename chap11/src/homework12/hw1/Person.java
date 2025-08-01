package homework12.hw1;

public class Person {
	private String name;
	private int age;
	private String address;
	private char gender;
	
	Person() {}
	
	Person(String name, int age, String address, char gender) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.gender = gender;
	}
	
	public String toString() {
		return name + ", " + age + ", " + address + ", " + gender;
		
	}
	String getName(String a) {
		return name;
	}
	int getAge(String a) {
		return age;
	}
	String getAddress(String a) {
		return address;
	}
	char getGender(String a) {
		return gender;
	}
	
	
	
	
}
