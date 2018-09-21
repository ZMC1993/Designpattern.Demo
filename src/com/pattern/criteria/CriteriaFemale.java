package com.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
	private List<Person> persons;
	public CriteriaFemale(List<Person> persons) {
		this.persons=persons;
		
	}

	@Override
	public List<Person> meetCriteria() {
		// TODO Auto-generated method stub
		List<Person> result=new ArrayList<Person>();
		
		for(Person p:persons) {
			if(p.getGender().equals("female")) {
				result.add(p);
			}
		}
		
		return result;
	}

}
