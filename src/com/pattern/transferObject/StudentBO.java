package com.pattern.transferObject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
	private List<StudentVO> students;
	
	public StudentBO() {
		students=new ArrayList<StudentVO>();
		students.add(new StudentVO("name1",1));
		students.add(new StudentVO("name2",2));
		students.add(new StudentVO("name3",3));
		students.add(new StudentVO("name4",4));
	}
	
	public List<StudentVO> getStudents(){
		return students;
	}
	
	public StudentVO getStudent(int index) {
		return students.get(index);
	}
	
	public void delete(StudentVO student) {
		students.remove(student.getRollNo());
	}
}
