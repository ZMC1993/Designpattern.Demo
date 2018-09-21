package com.pattern.factory;

public class ShapeFactory {
	public static Shape getShape(String shapeType) {
		if(shapeType.isEmpty()) {
			return null;
		}
		switch(shapeType) {
		case "Rectangle":{
			return new Rectangle();
		}
		case "Square":{
			return new Square();
		}
		case "Circle":{
			return new Circle();
		}
		default:{
			return null;
		}
		}
	}
}
