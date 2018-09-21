package com.pattern.flyweight;

public class Circle implements Shape {
	private int x;
	private int y;
	private int radius;
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	private String color;
	
	public Circle(String color) {
		this.color=color;
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw a"+color+" circle in X:"+x+" Y:"+y+" by radus is "+radius);
	}

}
