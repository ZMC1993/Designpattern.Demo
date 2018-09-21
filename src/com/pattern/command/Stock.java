package com.pattern.command;

public class Stock {
	private String name;
	private int quantity;
	public Stock(String name ,int quantity) {
		this.name=name;
		this.quantity=quantity;
		
	}
	
	public void sell() {
		System.out.println(name+" sell :"+quantity);
	}
	
	public void buy() {
		System.out.println(name+" buy :"+quantity);
	}
}
