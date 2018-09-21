package com.pattern.dao;

public class DaoMain {
	public static void main(String[] args) {
		StudentDao sd=new StudentDaoImpl();
		for(Student s:sd.getStudents()) {
			System.out.println("name:"+s.getName()+" ,rollNo:"+s.getRollNo());
		}
		sd.insert(new Student("name3",3));
		for(Student s:sd.getStudents()) {
			System.out.println("name:"+s.getName()+" ,rollNo:"+s.getRollNo());
		}
	}
}
