package com.pattern.criteria;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
	private List<Person> persons;
	public CriteriaMale(List<Person> persons) {
		this.persons=persons;
	}
	
	@Override
	public List<Person> meetCriteria() {
		// TODO Auto-generated method stub
		List<Person> result=new ArrayList<Person>();
		
		for(Person p: persons) {
			if(p.getGender().equals("male")) {
				result.add(p);
			}
		}
		
		return result;
	}

}
