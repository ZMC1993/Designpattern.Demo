package com.pattern.mvc;

public class StudentView {
	public void printStudent(Student s) {
		System.out.println("Student:");
		System.out.println("rollNo:"+s.getRollNo());
		System.out.println("name:"+s.getName());
	}
}
