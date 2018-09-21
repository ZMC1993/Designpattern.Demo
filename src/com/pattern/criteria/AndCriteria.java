package com.pattern.criteria;

import java.util.List;

public class AndCriteria implements Criteria {
	private Criteria criteria;
	private Criteria otherCriteria;
	public AndCriteria(Criteria criteria,Criteria otherCriteria) {
		this.criteria=criteria;
		this.otherCriteria=otherCriteria;
	}
	@Override
	public List<Person> meetCriteria() {
		// TODO Auto-generated method stub
		List<Person> result=criteria.meetCriteria();
		for(Person p: otherCriteria.meetCriteria()) {
			if(!result.contains(p)) {
				result.remove(p);
			}
		}
		
		return result;
	}
}
