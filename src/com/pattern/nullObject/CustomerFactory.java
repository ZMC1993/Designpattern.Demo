package com.pattern.nullObject;

import java.util.ArrayList;
import java.util.List;

public class CustomerFactory {
	private List<String> names=new ArrayList<String>();
	public CustomerFactory() {
		names.add("name1");
		names.add("name2");
		names.add("name3");
	}
	
	public AbstractCustomer getCustomer(String name) {
		return names.contains(name)?new RealCustomer(name):new NullCustomer();
	}
}
