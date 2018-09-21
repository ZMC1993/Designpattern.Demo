package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
	private List<Order> orders=new ArrayList<Order>();
	
	public void add(Order order) {
		orders.add(order);
	}
	
	public void excuet() {
		for(Order o:orders) {
			o.excute();
		}
	}
	
	
}
