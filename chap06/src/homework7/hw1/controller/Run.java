package homework7.hw1.controller;

import homework7.hw1.model.Employee;

public class Run {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		emp1.name = "김철수";
		emp2.name = "이영희";
		emp1.team = "교육운영팀";
		emp2.team = "경영지원팀";
		
		System.out.println("이름: " + emp1.name + ", 팀: " + emp1.team);
		System.out.println("이름: " + emp2.name + ", 팀: " + emp2.team);
		
	}

}
