package com.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMain {
	public static void main(String[] args) {
		List<Person> persons=new ArrayList<Person>();
		persons.add(new Person("name1","male","single"));
		persons.add(new Person("name2","female","single"));
		persons.add(new Person("name3","female","notsingle"));
		persons.add(new Person("name4","male","single"));
		persons.add(new Person("name5","male","notsingle"));
		persons.add(new Person("name6","female","single"));
		persons.add(new Person("name7","male","single"));
		persons.add(new Person("name8","male","notsingle"));
		persons.add(new Person("name9","male","single"));
		
		List<Person> p1=new CriteriaMale(persons).meetCriteria();
		System.out.println("male:");
		for(Person p:p1) {
			System.out.println(p.getName());
		}
		
		List<Person> p2=new CriteriaFemale(persons).meetCriteria();
		System.out.println("female:");
		for(Person p:p2) {
			System.out.println(p.getName());
		}
		
		List<Person> p3=new CriteriaSingle(persons).meetCriteria();
		System.out.println("single:");
		for(Person p:p3) {
			System.out.println(p.getName());
		}
		
		List<Person> p4=new AndCriteria(new CriteriaMale(persons),new CriteriaSingle(persons)).meetCriteria();
		System.out.println("male and single:");
		for(Person p:p3) {
			System.out.println(p.getName());
		}
	}
}
