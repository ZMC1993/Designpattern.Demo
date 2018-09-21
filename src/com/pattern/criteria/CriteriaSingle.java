package com.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
	private List<Person> persons;
	public CriteriaSingle(List<Person> persons) {
		this.persons=persons;
	}
	@Override
	public List<Person> meetCriteria() {
		// TODO Auto-generated method stub
		List<Person> result=new ArrayList<Person>();
		for(Person p:persons) {
			if(p.getMaritalStatus().equals("single")) {
				result.add(p);
			}
		}
		return result;
	}

}
