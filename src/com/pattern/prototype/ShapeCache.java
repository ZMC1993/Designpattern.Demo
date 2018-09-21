package com.pattern.prototype;

import java.util.HashMap;

public class ShapeCache {
	private HashMap<String,Shape> shapes=new HashMap<String,Shape>();
	
	public ShapeCache() {
		shapes.put("Circle", new Circle());
		shapes.put("Square", new Square());
		shapes.put("Rectangle", new Rectangle());
	}
	
	public Shape getShape(String key) {
		if(shapes.containsKey(key)) {
			return (Shape)shapes.get(key).clone();			
		}
		return null;
	}
}
