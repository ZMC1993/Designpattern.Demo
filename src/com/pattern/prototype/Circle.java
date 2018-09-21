package com.pattern.prototype;

public class Circle extends Shape {

	public Circle() {
		System.out.println("Circle is init");
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle.draw is run");
	}
}
