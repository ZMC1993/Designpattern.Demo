package com.pattern.nullObject;

public class NullObjectMain {
	public static void main(String[] args) {
		CustomerFactory cf=new CustomerFactory();
		System.out.println(cf.getCustomer("name").getName());
		System.out.println(cf.getCustomer("name1").getName());
	}
}
