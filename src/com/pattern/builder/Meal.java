package com.pattern.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> itemlist=new ArrayList<Item>();
	
	public void addItem(Item e) {
		itemlist.add(e);
	}
	
	public float getPrice() {
		float price=0.0f;
		for(Item e:itemlist) {
			price+=e.price();
		}		
		return price;
	}
	
	public void show() {
		for(Item e:itemlist) {
			System.out.printf("名称：%s,包装：%s，价格：%f%n",e.name(),e.packing().pack(),e.price());
		}
	}	
}
