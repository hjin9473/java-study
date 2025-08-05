package homework14;

import java.util.Objects;

public class Lottery {
	String name;
	String phone;
	
	public Lottery() {}

	public Lottery(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Lottery [name=" + name + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	public int compareTo(String anotherString) {
		return name.compareTo(anotherString);
	}
	
	
	
	

}
