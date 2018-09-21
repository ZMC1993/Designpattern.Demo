package com.pattern.factory;

public class FactoryMain {
	public static void main(String[] args) {
		Shape circle=ShapeFactory.getShape("Circle");
		Shape rectangle=ShapeFactory.getShape("Rectangle");
		Shape square=ShapeFactory.getShape("Square");
		circle.draw();
		rectangle.draw();
		square.draw();
		
	}
}
