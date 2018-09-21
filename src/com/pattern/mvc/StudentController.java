package com.pattern.mvc;

public class StudentController {
	private Student student;
	private StudentView studentView;
	
	public StudentController(Student student,StudentView studentView) {
		this.student=student;
		this.studentView=studentView;
	}
	
	public void setName(String name) {
		student.setName(name);
	}
	
	public void setRollNo(String rollNo) {
		student.setRollNo(rollNo);
	}
	
	public void updateView() {
		studentView.printStudent(student);
	}
}
