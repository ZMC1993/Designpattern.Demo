package com.pattern.dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	private List<Student> students=new ArrayList<Student>();
	
	public StudentDaoImpl() {
		students.add(new Student("name1",1));
		students.add(new Student("name2",2));
	}
	
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return students;
	}

	@Override
	public void update(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(Student s) {
		// TODO Auto-generated method stub
		students.add(s);
	}

	@Override
	public void delete(Student s) {
		// TODO Auto-generated method stub
		students.remove(s);
	}

}
