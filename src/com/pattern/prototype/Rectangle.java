package com.pattern.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		System.out.println("Rectangle is init");
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle.draw is run");
	}
}
