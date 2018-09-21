package com.pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
	private static HashMap<String,Shape> shapes=new HashMap<String,Shape>();
	
	public static Shape getCircle(String color) {
		Circle circle=(Circle)shapes.get(color);
		if(circle==null) {
			circle=new Circle(color);
			shapes.put(color, circle);
			System.out.println("Create a "+color+" circle");
		}
		return circle;
	}
}
