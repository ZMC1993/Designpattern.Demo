package com.pattern.dao;

import java.util.List;

public interface StudentDao {
	List<Student> getStudents();
	void update(Student s);
	void insert(Student s);
	void delete(Student s);
}
