package com.pattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(Shape shape) {
		super(shape);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void draw() {
		super.draw();
		setRedBorder(super.shape);
	}
	
	private void setRedBorder(Shape shape) {
		System.out.println(" by red border");
	}
	
}
