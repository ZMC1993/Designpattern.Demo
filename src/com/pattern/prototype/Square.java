package com.pattern.prototype;

public class Square extends Shape {
	public Square() {
		System.out.println("Square is init");
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Square.draw is run");
	}
	
}
