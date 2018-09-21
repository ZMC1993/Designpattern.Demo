package com.pattern.mvc;

public class MVCMain {
	public static void main(String[] args) {
		StudentController sc=new StudentController(getStudentFromDatabase(),new StudentView());
		sc.updateView();
		sc.setName("name2");
		sc.updateView();
		
	}
	private static Student getStudentFromDatabase() {
		Student s=new Student();
		s.setName("name1");
		s.setRollNo("1111");
		return s;
	}
}
